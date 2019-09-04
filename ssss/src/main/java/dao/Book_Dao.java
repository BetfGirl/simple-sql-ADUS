package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import Pojo.Book;
@Repository
public interface Book_Dao{
	@Select("select * from book inner join type on book.typeid=type.id ${name}")
	public List<Book> select(@Param("name") String name);
	
	@Select("select * from book where id=${id}")
	public List<Book> selectById(@Param("id") int id);
	
	@Insert("insert into book(name,sex,typeid) values(#{name},#{sex},#{typeid})")
	public void insert(Book b);
	
	@Update("update book set sex=#{sex},name=#{name},typeid=#{typeid} where id=#{id}")
	public void update(Book b);
	
	@Delete("delete from book where id=#{id}")
	public void delete(int id);
}
