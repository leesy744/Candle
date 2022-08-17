package com.yjb.candle.domain;

import java.util.List;

import lombok.Data;

@Data
public class NameVO {

	private int idx;
	private int candle_idx;
	private String name;
	private String aroma;
	private String place;
	private String time;
	private String season;
	private List<String> candle_add;
	private String contents;
}
