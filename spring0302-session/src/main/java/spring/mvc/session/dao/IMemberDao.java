package spring.mvc.session.dao;

import java.util.Map;

import spring.mvc.session.dto.Member;

public interface IMemberDao {

	// 인풋이 있는것은 Map 방식으로
	Map<String, Member> memberInsert(Member member);
	
	Member memberSelect(Member member);
	//Member memberUpdate(Member member);
	Map<String, Member> memberDelete(Member member);
	
}
