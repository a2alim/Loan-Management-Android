package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.commerz.SSLCommerz;
import com.exam.commerz.Utility.ParameterBuilder;
import com.exam.model.ApplyLoan;
import com.exam.model.Installment;
import com.exam.service.ApplyLoanServiceImpl;
import com.exam.service.InstallmentServiceImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class InslallmentCtrl {

	@Autowired
	InstallmentServiceImpl installmentServiceImpl;

	@Autowired
	ApplyLoanServiceImpl applyLoanServiceImpl;

	@GetMapping(value = "/user-installment")
	public ModelAndView userInstallment() {
		return new ModelAndView("/pages/user-installment");
	}

	@GetMapping(value = "/installment-status")
	public ModelAndView installmentStatus() {
		return new ModelAndView("pages/installment-status");
	}

	
	
	@PostMapping("/save-installment")
	public ModelAndView createLoan(HttpServletRequest request) {
		
		Map<String, Object> model = new HashMap<>();
		Map<String, String> postData = ParameterBuilder.constructRequestParameters();
		
		System.out.println(postData);
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String loanId = request.getParameter("loanId");
		String loanAmount = request.getParameter("loanAmount");
		String installmentAmount = request.getParameter("installmentAmount");
		String category = request.getParameter("category");
		
		String paybleInstallment = request.getParameter("paybleInstallment");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String currency = request.getParameter("currency");
		String transectionId = request.getParameter("transectionId");
		
		double showtransectionId = (Math.random()*((99999999-0)+1))+0;
		
		
		
		List<Installment> installmentList = (List<Installment>) installmentServiceImpl.getByLoanId(Long.parseLong(loanId));
		
		System.out.println(installmentAmount);
		Long totalPaid=Long.parseLong(installmentAmount);
		for (Installment installment : installmentList) {
			totalPaid += installment.getInstallmentAmount();
		}
		Long totalPayable= Long.parseLong(loanAmount)-totalPaid;

		Installment installment = new Installment();

		installment.setName(name);
		installment.setUsername(username);
		installment.setEmail(email);
		installment.setAddress(address);
		installment.setLoanAmount(Long.parseLong(loanAmount));
		installment.setLoanId(Long.parseLong(loanId));
		installment.setInstallmentAmount(Long.parseLong(installmentAmount));
		installment.setCategory(category);
		installment.setInstallmentDate(new Date());
		installment.setTotalPaid(totalPaid);
		installment.setTotalPayable(totalPayable);
		
		installment = installmentServiceImpl.save(installment);
		
		
		if (installment != null) {
			model.put("success", "success");
			model.put("msg", "Succesfully Paid Istallment.");
			model.put("installment", installment);
			return new ModelAndView("pages/user-installment", model);
		}else {
			model.put("msg", "Failed Paid Istallment.");
			return new ModelAndView("pages/user-installment", model);
		}

		
	}

	
	@GetMapping("/adsearch-installment")
	public ModelAndView getInstallmentById(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String id = request.getParameter("searchloanId");
		Long installmentId = Long.parseLong(id);
		ApplyLoan applyLoan = applyLoanServiceImpl.getById(Long.parseLong(id));
		List<Installment> installmentList =(List<Installment>) installmentServiceImpl.getByLoanId(installmentId);
		

		
		if (!installmentList.isEmpty() && !applyLoan.toString().isEmpty()) {
			
			model.put("installmentListView", installmentList);
			model.put("totalInstallment", applyLoan.getTotalInstallment());
			return new ModelAndView("pages/admanage-installment", model);
		}else {
			model.put("msg", "Loan ID not found. Please try again.");
			return new ModelAndView("pages/admanage-installment", model);
		}
		
		
	}
	
	
	
	@GetMapping("/loaninfo-search")
	public ModelAndView getLoanById(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String id = request.getParameter("earchloanId");
		Long loanId = Long.parseLong(id);

		double showtransectionId = (Math.random()*((99999999-0)+1))+0;

		System.out.println(showtransectionId);
		

		ApplyLoan loaninfo = applyLoanServiceImpl.getById(loanId);
		model.put("loaninfo", loaninfo);
		model.put("showtransectionId", showtransectionId);
		System.out.println(loaninfo);
		return new ModelAndView("pages/user-installment", model);
	}
	
	
	@GetMapping("/get-installment-status")
	public ModelAndView getInstallmentStatusById(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();

		String id = request.getParameter("earchloanId");
		Long loanId = Long.parseLong(id);

		List<Installment> installmentList = installmentServiceImpl.getByLoanId(loanId);
		
		model.put("installmentList", installmentList);
		return new ModelAndView("pages/installment-status", model);
	}
	
	@GetMapping("/card-payement")
	public ModelAndView cardPayment(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
//
//		String id = request.getParameter("earchloanId");
//		Long loanId = Long.parseLong(id);
//
//		List<Installment> installmentList = installmentServiceImpl.getByLoanId(loanId);
		
		model.put("msg", "Payement Successfull.");
		return new ModelAndView("pages/user-installment", model);
	}

	
	
	@PostMapping("/ssl-success-page")
	public ModelAndView sslPaymentSuccess() {
		Map<String, Object> model = new HashMap<>();

		System.out.println("SSL Successfull.");
		model.put("msg", "SSL Payement successful");
		return new ModelAndView("pages/user-installment", model);
	}
	
	
}
