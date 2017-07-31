package com.song.web.controller;

import java.lang.invoke.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		String name = "songjin";
		ModelAndView model = new ModelAndView("index");
		model.addObject("name", name);
		return model;
	}
}
