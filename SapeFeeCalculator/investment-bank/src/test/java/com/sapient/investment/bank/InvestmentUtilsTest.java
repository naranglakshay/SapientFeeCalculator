package com.sapient.investment.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.sapient.investment.bank.constant.TransactionConstants;
import com.sapient.investment.bank.utill.InvestmentUtils;

import junit.framework.Assert;

/**
 * 
 * @author lakshaynarang
 *
 */


public class InvestmentUtilsTest {
	
	@Test
	public void parseDouble() {
		
		assertEquals(10.2,InvestmentUtils.parseDouble("10.2"),0);
	}
	
	@Test
	public void parseDate() throws ParseException {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
         Date today = sdf.parse("02/11/2020");
		 assertEquals(today,InvestmentUtils.parseDate("02/11/2020"));
	}
	
	@Test
	public void getType() {
		
		 assertEquals(1,InvestmentUtils.getType(TransactionConstants.BUY),0);
		 assertEquals(2,InvestmentUtils.getType(TransactionConstants.SELL),0);
		 assertEquals(3,InvestmentUtils.getType(TransactionConstants.DEPOSIT),0);
		 assertEquals(4,InvestmentUtils.getType(TransactionConstants.WITHDRAW),0);
		
	}
	
}
