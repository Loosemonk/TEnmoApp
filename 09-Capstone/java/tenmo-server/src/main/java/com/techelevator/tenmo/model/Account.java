package com.techelevator.tenmo.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Account {
	   private int id;
	   private int user_id;
	   private BigDecimal balance;
	   private boolean activated;
	

	   public Account() { }

	   public Account(int  id, int user_id, BigDecimal balance) {
	      this.setId(id);
	      this.setUser_id(user_id);
	      this.setBalance(balance);
	      this.setActivated(true);
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
}
