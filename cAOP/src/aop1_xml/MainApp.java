package aop1_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// MessageBean에 구현한 클래스의 모든 메서드 호출
		// Spring 컨테이너를 구동한다
		ApplicationContext context = new ClassPathXmlApplicationContext("aop1_xml/applicationContext.xml");
		
		MessageBean bean = (MessageBean)context.getBean("targetBean");
		bean.sayHello();
		System.out.println("-------------------------------------------");
		bean.engSayHello();
		System.out.println("-------------------------------------------");
		bean.test();
		System.out.println("-------------------------------------------");

	}

}
