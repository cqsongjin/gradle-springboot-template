package com.song.web.repository;

import com.song.web.pojo.Result;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleMapper {
	int getNum();
	Result getResult(Result result);
}
