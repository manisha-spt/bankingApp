package com.bank.bankingApp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class transactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transaction_id;

	
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Long getFrom_acc() {
		return from_acc;
	}
	public void setFrom_acc(Long from_acc) {
		this.from_acc = from_acc;
	}
	public Long getTo_acc() {
		return to_acc;
	}
	public void setTo_acc(Long to_acc) {
		this.to_acc = to_acc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private Long from_acc;
	private Long to_acc;
	private int amount;
	private Date date;
	private int user_id;


	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	}
