package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVO;

@Controller
public class ModelAttributeController {
	// 기본적으로 뷰단으로 data 넘기는 방법
	// 1. ModelAndView 객체를 만들기
	// 2. Map 객체(자바 HashMap)
	// 3. Model 객체******return으로 넘기지 않고 인자로 지정
	// 4. @ModelAttribute 이용
	@ModelAttribute("message")
	public String abc() {
		return "오늘은 어디까지 하실래요?";
	}
	
	@ModelAttribute("memberVO")
	public MemberVO xxxx() {
		MemberVO vo = new MemberVO();
		vo.setId("00001");
		vo.setName("홍길동");
		vo.setAge(33);
		return vo;
	}
	
	
	
	@RequestMapping("/modelAttr.do")
	public String test() {
		return "modelAttribute";
	}
}
