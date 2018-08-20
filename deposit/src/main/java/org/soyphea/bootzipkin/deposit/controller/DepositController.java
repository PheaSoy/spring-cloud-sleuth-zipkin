package org.soyphea.bootzipkin.deposit.controller;

import org.soyphea.bootzipkin.deposit.pojo.DepositResult;
import org.soyphea.bootzipkin.deposit.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepositController {
	
	@Autowired
	private DepositService depositService;
	
	@RequestMapping(value="/deposit",method = RequestMethod.POST)
	public DepositResult deposit(@RequestParam("accountNo") String accountNo,@RequestParam("amount") double amount) {
		DepositResult depositResult = new DepositResult();
		depositResult = depositService.processDeposit(accountNo, amount);
		return depositResult;
		
	}
	
}
