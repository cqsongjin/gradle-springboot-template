package com.song.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.song.web.repository.SampleMapper;
import com.song.web.service.SampleService;

@Controller
@RequestMapping("/")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		String name = "songjin";
		ModelAndView model = new ModelAndView("index");
		model.addObject("name", name);
		model.addObject("number", service.getNum());
		return model;
	}
}
