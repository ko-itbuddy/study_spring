package com.bank.jackpot.dao.interfaces;

import com.bank.jackpot.dto.LoginFormDto;

public interface ILoginFromDao {
	
	public int loginCheck(LoginFormDto user);

}
