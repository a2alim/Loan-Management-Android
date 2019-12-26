package com.exam.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.ApplyLoan;
import com.exam.model.UserInfo;
import com.exam.service.ApplyLoanServiceImpl;

@RestController
public class applyloanctrl {
	
	@Autowired
	ApplyLoanServiceImpl applyLoanServiceImpl;
	
	@PostMapping("/saveloan")
	public ModelAndView createLoan(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		String fname = request.getParameter("fName");
		String lname = request.getParameter("lName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String loanAmount = request.getParameter("loanAmount");
		String category = request.getParameter("category");
		String address = request.getParameter("address");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String inatallmentType = request.getParameter("inatallmentType");
		
		long installmentAmount;
		int totalInstallment;
		Long totalPayableAmount=0L;
		
		if(inatallmentType.equals("Weekly")) {
			installmentAmount = Long.parseLong(loanAmount) /40;
			totalInstallment=44;
			totalPayableAmount = installmentAmount*totalInstallment;
		}else{
			installmentAmount = Long.parseLong(loanAmount) /10;
			totalInstallment = 11;
		}
		
		ApplyLoan applyLoan = new ApplyLoan();
		
		applyLoan.setFirstName(fname);
		applyLoan.setLastName(lname);
		applyLoan.setEmail(email);
		applyLoan.setPhone(phone);
		applyLoan.setLoanAmount(Long.parseLong(loanAmount));
		applyLoan.setCategory(category);
		applyLoan.setAddress(address);
		applyLoan.setUsername(username);
		applyLoan.setPassword(password);
		applyLoan.setInstallmentType(inatallmentType);
		applyLoan.setInstallmentAmount(installmentAmount);
		applyLoan.setTotalInstallment(totalInstallment);
		applyLoan.setTotalPayableAmount(totalPayableAmount);
		applyLoan.setCreatedDate(new Date());
		applyLoan.setStatus("pending");
		
		applyLoan = applyLoanServiceImpl.save(applyLoan);
		if(applyLoan != null) {
			model.put("success", "success");
			model.put("msg", "Succesfully applied for loan.");
			model.put("entityContact", applyLoan);
			return new ModelAndView("pages/applyforloan", model);
		}
		
		return new ModelAndView("pages/applyforloan", model);
	}
	
	@GetMapping(value = "/pending-loan")
	public ModelAndView showPendingLoan() {
		Map<String, Object> model = new HashMap<>();
		List<ApplyLoan> pendinLoanList = applyLoanServiceImpl.getAll();
		model.put("pendinLoanList", pendinLoanList);
		return new ModelAndView("pages/adpending-loan", model);
	}
	
	
	@GetMapping("/pending-loan/{id}")
	public ModelAndView getPendingLoan(@PathVariable("id") int id) {
		Map<String, Object> model = new HashMap<>();
		ApplyLoan pendingloan = applyLoanServiceImpl.getById(id);
		model.put("pendingLoan", pendingloan);
		return new ModelAndView("pages/pending-loan-show", model);
	}
	
	
	@GetMapping(value = "/admanage-loan")
	public ModelAndView manageLoan() {
		
		Map<String, Object> model = new HashMap<>();
		
		List<ApplyLoan> loanList = applyLoanServiceImpl.getAllLoan();
		model.put("loanList", loanList);
		return new ModelAndView("pages/admanage-loan", model);
	}
	
	@RequestMapping("/status/{status}/{id}")
	public ModelAndView updatePendingLoan(@PathVariable ("status") String status, @PathVariable ("id") long id) {
		
		applyLoanServiceImpl.updateLoan(id, status);
		
		return new ModelAndView("pages/pending-loan-show");
		
	}						
	@GetMapping(value = "/user-loan-status/{currentUser}")
	public ModelAndView showUserLoanStatus(@PathVariable("currentUser") String currentUser) {
		
		Map<String, Object> model = new HashMap<>();
		
		List<ApplyLoan> creckLoanList = applyLoanServiceImpl.getUserLoanStatus(currentUser);
		model.put("checkLoanList", creckLoanList);
		return new ModelAndView("pages/user-loan-status", model);
	}
	
	@GetMapping("/delete-loan/{id}")
	public ModelAndView deleteUserInfo(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		 boolean deleteLoan = applyLoanServiceImpl.delete(id);
		 
		 if (deleteLoan) {
				model.put("success", true);
				model.put("msg", "Delete Successful");
				List<ApplyLoan> loanList = applyLoanServiceImpl.getAllLoan();
				model.put("loanList", loanList);
			return new ModelAndView("pages/admanage-loan", model);
			}else {
				model.put("error", false);
				model.put("msg", "Delete failed");
				return new ModelAndView("pages/admanage-loan", model);
			}
	}
	
	@GetMapping("/edit-loan/{id}")
	public ModelAndView edit(@PathVariable long id) {
		Map<String, Object> model = new HashMap<>();
		ApplyLoan entity = applyLoanServiceImpl.getById(id);
		model.put("loan", entity);
		return new ModelAndView("pages/adedit-loan", model);
	}
	
	@PostMapping("/update-loan")
	public ModelAndView updateUser(HttpServletRequest request) throws ParseException {
		Map<String, Object> model = new HashMap<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String id = request.getParameter("loanId");
		Long loanId = Long.parseLong(id);
		ApplyLoan entity = applyLoanServiceImpl.getById(loanId);
		
		long uid=Long.parseLong(id);
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String loanAmount = request.getParameter("loanAmount");
		String category = request.getParameter("category");
		String inatallmentType = request.getParameter("inatallmentType");
	
		long installmentAmount;
		int totalInstallment;
		Long totalPayableAmount=0L;
		
		if(inatallmentType.equals("Weekly")) {
			installmentAmount = Long.parseLong(loanAmount) /40;
			totalInstallment=44;
			totalPayableAmount = installmentAmount*totalInstallment;
		}else{
			installmentAmount = Long.parseLong(loanAmount) /10;
			totalInstallment = 11;
			totalPayableAmount = installmentAmount*totalInstallment;
		}
		
		ApplyLoan applyLoan = new ApplyLoan();
		applyLoan.setLoanId(loanId);
		applyLoan.setFirstName(fName);
		applyLoan.setLastName(lName);
		applyLoan.setEmail(email);
		applyLoan.setPhone(phone);
		applyLoan.setAddress(address);
		applyLoan.setPassword(password);
		applyLoan.setUsername(username);
		applyLoan.setLoanAmount(Long.parseLong(loanAmount));
		applyLoan.setCategory(category);
		applyLoan.setInstallmentType(inatallmentType);
		applyLoan.setCreatedDate(entity.getCreatedDate());
		applyLoan.setUpdateDate(new Date());
		applyLoan.setInstallmentAmount(installmentAmount);
		applyLoan.setTotalInstallment(totalInstallment);
		applyLoan.setStatus(entity.getStatus());
		applyLoan.setTotalPayableAmount(totalPayableAmount);
		applyLoanServiceImpl.update(applyLoan);

		if (applyLoan != null) {
			model.put("success", true);
			model.put("msg", "Update Successful");
			List<ApplyLoan> entityList  = applyLoanServiceImpl.getAllLoan();
			model.put("loanList", entityList);
			return new ModelAndView("pages/admanage-loan", model);
		}else {
			model.put("error", false);
			model.put("msg", "Update failed");
			return new ModelAndView("pages/admanage-loan", model);
		}
	}
	
	
	@GetMapping(value = "/pending-loon")
	public List<ApplyLoan> showPendingLoon() {
		
		List<ApplyLoan> pendinLoanList = applyLoanServiceImpl.getAll();
		
		return pendinLoanList;
	}
	
	
	
}
