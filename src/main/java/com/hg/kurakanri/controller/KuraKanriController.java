package com.hg.kurakanri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/kanri")
public class KuraKanriController {

	@GetMapping("/home")
	public String displayHome() {
		return "home";
	}
}
