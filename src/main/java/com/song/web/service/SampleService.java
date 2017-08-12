package com.song.web.service;

import com.song.web.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.web.repository.SampleMapper;

import java.util.List;

@Service
public class SampleService {
	
	@Autowired
	private SampleMapper mapper;
	public int getNum() {
		return mapper.getNum();
	}
	public List getResult(int currentPage, int pageSize) {
		Result result = new Result();
		result.setCurrentPage(currentPage);
		result.setPageSize(pageSize);
		return mapper.getResult(result);
	}
}
