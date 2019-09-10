package com.bank.bankingApp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankingApp.dto.tranacationRequestDTO;
import com.bank.bankingApp.entity.UserDetails;
import com.bank.bankingApp.entity.transactionDetails;
import com.bank.bankingApp.repository.UserRepository;
import com.bank.bankingApp.repository.transactionRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository UserRepository;
	@Autowired
	private transactionRepository transactionRepository;

	

	// Registraion API
	@Override
	public String storeUserDetails(UserDetails user) {

		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		user.setAccountNum(number);
		UserRepository.save(user);
		return "User Registered";
	}

	@Override
	public UserDetails getUserByID(int user_id) {
		UserDetails store = null;
		java.util.Optional<UserDetails> userdata = UserRepository.findById(user_id);

		if (userdata.isPresent()) {
			store = userdata.get();
		}
		return store;
	}

	// to transfer amount from one account to another account
	@Override
	public String transation(tranacationRequestDTO transdto, int amount) {
		
		UserDetails userIdfrom=UserRepository.findByAccountNum(transdto.getFromAcc());
		
		UserDetails userIdTo=UserRepository.findByAccountNum(transdto.getToAcc());
		
		transactionDetails transactionDetails=new transactionDetails();
		
		int debit =userIdfrom.getBalance()-amount;
		userIdfrom.setBalance(debit);
		int credit=userIdTo.getBalance()+amount;
		userIdTo.setBalance(credit);
		UserRepository.save(userIdfrom);
		UserRepository.save(userIdTo);
		
		transactionDetails.setAmount(amount);
		transactionDetails.setDate(new Date());
		transactionDetails.setFrom_acc(userIdfrom.getAccountNum());
		transactionDetails.setTo_acc(userIdTo.getAccountNum());
		transactionDetails.setUser_id(userIdfrom.getUser_id());
		transactionRepository.save(transactionDetails);
		
		/*
		 * transactionDetails transactionDetails=new transactionDetails(); int
		 * user1_balance = user1_id.getBalance() - amount; int user2_balance =
		 * user2_id.getBalance() + amount; user1_id.setBalance(user1_balance);
		 * user2_id.setBalance(user2_balance);
		 * transactionDetails.setFrom_acc(user1_id.getAccountNum());
		 * transactionDetails.setTo_acc(user2_id.getAccountNum());
		 * transactionDetails.setAmount(amount);
		 * transactionDetails.setUser_id(user1_id.getUser_id());
		 * transactionRepository.save(transactionDetails);
		 * 
		 * UserRepository.save(user1_id); UserRepository.save(user2_id);
		 */		 		return "Transaction Completed";
	}

}
