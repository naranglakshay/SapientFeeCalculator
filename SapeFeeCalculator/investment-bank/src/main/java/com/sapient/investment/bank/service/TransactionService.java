package com.sapient.investment.bank.service;

import java.util.List;

import com.sapient.investment.bank.model.TransactionDto;

/**
 * 
 * @author lakshaynarang
 *
 */
public interface TransactionService  {
	
	 void display();
	 
	 void add(List<TransactionDto> transactions);
	 
	 void add(TransactionDto transaction);
	 
}
