package ex05_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
	// property 들
	private String name;
	private int age;
	private String message;
	
	// constructor(생성자)
	public MemberBean() {
		name="X맨";
		age=25;
		message="놀아주셈~~~";
	}
	
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
