package com.bank.bankingApp.dto;

public class tranacationRequestDTO {
	private Long toAcc;
	private Long fromAcc;
	public Long getToAcc() {
		return toAcc;
	}
	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}
	public Long getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(Long fromAcc) {
		this.fromAcc = fromAcc;
	}

}
