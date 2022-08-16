package com.yjb.candle.domain;

import lombok.Data;

@Data
public class NameVO {

	private int idx;
	private int name;
	private int aroma;
	private int place;
	private int time;
	private int season;
	private List<String> candle_add;
}
