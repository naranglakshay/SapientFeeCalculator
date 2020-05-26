package com.sapient.investment.bank;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.helper.TransactionHelper;
import com.sapient.investment.bank.model.TransactionDto;
import com.sapient.investment.bank.utill.InvestmentUtils;

/**
 * 
 * @author lakshaynarang
 *
 */

public class TransactionHelperTest {
	
	TransactionDto dto= new TransactionDto();
	
	@Before
    public void setupTransaction() {
		
		dto=new TransactionDto("SPTX1","HDFC","GS",  InvestmentUtils.getType("BUY"),
				InvestmentUtils.parseDate("02/11/2020"), InvestmentUtils.parseDouble("111"), InvestmentUtils.getTransactionPriority("Y"));
		
		
	}
	
	@Test
	public void getTransaction() {
		
		String[] transaction = InvestmentConstants.TEST_DATA.split(InvestmentConstants.SPLIT);
		
		assertEquals(dto, new TransactionHelper().getTransaction(transaction));
		
	}

}
