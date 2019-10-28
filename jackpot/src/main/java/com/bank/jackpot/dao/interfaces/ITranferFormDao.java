package com.bank.jackpot.dao.interfaces;

import java.util.ArrayList;

import com.bank.jackpot.dto.*;

public interface ITranferFormDao {

	public ArrayList<String> getAccList(String id);
	public int insertTransHis(TranferFormDto dto);
}
