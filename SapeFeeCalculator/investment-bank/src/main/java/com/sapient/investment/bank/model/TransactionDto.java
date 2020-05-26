package com.sapient.investment.bank.model;

import java.util.Date;

/**   
 * 
 * @author lakshaynarang
 *
 */   
public class TransactionDto {

	private String transactionId;
	
	private String clientId;
	
	private String securityId;
	
	private Integer transactionType;
	
	private Date transactionDate;
	
	private Double transactionValue;
	
	private Boolean transactionPriority;

	public TransactionDto() {
		super();
	}

	public TransactionDto(String transactionId, String clientId, String securityId, Integer transactionType,
			Date transactionDate, Double transactionValue, Boolean transactionPriority) {
		super();
		this.transactionId = transactionId;
		this.clientId = clientId;
		this.securityId = securityId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionValue = transactionValue;
		this.transactionPriority = transactionPriority;

	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public Integer getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getTransactionValue() {
		return transactionValue;
	}

	public void setTransactionValue(Double transactionValue) {
		this.transactionValue = transactionValue;
	}

	public Boolean getTransactionPriority() {
		return transactionPriority;
	}

	public void setTransactionPriority(Boolean transactionPriority) {
		this.transactionPriority = transactionPriority;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((securityId == null) ? 0 : securityId.hashCode());
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		result = prime * result + ((transactionPriority == null) ? 0 : transactionPriority.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((transactionValue == null) ? 0 : transactionValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionDto other = (TransactionDto) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (securityId == null) {
			if (other.securityId != null)
				return false;
		} else if (!securityId.equals(other.securityId))
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;

		if (transactionPriority == null) {
			if (other.transactionPriority != null)
				return false;
		} else if (!transactionPriority.equals(other.transactionPriority))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (transactionValue == null) {
			if (other.transactionValue != null)
				return false;
		} else if (!transactionValue.equals(other.transactionValue))
			return false;
		return true;
	}

}
