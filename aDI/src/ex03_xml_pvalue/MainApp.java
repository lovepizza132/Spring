package ex03_xml_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 1. 스프링 설정파일 연결
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex03_xml_pvalue/applicationContext.xml"); // 상대경로의 기준은 src폴더
		
		// 2. 빈 얻어오기
//		MemberBean bean = context.getBean("member", MemberBean.class);
//		System.out.println( bean.getName()+"/"+
//							bean.getAge()+"/"+
//							bean.getMessage()
//							);
//		
//		MemberBean bean2 = context.getBean("member2", MemberBean.class);
//		System.out.println( bean2.getName()+"/"+
//							bean2.getAge()+"/"+
//							bean2.getMessage()
//							);
		MemberDAO dao = context.getBean("dao", MemberDAO.class);
		dao.insert();

		
	}

}
