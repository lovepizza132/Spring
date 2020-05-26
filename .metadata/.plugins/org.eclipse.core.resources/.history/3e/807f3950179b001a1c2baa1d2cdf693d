package ex05_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 1. 스프링 설정파일 연결
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex05_annotation/applicationContext.xml"); // 상대경로의 기준은 src폴더
		
		// 2. bean 얻어오기
		MemberDAO dao = context.getBean("memberDAO", MemberDAO.class); // memberDAO는 내가 설정한 것이 아닌 MemberDAO 클래스 명에서 첫 글자만 소문자로 자동으로 생성된 것
		dao.insert();
	}

}
