package book.model;

import static book.JDBCTemplate.close;
import static book.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

public class BookService {

	// Controller와 Dao
	// 중간자
	public List<BookVo> selectList(){
		Connection conn = getConnection();
		List<BookVo> resultList = new BookDao().selectList(conn);
		close(conn);
		return resultList;
	}
	
}
