package com.yjb.candle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/candle/*", produces = "text/plain;charset=UTF-8")
@AllArgsConstructor
public class TestController {
	
	@GetMapping("/selected")
	public String selected() {
		return "/";
	}
	
	@GetMapping("/result")
	public String result() {
		return "/";
	}
	
	public void process() {
		log.info("TestController___________");
	}

}
