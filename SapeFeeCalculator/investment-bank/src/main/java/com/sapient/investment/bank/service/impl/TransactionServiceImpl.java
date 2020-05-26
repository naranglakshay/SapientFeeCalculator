package com.sapient.investment.bank.service.impl;

import java.util.LinkedList;
import java.util.List;

import com.sapient.investment.bank.helper.TransactionHelper;
import com.sapient.investment.bank.model.TransactionDto;
import com.sapient.investment.bank.service.TransactionService;

/**
 * 
 * @author lakshaynarang
 *  
 */    
public class TransactionServiceImpl implements TransactionService{
    
	List<TransactionDto> transactionList =new LinkedList<TransactionDto>();

	public TransactionServiceImpl() {
		super();
	}


	public TransactionServiceImpl(List<TransactionDto> transactionList) {
		super();
		this.transactionList = transactionList;
	}


	@Override
	public void display() {
		
		this.transactionList.stream().forEach(transaction -> System.out.println(transaction)); 
		
	}


	@Override
	public void add(List<TransactionDto> transactions) {
		
		if(transactions !=null && ! transactions.isEmpty()) {
			 TransactionHelper helper =new TransactionHelper(transactions);
			 
			 List<TransactionDto> transactionList= new LinkedList<TransactionDto>();
			 
			 transactions.stream().forEach(transaction -> transactionList.add(helper.getCharge(transaction)));
			 
			 this.transactionList = transactionList;
			
		}
		  
		
	}


	@Override
	public void add(TransactionDto transaction) {
		
		if(transaction !=null) {
			
			 TransactionHelper helper =new TransactionHelper(transactionList);
			 
			 transactionList.add(helper.getCharge(transaction)); 
			
		}
	}
	
	
}
