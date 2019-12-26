package com.example.loanmanagement.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loan {

    @SerializedName("loanId")
    @Expose
    private long loanId;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("loanAmount")
    @Expose
    private Integer loanAmount;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("installmentType")
    @Expose
    private String installmentType;
    @SerializedName("installmentAmount")
    @Expose
    private Integer installmentAmount;
    @SerializedName("totalInstallment")
    @Expose
    private Integer totalInstallment;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("updateDate")
    @Expose
    private Object updateDate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalPayableAmount")
    @Expose
    private Integer totalPayableAmount;

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

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
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

    public Integer getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Integer installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Integer getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(Integer totalInstallment) {
        this.totalInstallment = totalInstallment;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(Integer totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loanAmount=" + loanAmount +
                ", category='" + category + '\'' +
                ", installmentType='" + installmentType + '\'' +
                ", installmentAmount=" + installmentAmount +
                ", totalInstallment=" + totalInstallment +
                ", createdDate='" + createdDate + '\'' +
                ", updateDate=" + updateDate +
                ", status='" + status + '\'' +
                ", totalPayableAmount=" + totalPayableAmount +
                '}';
    }
}
