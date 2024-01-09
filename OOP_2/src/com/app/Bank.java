package com.app;

public class Bank {
	NationalBanks bank;
	Bank(NationalBanks bank){
		this.bank = bank;
	}
	public String getBankName() {
		return this.bank.bankName();
		
	}
}
