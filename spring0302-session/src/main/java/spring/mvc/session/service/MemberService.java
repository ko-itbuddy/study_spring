package spring.mvc.session.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mvc.session.dao.MemberDao;
import spring.mvc.session.dto.Member;

@Service
public class MemberService implements IMemberService{

	@Autowired
	MemberDao dao;

	@Override
	public void memberRegister(Member member) {
		// TODO Auto-generated method stub
		printMembers(dao.memberInsert(member));
		
	}

	@Override
	public Member memSearch(Member member) {
		// TODO Auto-generated method stub
		Member mem =dao.memberSelect(member);
		printMember(mem);

		return mem;
	}
	private void printMembers(Map<String, Member>map) {
		Set<String> keys =map.keySet();

		Iterator<String>iter =keys.iterator();

		while(iter.hasNext()) {
			String key =iter.next();
			Member mem=map.get(key);
			printMember(mem);
			}
		}

		private void printMember(Member mem) {

			System.out.println("ID  :" + mem.getMemId()+"\t");
			System.out.println("PW  :" + mem.getMemPw()+"\t");
			System.out.println("Mail:" + mem.getMemMail()+"\n");
		}


	}
