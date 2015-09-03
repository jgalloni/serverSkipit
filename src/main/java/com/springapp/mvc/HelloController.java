package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("usuario", new Usuario());
		return "hello";
	}

	@RequestMapping(value = "logear", method = RequestMethod.POST)
	public String Logear(@ModelAttribute("usuario") Usuario usuario,ModelMap model){
		model.addAttribute("usuario", usuario);
		return "saludar";
	}
}