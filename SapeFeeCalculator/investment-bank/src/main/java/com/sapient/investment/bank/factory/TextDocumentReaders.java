package com.sapient.investment.bank.factory;

import java.util.ArrayList;
import java.util.List;

import com.sapient.investment.bank.api.DocumentReaders;
import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.helper.TransactionHelper;
import com.sapient.investment.bank.model.TransactionDto;


/**
 * 
 * @author lakshaynarang
 *
 */
public class TextDocumentReaders implements DocumentReaders {

	
	public List<TransactionDto> read(String filepath) {
		
		System.out.println("Reading from the text file");
		
		TransactionHelper helper =new TransactionHelper();

        List<TransactionDto> transaction=new ArrayList<TransactionDto>();
        
        transaction.add(helper.getTransaction(InvestmentConstants.TEST_DATA.split(InvestmentConstants.SPLIT)));
		
		 return transaction;
	}

}
