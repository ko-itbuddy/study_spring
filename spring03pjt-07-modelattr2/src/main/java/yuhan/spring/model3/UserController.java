package yuhan.spring.model3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@ModelAttribute("hitCar")
	public String[] refHitCar() {//개발자 임의의 함수
		return new String[] {"현대차","대우차","쌍용차","기아차"};
			
	}
	
	@RequestMapping(value = "userForm")
	public String nuserFrom() {
		return "user/userForm1";
	}
	
	@RequestMapping(value = "userInfo", method = RequestMethod.POST)
	public ModelAndView userSave(UserVo userVo, Model model) {
		
		model.addAttribute("msg","자동차 정보 출력");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/userForm1");
		modelAndView.addObject("userVo",userVo);
		
		return null;
	}
	
	@ModelAttribute("userVo")
	public UserVo init(HttpServletRequest request) {
		if(request.getMethod())
	}
	
	
	
	
	
	
	
	@RequestMapping("/userView")
	public Model userView() {
		// modeldl 상속된 더큰 
		Model model = new ExtendedModelMap();
		model.addAttribute("msg", "자동차 회사 출력 정보");
		
		return model;
	}
	
}
