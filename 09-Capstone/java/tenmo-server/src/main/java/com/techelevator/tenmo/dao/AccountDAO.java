package com.techelevator.tenmo.dao;


import java.math.BigDecimal;
import java.util.List;

import com.techelevator.tenmo.model.Account;

public interface AccountDAO {

	public BigDecimal getBalance(String usename);

	List<Account> findAll();
}
