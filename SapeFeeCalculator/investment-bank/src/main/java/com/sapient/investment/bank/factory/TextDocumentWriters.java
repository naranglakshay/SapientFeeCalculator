package com.sapient.investment.bank.factory;

import java.util.List;

import com.sapient.investment.bank.api.DocumentWriters;
import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.model.TransactionDto;


/**
 * 
 * @author lakshaynarang
 *
 */
public class TextDocumentWriters  implements  DocumentWriters{

	@Override
	public void write(String filepath,List<TransactionDto> transactions) throws ParseException {
		// TODO Auto-generated method stub
		
		System.out.println("WRITING THE DATA IN FILEPATH -> " +filepath + "LOCATION");
	}

}
