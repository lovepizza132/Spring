package ex01_xml1;

public class MessageBeanEnImpl implements MessageBean{

	@Override
	public void sayHello(String name) {
		System.out.println(name+ ", good morning");
	}

	public MessageBeanEnImpl() { // 생성자 함수 인스턴스를 만들기 위한 특별한 메소드
		System.out.println("MessageBeanEnImpl 객체 생성");
	}
	
	
}
