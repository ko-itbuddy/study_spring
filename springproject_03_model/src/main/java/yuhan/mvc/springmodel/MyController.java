package yuhan.mvc.springmodel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import yuhan.mvc.springmodel.dto.UserInfomation;

@Controller
public class MyController {

	@RequestMapping("/form")
	public String UserForm() {

		return "user/form";
	}

//	@RequestMapping("/userInfo")
//	public String UserInfo(UserInfomation userInfomation) {
//
//		return "user/userInfo";
//	}
	
	@RequestMapping("/userInfo")
	public String UserInfo(@ModelAttribute("userInfo") UserInfomation userInformation) {

		return "user/userInfo";
	}
}
