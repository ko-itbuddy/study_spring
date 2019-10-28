package yuhan.mvc.redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Redirect {

	@RequestMapping(value="loginForm")
	public String loginForm() {
		
		
		
		return "loginId";
	}
	
	@RequestMapping("memberConfirm")
	public String memberCOnfirm(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		// 폼으로 넘어오는 아이디 값이 test 일경우 , 현재는 DB를 사용하지 않기 때문에 이런 식으로 처리함.
		if(id.equals("test")) {
			//member라는 폴더에 있어
			//   /-> 루트부터   / 가 없으면 현재 폴더에서 시작
			return "member/memberOK";
		}
		// memberFail이 없다면 처음 문장으로 빠짐
		// 아래 문장은 리다이렉트를 받아서 처리하는 메소드 필요
		//return "redirect:memberFail";
		//다음 문장은 홈페이지로 이동
		return "redirect:/";
	}
	
	@RequestMapping("/memberFail")
	public String memberFail() {
		
		
		
		return "member/memberFail";
	}
	
}
