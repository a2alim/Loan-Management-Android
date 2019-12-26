package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.commerz.Utility.ParameterBuilder;
import com.exam.model.ApplyLoan;
import com.exam.model.Contact;
import com.exam.model.Installment;
import com.exam.model.UserInfo;
import com.exam.service.ApplyLoanServiceImpl;
import com.exam.service.ContactServiceImpl;
import com.exam.service.InstallmentServiceImpl;
import com.exam.service.UserInfoService;
import com.exam.service.UserInfoServiceImpl;

@RestController
@RequestMapping("")
public class AndroidRestController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	ContactServiceImpl contactServiceImpl;
	
	@Autowired
	UserInfoService userInfoService;
	
	@Autowired
	InstallmentServiceImpl installmentServiceImpl;
	
	@Autowired
	ApplyLoanServiceImpl applyLoanServiceImpl;
	
	
	@GetMapping("/get-user-by/{user}/{password}")
	public List<UserInfo> getUserByUsername(@PathVariable ("user") String user, @PathVariable ("password") String password){
		
		List<UserInfo> userInfo = userInfoService.getByUsername(user);
		String pass = userInfo.get(0).getPassword();
		boolean p =passwordEncoder.matches(password, pass);
		
		if(p) {
			System.out.println(userInfo+"::::::::::::::::::::::::::::::::::::::"+p);
			return userInfo;
			
		}else {
			System.out.println(userInfo+"::::::::::::::::::::::::::::::::::::::"+p);
			return null;
			
		}
		
	}
	
	
	@PostMapping("/save-loaninfo")
	public ApplyLoan saveLoan(@RequestBody ApplyLoan applyLoan, BindingResult results) {
		
		long loanAmount = applyLoan.getLoanAmount();
		String inatallmentType=applyLoan.getInstallmentType();
		long installmentAmount;
		int totalInstallment;
		Long totalPayableAmount=0L;
		
		if(inatallmentType.equals("Weekly")) {
			installmentAmount = loanAmount /40;
			totalInstallment=44;
			totalPayableAmount = installmentAmount*totalInstallment;
		}else {
			installmentAmount = loanAmount/10;
			totalInstallment = 11;
			totalPayableAmount = installmentAmount*totalInstallment;
		}
		
		applyLoan.setInstallmentAmount(installmentAmount);
		applyLoan.setTotalInstallment(totalInstallment);
		applyLoan.setTotalPayableAmount(totalPayableAmount);
		applyLoan.setStatus("Pending");
		
		
		if (!results.hasErrors()) {
			applyLoan.setCreatedDate(new Date());
			System.out.println(applyLoan+"::::::::::::::::::::::::::::::::::::::");
			return applyLoanServiceImpl.save(applyLoan);
		}
		return null;

	}

	@GetMapping("/show-loan-by-user/{user}")
	public List<ApplyLoan> showLoanInfo(@PathVariable ("user") String user){
		
		List<ApplyLoan> loan = applyLoanServiceImpl.getUserLoanStatus(user);
		System.out.println(loan+"::::::::::::::::::::::::::::::::::::::");
		return loan;
		
	}
	
	@PostMapping("/save-installment-payment")
	public Installment saveInstallment(@RequestBody Installment installment) {
		
		List<Installment> installmentList = (List<Installment>) installmentServiceImpl.getByLoanId(installment.getLoanId());
		
		System.out.println(installment.getInstallmentAmount());
		Long totalPaid=installment.getInstallmentAmount();
		Long loanAmount = installment.getLoanAmount();
		for (Installment install : installmentList) {
			totalPaid += install.getInstallmentAmount();
		}
		Long totalPayable= loanAmount-totalPaid;

		installment.setLoanAmount(loanAmount);
		installment.setTotalPaid(totalPaid);
		installment.setTotalPayable(totalPayable);
		installment.setInstallmentDate(new Date());
		System.out.println(installment+":::::::::::::::::::::::::::::::::::::::");
		
		installment = installmentServiceImpl.save(installment);
		
		return installment;
		
	}
	
	@GetMapping("/show-installment-by/{id}")
	public List<Installment> getInstallmentStatusById(@PathVariable("id") long loanId) {
		List<Installment> instalmentList = installmentServiceImpl.getByLoanId(loanId);
		System.out.println(instalmentList+":::::::::::::::::::::::::::::::::::::::");
		return instalmentList;
		
	}
	

	@PostMapping("/user-send-email")
	public Contact saveUserEmail(@RequestBody Contact contact, BindingResult results) {
		
		if (!results.hasErrors()) {
			contact.setDate(new Date().toString());
			System.out.println(contact+"::::::::::::::::::::::::::::::::::::::");
			return contactServiceImpl.save(contact);
		}
		return null;

	}
	
	
	@GetMapping("/show-user-email")
	public List<Contact> showAllContactEmail(){
		
		List<Contact> messageInbox = contactServiceImpl.getAll();
		System.out.println(messageInbox+"::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return messageInbox;
		
	}
	
	@GetMapping("/show-user-by/{id}")
	public UserInfo getUserById(@PathVariable("id") long id){
		UserInfo entity = userInfoService.getById(id);
		System.out.println(entity+"::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return entity;
	}
	
	@GetMapping("/show-user")
	public List<UserInfo> showUserInfo(){
		
		List<UserInfo> user = userInfoService.getAll();
		System.out.println(user+":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return user;
		
	}
	
	@GetMapping("/show-installment")
	public List<Installment> getAllInstallmetn(){
		List<Installment> entity = installmentServiceImpl.getAll();
		System.out.println(entity+":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return entity;
	}
	
	
	@GetMapping("/show-loaninfo-by/{id}")
	public ApplyLoan getLoaninfoById(@PathVariable("id") long id){
		ApplyLoan entity = applyLoanServiceImpl.getById(id);
		System.out.println(entity+"::::::::::::::::::::::::::::::::::::::::::::");
		return entity;
	}
	
	@GetMapping(value = "/user-loan/{currentUser}")
	public List<ApplyLoan> getCurrentUserLoanStatus(@PathVariable("currentUser") String currentUser) {
		List<ApplyLoan> loan =applyLoanServiceImpl.getUserLoanStatus(currentUser);
		System.out.println(loan+":::::::::::::::::::::::::::::::::::::::");
		return loan;
		
	}

}
