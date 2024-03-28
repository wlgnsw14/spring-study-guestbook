package com.goodee.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goodee.book.model.BookService;
import com.goodee.book.model.BookVo;


@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;

	@RequestMapping(method=RequestMethod.GET)
	public String bookList(Model model) {
		// 1. 목록 조회
		List<BookVo> resultList = service.selectBookList();
		
		// 2. 정보 전달
		// (1) String 화면, Model 객체 정보(new연산자)
		// (2) ModelAndView 화면과 정보
		// (3) String 화면, Model 객체 정보 (매개변수)
		model.addAttribute("resultList",resultList);
		// 3. 화면 전환
		return "book";
	}
}
