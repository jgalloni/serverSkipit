package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("usuario", new Usuario());
		return "hello";
	}


	@RequestMapping(value = "logear", method = RequestMethod.POST,produces = "application/json",headers = {"Accept=text/xml, application/json"})
	public @ResponseBody
	Usuario Logear(@ModelAttribute("usuario") Usuario usuario,ModelMap model){
		model.addAttribute("usuario", usuario);
		return usuario;
	}
}