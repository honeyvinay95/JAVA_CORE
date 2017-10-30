package com.controller;




//import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.contactDao;

import com.model.contact;




@Controller
public class contactController {
	@Autowired
private contactDao contactDao;
	
	public contactController(){
		System.out.println("ContactController instantiated");
	}

	@RequestMapping(value="/contact" ,method=RequestMethod.GET)
	 public String getContact( Model model) {
		//contact = new Contact(); 
		model.addAttribute("contact",new contact());
		
		
		return "contact";
	}
	
	
		
		@RequestMapping(value = "/savecontact", method = RequestMethod.POST)
	public String saveContact (@ModelAttribute("contact")contact contactus,
			Model model){
			
	
				contactDao.saveContact(contactus);
		    
			return "index";
}
}