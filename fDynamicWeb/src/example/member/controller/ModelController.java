package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	
	@RequestMapping(value="/model.do")
	public void xxxxx(Model m) {
		m.addAttribute("message", "팀원들 뭐 하실래?");
		m.addAttribute("addr", "가산시");
	}
	// 기본적으로 뷰단으로 data 넘기는 방법
	// 1. ModelAndView 객체를 만들기
	// 2. Map 객체(자바 HashMap)
	// 3. Model 객체******return으로 넘기지 않고 인자로 지정
}
