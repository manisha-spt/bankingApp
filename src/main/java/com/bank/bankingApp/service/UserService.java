package com.bank.bankingApp.service;

import java.util.List;

import com.bank.bankingApp.dto.tranacationRequestDTO;
import com.bank.bankingApp.entity.UserDetails;
import com.bank.bankingApp.entity.transactionDetails;

public interface UserService {

	public String storeUserDetails(UserDetails user);
	public List<transactionDetails> getUserByAccNum(Long account);
	public String transation(tranacationRequestDTO transdto, int amount);
	
	
	public List<transactionDetails> getTxnDetails(Long accountNum);
}
