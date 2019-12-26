package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.ApplyLoan;
import com.exam.model.Contact;
import com.exam.service.ContactServiceImpl;

@Controller
public class ContactCtrl {
	@Autowired
	ContactServiceImpl contactImpl;
	
	@PostMapping("/contactRequest")
	public ModelAndView createContact(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<>();
		String fname = request.getParameter("fName");
		String lname = request.getParameter("lName");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		Contact contact = new Contact();
		contact.setFirstName(fname);
		contact.setLastName(lname);
		contact.setEmail(email);
		contact.setMessage(message);
		contact.setDate(new Date().toString());
		contact = contactImpl.save(contact);
		if(contact != null) {
			model.put("success", "success");
			model.put("msg", "Message Send succesful");
			model.put("entityContact", contact);
		}
		
		
		return new ModelAndView("pages/contactus", model);
//		return null;
	}
	
	
	@GetMapping("/messageinbox")
	public ModelAndView showAll(){
		Map<String, Object> model = new HashMap<>();
		
		List<Contact> messageInbox = contactImpl.getAll();
		model.put("messageInbox", messageInbox);
		return new ModelAndView("pages/admessage-inbox", model);
		
	}
	
	@PostMapping("/adsearch-contact")
	public ModelAndView getContactById(HttpServletRequest request){
		Map<String, Object> model = new HashMap<>();
		String  sid = request.getParameter("searchContatId");
		Long id = Long.parseLong(sid);
		List<Contact> contact = contactImpl.getContactById(id);
		model.put("messageInbox", contact);
		System.out.println(contact);
		return new ModelAndView("pages/admessage-inbox", model);
		
		
	};
}
