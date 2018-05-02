package com.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.app.service.LoginService;
import com.spring.app.vo.User;

@Controller
public class LoginController {
	@Autowired
	Validator validatotr;
	@Autowired
	LoginService loginService;
	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("cmd",new User());
		
		return "login";
	}
	@RequestMapping(value="login.htm",method=RequestMethod.POST)
	public String doLogin(@ModelAttribute("cmd")User user,BindingResult errors,Model model){
		if(user!=null) {
			validatotr.supports(User.class);
			validatotr.validate(user, errors);
		}
		if(errors.hasErrors()){
			model.addAttribute("errors", errors);
			return "login";
		}
		else{
			System.out.println(loginService.saveUser(user));
			User fetcheduser=loginService.loginById(user.getUserId());
			System.out.println();
			model.addAttribute("userid",fetcheduser.getUserId());
			
			//loginService
		}
		return "success";
	}

}
