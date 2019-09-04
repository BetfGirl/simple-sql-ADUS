package Pojo;

public class Book {
	private Integer id;
	private String name;
	private Integer sex;
	private Integer typeid;
	public static String list[]={"人文","科教","文学"};
	 
	public String getList() {
		return list[typeid];
	}
	public void setList(String[] list) {
		this.list = list;
	}
	public Book() {
		super();
	}
	
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Book(int id, String name, int sex, int typeid) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.typeid = typeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTypeid() {
		return typeid;
	}
	public String getTypeidname() {
		return list[typeid];
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	
	
}
