package com.song.web.repository;

import com.song.web.pojo.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleMapper {
	int getNum();
	List getResult(Result result);
}
