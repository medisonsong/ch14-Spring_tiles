package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	//root redirect
	@RequestMapping("/")
	public String init() {
		return "redirect:/main.do";
	}
	
	//main호출
	@RequestMapping("/main.do")
	public String viewMain() {
		return "main"; //타일스 설정명
	}
	
	//회사소개 호출
	@RequestMapping("/company.do")
	public String viewCompany() {
		return "company";
	}
	
	//제품소개 호출
	@RequestMapping("/product.do")
	public String viewProduct() {
		return "product";
	}
	
	
	
	
}
