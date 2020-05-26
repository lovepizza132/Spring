package ex01_xml1;

public class MessageBeanKoImpl implements MessageBean{

	@Override
	public void sayHello(String name) {
		System.out.println(name+ "님 반갑습니다.");
	}

	public MessageBeanKoImpl() {// 생성자 함수
		System.out.println("MessageBeanKoImpl 객체 생성");
	}
	
	
}
