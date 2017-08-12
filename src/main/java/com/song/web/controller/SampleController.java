package com.song.web.controller;


import com.song.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.song.web.service.SampleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		//model.addObject("number", service.getNum());
		List result = service.getResult(0, 10);
		System.out.println(result);
		List<Map<String, Object>> users = (ArrayList<Map<String, Object>>) result.get(0);
		int count = ((ArrayList<Integer>)result.get(1)).get(0);
		users.forEach(user -> {
			int userId = (int) user.get("id");
			String userName = (String) user.get("name");
			System.out.println(userId + "---------" + userName);
		});
		System.out.println(count);
		System.out.println(result);
		System.out.println(result.get(0).getClass());
		System.out.println(result.get(1).getClass());
		return model;
	}
}
