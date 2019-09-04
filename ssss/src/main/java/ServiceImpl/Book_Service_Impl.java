package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pojo.Book;
import dao.Book_Dao;
import service.Book_Service;
@Service
public class Book_Service_Impl implements Book_Service {
	@Autowired
	Book_Dao bs;
	
	public List<Book> select(String name) {
		return bs.select(name);
	}
	
	public void insert(Book b) {
		bs.insert(b);
	}

	public void update(Book b) {
		
		bs.update(b);
	}

	public void delete(int id) {
		bs.delete(id);
	}

	public List<Book> selectById(int id) {
		
		return bs.selectById(id);
	}
	
}
