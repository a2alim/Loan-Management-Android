package com.example.loanmanagement.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Installment {
    @SerializedName("installmentId")
    @Expose
    private Integer installmentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("loanId")
    @Expose
    private long loanId;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("loanAmount")
    @Expose
    private Integer loanAmount;
    @SerializedName("installmentAmount")
    @Expose
    private Integer installmentAmount;
    @SerializedName("totalPaid")
    @Expose
    private Integer totalPaid;
    @SerializedName("totalPayable")
    @Expose
    private Integer totalPayable;
    @SerializedName("installmentDate")
    @Expose
    private String installmentDate;

    public Integer getInstallmentId() {
        return installmentId;
    }

    public void setInstallmentId(Integer installmentId) {
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

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Integer installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Integer getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Integer totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Integer getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(Integer totalPayable) {
        this.totalPayable = totalPayable;
    }

    public String getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(String installmentDate) {
        this.installmentDate = installmentDate;
    }

    @Override
    public String toString() {
        return "Installment{" +
                "installmentId=" + installmentId +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", loanId=" + loanId +
                ", category='" + category + '\'' +
                ", loanAmount=" + loanAmount +
                ", installmentAmount=" + installmentAmount +
                ", totalPaid=" + totalPaid +
                ", totalPayable=" + totalPayable +
                ", installmentDate='" + installmentDate + '\'' +
                '}';
    }
}
