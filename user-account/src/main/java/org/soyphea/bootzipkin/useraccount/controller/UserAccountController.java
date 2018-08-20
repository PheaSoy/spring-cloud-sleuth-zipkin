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

	
	@RequestMapping(value="/accounts/check",method = RequestMethod.POST)
	public boolean deposit(@RequestParam("accountNo") String accountNo) {
		// Logic account
		if(accountNo!=null){
			return true;
		}
		return false
		
	
	}
	
}
