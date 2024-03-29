package com.bank.bankingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankingApp.entity.transactionDetails;

@Repository
public interface transactionRepository extends JpaRepository<transactionDetails, Integer>{

	
//	@Query("FROM transactionDetails td WHERE td.from_acc = ?")
	public List<transactionDetails> findByFromAcc(Long accountNum);
	
	
	
	
}
