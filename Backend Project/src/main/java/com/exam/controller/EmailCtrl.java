package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.Contact;
import com.exam.service.ContactServiceImpl;

@Controller
public class EmailCtrl {
	@Autowired
	JavaMailSender javaMailSender;
	
	@Autowired
	ContactServiceImpl contactServiceImpl;
	
	@RequestMapping("/sendEmail")
    public ModelAndView sendEmail(@RequestParam("mail") String email, @RequestParam("sub") String sub,
            @RequestParam("body") String body, Map<String, String> map) {
        SimpleMailMessage massage = new SimpleMailMessage();
        massage.setFrom("ador.abdulalim@gmail.com");
        massage.setSentDate(new Date());
        massage.setTo(email);
        massage.setSubject(sub);
        massage.setText(body);
        System.out.println(massage);
        javaMailSender.send(massage);
        map.put("msg", "Email Send SuccessFull");
        return new ModelAndView("pages/adcompose-email", map);
    }
	
	
	@GetMapping("/sendEmail/{id}")
	public ModelAndView getEmailAddress(@PathVariable("id") long id){
		Map<String, Object> model = new HashMap<>();
		List<Contact> contact = contactServiceImpl.getContactById(id);
		String email = contact.get(0).getEmail();
		System.out.println(email);
		model.put("email", email);
		return new ModelAndView("pages/adcompose-email", model);
	}
	
	
}
