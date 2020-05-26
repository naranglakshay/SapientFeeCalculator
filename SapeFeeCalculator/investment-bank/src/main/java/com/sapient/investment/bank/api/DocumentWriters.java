package com.sapient.investment.bank.api;

import java.util.List;

import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.model.TransactionDto;

/**
 * 
 * @author lakshaynarang
 *
 */

public interface DocumentWriters {
	
	void write(String filepath,List<TransactionDto> transactions) throws ParseException ;

}
