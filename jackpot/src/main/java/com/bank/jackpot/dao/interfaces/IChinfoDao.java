package com.bank.jackpot.dao.interfaces;

import com.bank.jackpot.dto.ChinfoDto;

public interface IChinfoDao {
	
	public ChinfoDto getBean(String id);
	
	public boolean userUpdate(ChinfoDto user);
	
	
}
