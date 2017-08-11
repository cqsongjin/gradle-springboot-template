package com.song.web.service;

import com.song.web.pojo.Result;
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
	public Result getResult(int currentPage, int pageSize) {
		Result result = new Result();
		result.setCurrentPage(0);
		result.setPageSize(3);
		return mapper.getResult(result);
	}
}
