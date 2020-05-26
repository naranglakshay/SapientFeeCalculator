package com.sapient.investment.bank.api;

import java.util.List;

import com.sapient.investment.bank.exceptions.ParseException;
import com.sapient.investment.bank.model.TransactionDto;

/**
 * 
 * @author lakshaynarang
 *
 */

@FunctionalInterface
public interface DocumentReaders {
	
	List<TransactionDto> read(String filepath) throws ParseException ;
}
