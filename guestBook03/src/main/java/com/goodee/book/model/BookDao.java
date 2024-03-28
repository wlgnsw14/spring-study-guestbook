package com.goodee.book.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	// 데이터베이스와 직접 소통(Mybatis를 통해서)
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BookVo> selectBookList(){
		List<BookVo> resultList = new ArrayList<BookVo>();
		
		try {
			resultList = sqlSession.selectList("com.goodee.book.BookMapper.selectBookList");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultList;
	}
	
	
}
