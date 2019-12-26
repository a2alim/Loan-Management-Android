package com.exam.model;

import java.io.Serializable;
import java.util.Date;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Installment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long installmentId;
	private String name;
	private String username;
	@Email
	private String email;
	private String address;

	private long loanId;
	private String category;
	private long loanAmount;
	private long installmentAmount;
	private long totalPaid;
	private long totalPayable;
	private Date installmentDate;
	
	public long getInstallmentId() {
		return installmentId;
	}
	public void setInstallmentId(long installmentId) {
		this.installmentId = installmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(long installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	
	
	public Date getInstallmentDate() {
		return installmentDate;
	}
	public void setInstallmentDate(Date date) {
		this.installmentDate = date;
	}
	public long getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(long totalPaid) {
		this.totalPaid = totalPaid;
	}
	public long getTotalPayable() {
		return totalPayable;
	}
	public void setTotalPayable(long totalPayable) {
		this.totalPayable = totalPayable;
	}
	@Override
	public String toString() {
		return "Installment [installmentId=" + installmentId + ", name=" + name + ", username=" + username + ", email="
				+ email + ", address=" + address + ", loanId=" + loanId + ", category=" + category + ", loanAmount="
				+ loanAmount + ", installmentAmount=" + installmentAmount + ", totalPaid=" + totalPaid
				+ ", totalPayable=" + totalPayable + ", installmentDate=" + installmentDate + "]";
	}
	
	
}
