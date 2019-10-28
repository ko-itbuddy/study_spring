package com.bank.jackpot.dao.interfaces;

import com.bank.jackpot.dto.templates.Acc;
import com.bank.jackpot.dto.templates.User;

public interface IMemberDao {
	public boolean SelectMember(String id); // 아이디 존재유무 함수
	public boolean InsertMember(User user);
	public boolean InsertAcc(User user);
}
