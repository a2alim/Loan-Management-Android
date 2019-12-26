package com.exam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ApplyLoan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	@Email
	private String email;
	@NotNull
	@Size(min=3, max=12)
	private String username;
	@NotNull
	private String password;
	private long loanAmount;
	private String category;
	private String installmentType;
	private long installmentAmount;
	private int totalInstallment;
	private Date createdDate;
	private Date updateDate;
	private String status;
	private Long totalPayableAmount;
	
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getInstallmentType() {
		return installmentType;
	}
	public void setInstallmentType(String installmentType) {
		this.installmentType = installmentType;
	}
	
	
	
	public long getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(long installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public int getTotalInstallment() {
		return totalInstallment;
	}
	public void setTotalInstallment(int totalInstallment) {
		this.totalInstallment = totalInstallment;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Long getTotalPayableAmount() {
		return totalPayableAmount;
	}
	public void setTotalPayableAmount(Long totalPayableAmount) {
		this.totalPayableAmount = totalPayableAmount;
	}
	@Override
	public String toString() {
		return "ApplyLoan [loanId=" + loanId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", address=" + address + ", email=" + email + ", username=" + username + ", password="
				+ password + ", loanAmount=" + loanAmount + ", category=" + category + ", installmentType="
				+ installmentType + ", installmentAmount=" + installmentAmount + ", totalInstallment="
				+ totalInstallment + ", createdDate=" + createdDate + ", updateDate=" + updateDate + ", status="
				+ status + ", totalPayableAmount=" + totalPayableAmount + "]";
	}
	
	
}
