package com.yjb.candle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yjb.candle.domain.NameVO;
import com.yjb.candle.mapper.TestMapper;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestServiceImpl implements TestService {

	@Setter(onMethod_= @Autowired)
	private TestMapper mapper;
	
	@Override
	public NameVO get(long idx) {
		log.info("get_________________"+idx);
		return mapper.result(idx);
	}

}
