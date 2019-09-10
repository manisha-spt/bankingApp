package com.bank.bankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankingApp.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
	
	public UserDetails findByAccountNum(Long acc);
}
