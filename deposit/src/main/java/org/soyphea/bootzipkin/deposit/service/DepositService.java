package org.soyphea.bootzipkin.deposit.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soyphea.bootzipkin.deposit.pojo.DepositResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepositService {
	
	
	public static final Logger logger = LoggerFactory.getLogger(DepositService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	public DepositResult processDeposit(String accountNo,Double amount) {
		
		logger.info("Start service");
		double currentBalance=20.0;
		DepositResult result = new DepositResult();
		result.setAccountNo("000000");
		result.setCode(1);
		result.setPrevBalance(currentBalance);
		result.setPostBalance(currentBalance+amount);
		result.setMsg("Deposit success.");
		result.setTransactionDate(new Date());
		boolean isOk = restTemplate.getForObject("http://localhost:8084/api/accounts/check", Boolean.class);
		logger.info("Check account:"+isOk);
		return result;
		
	}
	
}
