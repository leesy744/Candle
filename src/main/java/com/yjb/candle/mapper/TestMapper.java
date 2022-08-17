package com.yjb.candle.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yjb.candle.domain.NameVO;
import com.yjb.candle.domain.SearchVO;

@Mapper
public interface TestMapper {

	public NameVO result(SearchVO search);
}
