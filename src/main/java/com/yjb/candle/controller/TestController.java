package com.yjb.candle.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yjb.candle.domain.NameVO;
import com.yjb.candle.domain.SearchVO;
import com.yjb.candle.service.TestService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/*", produces = "text/plain;charset=UTF-8")
@AllArgsConstructor
public class TestController {

	private TestService serviece;
	
	@GetMapping("selected")
	public String selected() {
		return "selected";
	}
	
	@GetMapping("result")
	public String result() {
		return "result";
	}
	
	@PostMapping("process")
	public String process(RedirectAttributes rttr, SearchVO search, NameVO candle) {
		log.info("TestController___________");

		rttr.addFlashAttribute("result", serviece.get(search));

		return "redirect:result";
	}

}
