package com.sapient.investment.bank.helper;

import java.util.ArrayList;
import java.util.List;

import com.sapient.investment.bank.constant.InvestmentConstants;
import com.sapient.investment.bank.constant.TransactionConstants;
import com.sapient.investment.bank.model.TransactionDto;
import com.sapient.investment.bank.utill.InvestmentUtils;


/**
 * 
 * @author lakshaynarang
 *
 */
public class TransactionHelper {

	private List<TransactionDto> transactions = new ArrayList<>();

	public TransactionHelper() {
		super();
	}   

	public TransactionHelper(List<TransactionDto> transactions) {
		super();
		this.transactions = transactions;
	}

	public TransactionDto getTransaction(String[] transcationData) {

		TransactionDto transcation = new TransactionDto();

		transcation.setTransactionId(transcationData[0]);
		transcation.setSecurityId(transcationData[1]);
		transcation.setClientId(transcationData[2]);
		transcation.setTransactionType(InvestmentUtils.getType(transcationData[3]));
		transcation.setTransactionDate(InvestmentUtils.parseDate(transcationData[4]));
		transcation.setTransactionValue(InvestmentUtils.parseDouble(transcationData[5]));
		transcation.setTransactionPriority(InvestmentUtils.getTransactionPriority(transcationData[6]));
		return transcation;
	}

	public TransactionDto getCharge(TransactionDto transcation) {

		if (isIntraDay(transcation)) {
			transcation.setTransactionValue(transcation.getTransactionValue() + InvestmentUtils.parseDouble("10"));
		} else {

			if (transcation.getTransactionPriority()) {
				transcation.setTransactionValue(transcation.getTransactionValue() + InvestmentUtils.parseDouble("500"));

			} else {
				
				if (transcation.getTransactionType() == TransactionConstants.SELL_VALUE || transcation.getTransactionType() == TransactionConstants.WITHDRAW_VALUE) {
						transcation.setTransactionValue(transcation.getTransactionValue() + InvestmentUtils.parseDouble("100"));

				} else if (transcation.getTransactionType() == TransactionConstants.BUY_VALUE || transcation.getTransactionType() == TransactionConstants.DEPOSIT_VALUE) {
					transcation.setTransactionValue(transcation.getTransactionValue() + InvestmentUtils.parseDouble("50"));
				}
			}
		}
		return transcation;
	}

	private boolean isIntraDay(TransactionDto dto) {
		boolean value = false;
		if (transactions != null && transactions.size() > 0) {
			for (TransactionDto transaction : transactions) {
				if (transaction.getClientId().equals(dto.getClientId())
						&& transaction.getSecurityId().equals(dto.getSecurityId())
						&& transaction.getTransactionDate().equals(dto.getTransactionDate())) {
					if (transaction.getTransactionType() == TransactionConstants.BUY_VALUE
							&& dto.getTransactionType() == TransactionConstants.SELL_VALUE
							|| (transaction.getTransactionType() == TransactionConstants.DEPOSIT_VALUE
									&& dto.getTransactionType() == TransactionConstants.WITHDRAW_VALUE)) {
						value = true;
						break;
					}
				}
			}
		}
		return value;
	}

}
