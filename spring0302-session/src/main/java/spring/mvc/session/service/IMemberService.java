package spring.mvc.session.service;

import spring.mvc.session.dto.Member;

public interface IMemberService {
// 
	public void memberRegister(Member member);// 등록 
	Member memSearch(Member member);
	//Member memModify(Member member);
	//Member memRemove(Member member);
	
	
	
}
