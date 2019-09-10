package com.bank.bankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankingApp.entity.transactionDetails;

@Repository
public interface transactionRepository extends JpaRepository<transactionDetails, Integer>{

}
