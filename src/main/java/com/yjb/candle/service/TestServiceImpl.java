package com.yjb.candle.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.yjb.candle.domain.NameVO;
import com.yjb.candle.domain.SearchVO;
import com.yjb.candle.mapper.TestMapper;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestServiceImpl implements TestService {

	@Setter(onMethod_= @Autowired)
	private TestMapper mapper;
	
	@Override
	public NameVO get(SearchVO search) {
		log.info("get_________________"+search);
		
		return mapper.result(search);
	}

}
