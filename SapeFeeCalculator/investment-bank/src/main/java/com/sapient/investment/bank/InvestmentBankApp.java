package com.sapient.investment.bank;

import java.io.IOException;
import java.util.List;

import com.sapient.investment.bank.api.DocumentWriters;
import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.factory.DocumentReadersFactory;
import com.sapient.investment.bank.factory.DocumentWriterFactory;
import com.sapient.investment.bank.model.TransactionDto;
import com.sapient.investment.bank.service.TransactionService;
import com.sapient.investment.bank.service.impl.TransactionServiceImpl;

/**
 * 
 * @author lakshaynarang
 *
 */

public class InvestmentBankApp 
{
    public static void main( String[] args ) {
    	System.out.println( "======== START ============");
    	System.out.println( "======== INVESTMENT BANK APPLICATION ============");
    	System.out.println( "======== RUNNING THE MAIN CLASS ==============");
    	System.out.println( "======== SAPIENT FEE CALCULATOR============");
    	System.out.println( "======== READING DATA FROM INPUT CSV AND WRITING IT IN OUTPUT CSV============");
    	System.out.println( "======== BEFORE APPLYING FEE ============");
        try {
			List<TransactionDto> transactions =DocumentReadersFactory.readFile("CSV", InvestmentConstants.INVESTMENT_BANK_INPUT_CSV_FILE);
			transactions.stream().forEach(transaction -> System.out.println(transaction)); 
			TransactionService transactionService=new TransactionServiceImpl();
			transactionService.add(transactions);
			
			System.out.println( "======== AFTER APPLYING FEE ============");
			transactionService.display();
			DocumentWriters write =DocumentWriterFactory.createWriters("CSV");
			write.write(InvestmentConstants.INVESTMENT_BANK_OUTPUT_CSV_FILE, transactions);
			System.out.println( "======== END OF THE MAIN CLASS ============");
			System.out.println( "======== EXIT ============");
		} catch (ParseException | IOException e) {
			System.out.println("unable to Read the file  " + e.getMessage());
			e.printStackTrace();
		}
      
        
        
    }
}
