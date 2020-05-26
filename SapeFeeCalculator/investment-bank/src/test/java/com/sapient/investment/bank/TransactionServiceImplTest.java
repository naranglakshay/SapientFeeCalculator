package com.sapient.investment.bank;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sapient.investment.bank.model.TransactionDto;
import com.sapient.investment.bank.service.TransactionService;
import com.sapient.investment.bank.service.impl.TransactionServiceImpl;
import com.sapient.investment.bank.utill.InvestmentUtils;


/**
 * 
 * @author lakshaynarang
 *
 */
public class TransactionServiceImplTest {
	
	
	List<TransactionDto> transactions=new ArrayList<TransactionDto>();
	
	TransactionService service=null;
	
	@Before
    public void setupTransaction() {
		
		TransactionDto dto1= new TransactionDto("SPTX1","HDFC","GS",  InvestmentUtils.getType("BUY"),
				InvestmentUtils.parseDate("02/23/2020"), InvestmentUtils.parseDouble("101"), InvestmentUtils.getTransactionPriority("Y"));
		
		TransactionDto dto2= new TransactionDto("SPTX2","ONGC","AS",  InvestmentUtils.getType("SELL"),
				InvestmentUtils.parseDate("02/23/2020"), InvestmentUtils.parseDouble("101"), InvestmentUtils.getTransactionPriority("Y"));
		
		TransactionDto dto3= new TransactionDto("SPTX3","TATA","AP",  InvestmentUtils.getType("DEPOSIT"),
				InvestmentUtils.parseDate("02/23/2020"), InvestmentUtils.parseDouble("101"), InvestmentUtils.getTransactionPriority("Y"));
		
		TransactionDto dto4= new TransactionDto("SPTX4","HDFC","HJ",  InvestmentUtils.getType("WITHDRAW"),
				InvestmentUtils.parseDate("02/23/2020"), InvestmentUtils.parseDouble("101"), InvestmentUtils.getTransactionPriority("Y"));
		
		transactions.add(dto1);
		transactions.add(dto2);
		transactions.add(dto3);
		transactions.add(dto4);
		
		
		service=new TransactionServiceImpl(transactions);
    }
	
	@Test
	public void display() {
		
		service.display();
		
		
	}


	@Test
	public void add() {
		
		service.add(transactions);
		
	}

}
