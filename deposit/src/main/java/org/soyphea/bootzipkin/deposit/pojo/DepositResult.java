package org.soyphea.bootzipkin.deposit.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DepositResult extends BaseResult{
	
	String accountNo;
	double prevBalance;
	double postBalance;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
	Date transactionDate;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(double prevBalance) {
		this.prevBalance = prevBalance;
	}
	public double getPostBalance() {
		return postBalance;
	}
	public void setPostBalance(double postBalance) {
		this.postBalance = postBalance;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	

}
