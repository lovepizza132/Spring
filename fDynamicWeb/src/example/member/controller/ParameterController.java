package example.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import example.member.model.Member;
import example.member.model.MemberVO;

@Controller
public class ParameterController {
	
		@RequestMapping(value="/param.do")
		public String test(@RequestParam(value="id", defaultValue="")String userId, 
				@RequestParam(defaultValue="0")int age) {
			System.out.println("param.do 요청: "+userId);
			return "04_param";
		}
		
		// Member vo라고 변수를 선언하면 vo는 현재 메소드 안에서만 vo 사용 가능
		// 다른 영역에서는 스프링이 지정한 변수명으로만 사용 가능
		// 클래스명과 동일하고 첫글자가 소문자임
		@RequestMapping(value="/paramForm.do")
		public String test2(@ModelAttribute("vo")Member vo, HttpSession session) {
			
			// 실제 데이터 연결 값
			String userId="pizza";
			String userPw="1234";
			
			if(vo.getId().equals(userId)&&vo.getPass().equals(userPw)) {
				// 로그인 성공(세션에 저장)
				session.setAttribute("login", userId);
				return "loginSuccess";
			}
			return "loginFail";
		}
}
