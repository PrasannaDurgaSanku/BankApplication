package com.bankapp.model.dao.exceptions;

public class AccountNotFoundException extends RuntimeException{

	public AccountNotFoundException(String message) {
		super(message);
		
	}

}
