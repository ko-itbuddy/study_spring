package spring.mvc.session.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import spring.mvc.session.dto.Member;

@Repository
public class MemberDao implements IMemberDao{

private HashMap<String, Member> dbMap;

	public MemberDao() {
		// TODO Auto-generated constructor stub
		dbMap = new HashMap<String, Member>();
	}
	
	@Override
	public Map<String, Member> memberInsert(Member member) {
		// TODO Auto-generated method stub
		dbMap.put(member.getMemId(), member);
		return dbMap;
	}

	@Override
	public Member memberSelect(Member member) {
		// TODO Auto-generated method stub
		Member resultMem = dbMap.get(member.getMemId());
		
		return resultMem;
	}

	@Override
	public Map<String, Member> memberDelete(Member member) {
		// TODO Auto-generated method stub
		dbMap.remove(member.getMemId());
		return dbMap;
	}

}
