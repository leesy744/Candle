package com.yjb.candle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjb.candle.domain.NameVO;
import com.yjb.candle.domain.SearchVO;
import com.yjb.candle.mapper.TestMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

	@Setter(onMethod_= @Autowired)
	private TestMapper mapper;
	
	@Override
	public NameVO get(SearchVO search) {
		log.info("get_________________"+search);
		
		return mapper.result(search);
	}

}
