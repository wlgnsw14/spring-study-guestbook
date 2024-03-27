package book.controller;

import java.io.IOException;
import java.util.List;

import book.model.BookService;
import book.model.BookVo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class BookController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 목록 정보 추출(Dao)
		// 2. 추출된 정보 파싱(Service)
		// 3. 정보 화면 전달(Controller)
		List<BookVo> resultList = new BookService().selectList();
		req.setAttribute("resultList", resultList);
		RequestDispatcher rd = req.getRequestDispatcher("views/book.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
