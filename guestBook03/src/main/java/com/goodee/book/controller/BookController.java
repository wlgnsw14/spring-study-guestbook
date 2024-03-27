package com.goodee.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/book")
public class BookController {

	@RequestMapping(method=RequestMethod.GET)
	public String bookList() {
		// 1. 목록 조회
		// 2. 정보 전달
		// 3. 화면 전환
		return "list";
	}
	
	
}
