package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Pojo.Book;
import service.Book_Service;

@Controller
@RequestMapping("Book")
public class spring_dayone {
	@Autowired
	Book_Service dao;

	@RequestMapping("index")
	public String index(String txt,ModelMap m ){
		if(txt!=null) txt=" where book.name like '%"+txt+"%'";
		if(txt==null) txt="";
		m.put("list",dao.select(txt));
		m.put("listname",Book.list);
		return "index";
	}
	
	@RequestMapping("edit")
	public String edit(Book b,ModelMap m) {
		return "edit";
	}
	
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m) {
		dao.insert(b);
		return index(null,m);//��������²�ѯ
	}
	//��ʼǰ��ҳ�����޸���ת
	@RequestMapping("update")
	public String update(int id,ModelMap m) {
		Book b=dao.selectById(id).get(0);
		m.put("info", b);
		return "edit";
	}
	//ǰ�˾����޸ĺ���Ҫ���µ�������ת��
	@RequestMapping("Change")
	public String add(Book b,ModelMap m) {
		System.out.println(b);
		dao.update(b);
		return index(null,m);//���º����²�ѯ
	}
	@RequestMapping("delete")
	public String delete(Integer id,ModelMap m) {
		dao.delete(id);
		return index(null,m);//ɾ�������²�ѯ
	}

}
