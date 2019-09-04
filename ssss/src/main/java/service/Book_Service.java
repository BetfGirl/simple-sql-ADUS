package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import Pojo.Book;

public interface Book_Service{
	public List<Book> select(String name);

	public List<Book> selectById(int id);
	
	public void insert(Book b);
	
	public void update(Book b);
	
	public void delete(int id);
}
