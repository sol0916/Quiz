package quiz10;

public class User {
	
	//변수
	private String name;
	private int rrn;
	private int age;
	
	
	//기본 생성자
	public User() {
	}
	
	//변수 초기화하는 생성자
	public User(String name, int rrn, int age) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;		
	}
	
	public String getName() {
		return name;
	}
	
	public int getRrn() {
		return rrn;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
