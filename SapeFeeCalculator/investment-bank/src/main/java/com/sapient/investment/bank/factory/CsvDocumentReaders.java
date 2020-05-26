package com.sapient.investment.bank.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.sapient.investment.bank.api.DocumentReaders;
import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.helper.TransactionHelper;
import com.sapient.investment.bank.model.TransactionDto;

/**   
 * 
 * @author lakshaynarang
 *
 */

public class CsvDocumentReaders implements DocumentReaders{
	
	@Override
	public List<TransactionDto> read(String filename) throws ParseException {
		
		List<TransactionDto> list = new ArrayList<TransactionDto>();
        String line = "";
        TransactionHelper helper =new TransactionHelper();
        
        InputStream in=this.getClass().getClassLoader().getResourceAsStream(filename);
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            while ((line = reader.readLine()) != null) {
                String[] transaction = line.split(InvestmentConstants.SPLIT);
                
                TransactionDto data =helper.getTransaction(transaction);
                
                list.add(data);
            }
           
        } catch (IOException e) {
            System.out.println(InvestmentConstants.CANNOT_PARSE_FILE+ e.getStackTrace());
			throw new ParseException(InvestmentConstants.CANNOT_PARSE_FILE , e);		
		}
		
		return list;
	}

}
