package com.sapient.investment.bank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author lakshaynarang
 *
 */

/**
 * Unit test for InvestmentBank App .
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
	InvestmentUtilsTest.class,
	TransactionHelperTest.class,
	TransactionServiceImplTest.class
})
 
public class InvestmentBankAppTest extends TestCase {
	
	

  
}
