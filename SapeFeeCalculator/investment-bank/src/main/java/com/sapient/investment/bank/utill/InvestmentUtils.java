package com.sapient.investment.bank.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sapient.investment.bank.constant.TransactionConstants;


/**
 * 
 * @author lakshaynarang
 *
 */
public class InvestmentUtils {
	
	public static Integer getType(String type) {

		switch (type) {
		case TransactionConstants.BUY:
			return TransactionConstants.BUY_VALUE;
		case TransactionConstants.SELL:
			return TransactionConstants.SELL_VALUE;
		case TransactionConstants.DEPOSIT:
			return TransactionConstants.DEPOSIT_VALUE;
		case TransactionConstants.WITHDRAW:
			return TransactionConstants.WITHDRAW_VALUE;
		}
		return null;
	}

	public static Date parseDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date transcationday = sdf.parse(date);
			return transcationday;
		} catch (Exception e) {
			return null;
		}
	}

	public static Boolean getTransactionPriority(String pority) {

		if (pority != null && pority.equalsIgnoreCase("Y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Double parseDouble(String prices) {
		try {
			return Double.parseDouble(prices);
		} catch (Exception e) {
			return (double) 0;
		}
	}
}
