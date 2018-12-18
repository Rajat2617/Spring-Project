package com.jspiders.spring.injection.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "paytm_table")
public class PayTmDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "user_id")
	private int pUserId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "wallet_balance")
	private double walletBalance;
	@Column(name = "no_of_transactions")
	private int noOfTransactions;

	public PayTmDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !");
	}

	public int getpUserId() {
		return pUserId;
	}

	public void setpUserId(int pUserId) {
		this.pUserId = pUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	public void setNoOfTransactions(int noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}

}
