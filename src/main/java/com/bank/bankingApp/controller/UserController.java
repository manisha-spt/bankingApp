package com.bank.bankingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankingApp.dto.TransationListDTO;
import com.bank.bankingApp.dto.tranacationRequestDTO;
import com.bank.bankingApp.entity.UserDetails;
import com.bank.bankingApp.entity.transactionDetails;
import com.bank.bankingApp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
	@PostMapping("/storeUserDetails")
	public String storeUserDetails(@RequestBody UserDetails user) {
		UserService.storeUserDetails(user);
		return "done";
	}
	
	@PostMapping("/transferAmount/{amount}")
	public String transferAmount(@RequestBody tranacationRequestDTO transdto, @PathVariable int amount) {
		UserService.transation(transdto, amount);
		return "Transaction Completed";
	}
	
	
	@GetMapping("/{AccountNum}")
	public List<transactionDetails> fetchRecords(@RequestBody TransationListDTO acc) {
		
		return UserService.getUserByAccNum(acc);
	}
}
