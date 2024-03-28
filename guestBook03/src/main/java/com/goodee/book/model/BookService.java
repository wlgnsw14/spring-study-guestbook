package com.goodee.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDao dao;
	
	public List<BookVo> selectBookList(){
		return dao.selectBookList();
	}
	
}
