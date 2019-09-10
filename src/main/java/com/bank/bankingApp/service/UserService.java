package com.bank.bankingApp.service;

import com.bank.bankingApp.dto.tranacationRequestDTO;
import com.bank.bankingApp.entity.UserDetails;

public interface UserService {

	public String storeUserDetails(UserDetails user);
	public UserDetails getUserByID(int user_id);
	
	public String transation(tranacationRequestDTO transdto, int amount);
}
