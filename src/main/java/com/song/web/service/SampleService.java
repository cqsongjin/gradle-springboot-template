package com.song.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.web.repository.SampleMapper;

@Service
public class SampleService {
	
	@Autowired
	private SampleMapper mapper;
	public int getNum() {
		return mapper.getNum();
	}
}
