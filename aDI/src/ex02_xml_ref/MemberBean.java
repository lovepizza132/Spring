package ex02_xml_ref;

public class MemberBean {
	// property 들
	private String name;
	private int age;
	private String message;
	
	// constructor(생성자)
	public MemberBean() {}
	
	// 인자를 받을 constructor(생성자) 함수
	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}
	

	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
