package com.epam.multithread.domain;

public class Account {

	private Integer id;

	private User user;

	private Integer balance;

	/**
	 * @param id
	 * @param balance
	 */
	public Account(Integer id, Integer balance) {
		this.id = id;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void addAmount(Integer amount) {
		this.balance = this.balance + amount;
	}

	public void removeMount(Integer amount) {
		this.balance = this.balance - amount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", user=" + user + ", balance=" + balance
				+ "]";
	}

}
