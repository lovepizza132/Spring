package ex01_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// POJO
//		MessageBean bean1 = new MessageBeanKoImpl();
//		bean1.sayHello("홍길동");
//
//		MessageBean bean2 = new MessageBeanEnImpl();
//		bean2.sayHello("홍길동");
		
		
		
		// 사용 이유 클래스와 클래스 사이의 결합도를 낮추고자(클래스를 하나 변경하면 전체에 영향을 끼치는 것을 줄임)
		// 1. 스프링 설정파일을 연결(방법1: ClassPathXmlApplicationContext을 이용한 연결, 방법2: GenericXmlApplicationContext로 연결 /방법은 더 있다~~)
		ApplicationContext context = new
		ClassPathXmlApplicationContext("ex01_xml1/applicationContext.xml");
//		GenericXmlApplicationContext("classpath:ex01_xml1/applicationContext.xml");
		System.out.println("start--------------------------------");
		
		MessageBean bean = (MessageBeanKoImpl)context.getBean("ko"); // 부모나 자식 클래스를 넣어도 되나 부모클래스를 사용하는 이유는 확장성을 고려해서
		bean.sayHello("홍길동");
		
		MessageBean bean1 = context.getBean("ko", MessageBeanKoImpl.class); // 부모나 자식 클래스를 넣어도 되나 부모클래스를 사용하는 이유는 확장성을 고려해서
		bean1.sayHello("홍길숙");
		
		MessageBean bean2 = context.getBean("en", MessageBean.class);
		bean2.sayHello("John");
		
		MessageBean bean3 = context.getBean("en", MessageBean.class);
		bean3.sayHello("Mike");
	}

}
