package spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/start.do")//start.do url이 들어올 경우에만 mapping을 함
	public ModelAndView start() {// 함수명은 상관 없다. 요청 명과 맞추려고 함
		System.out.println("start 요청 되었습니다.");
		
		ModelAndView mv = new ModelAndView(); //함수를 통해 처리된 결과를 보여줄 view page 객체 생성
		mv.setViewName("hello"); //view의 주소 + common-servlet.xml 에서 /WEB-INF/view/ + hello + .jsp 로 접두사, 접미사 설정함
		mv.addObject("message", "즐거운 스프링"); // message는 변수 명과 비슷
		return mv;
	}
}