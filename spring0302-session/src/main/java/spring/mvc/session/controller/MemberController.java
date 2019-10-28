package spring.mvc.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.session.dto.Member;
import spring.mvc.session.service.MemberService;

@Controller
// url prefix 
@RequestMapping("/member")
public class MemberController {

	//getcontextPath 패스를 가지고 다님
	
	@Autowired
	MemberService service;
	
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		
		
		
		return request.getContextPath();
	}
	//사용자 등록
	
	
	@RequestMapping("/joinForm")
	public String joinForm(Member member) {
		
		
		return "member/joinForm";
	}
	
	// post로 해야 아이디 비번이 눈에 안보임 
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String joinRegForm(Member member) {
		//입력이 있을때 서비스를 써야한다.
		// 컨트롤러는 서비스에 종속
		//회원 가입 하는 기능을 사용 DAO를 사용해서 DTO로 전달
		service.memberRegister(member);
		
		return "/member/joinOk";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String memLogin(Member member,HttpSession session) {


		Member mem = (Member) service.memSearch(member);
		
		session.setAttribute("member", mem);
		
		return "/member/loginOk";
	}
}
