<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/adminheader.jsp" />

<div class="row" style="margin-left: 40px; margin-top:40px">

	<h1 align="center" style="margin-top:30px; color: green;">Pending Loan Details</h1>
	
	<table align="center" class="table table-striped " style="margin-top:30px; width: 80%; margin-bottom: 50px">
		
			<tr>
				<td>First Name</td>
				<td>${pendingLoan.firstName}</td>
				<td>Last Name</td>
				<td>${pendingLoan.lastName}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${pendingLoan.email}</td>
				<td>Phone</td>
				<td>${pendingLoan.phone}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${pendingLoan.address}</td>
				<td>Loan Status</td>
				<td>${pendingLoan.status}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${pendingLoan.email}</td>
				<td>Phone</td>
				<td>${pendingLoan.phone}</td>
			</tr>
			<tr>
				<td>Username</td>
				<td>${pendingLoan.username}</td>
				<td>Password</td>
				<td>${pendingLoan.password}</td>
			</tr>
			<tr>
				<td>Loan Category</td>
				<td>${pendingLoan.category}</td>
				<td>Loan Amount</td>
				<td>${pendingLoan.loanAmount}</td>
			</tr>
			<tr>
				<td>Installment Type</td>
				<td>${pendingLoan.installmentType}</td>
				<td>Installment Amount</td>
				<td>${pendingLoan.installmentAmount}</td>
			</tr>
			<tr>
				<td><a class="btn btn-success" href="<c:url value="/status/approved/${pendingLoan.loanId}"/>">Approved Loan</a></td>
				<td><a class="btn btn-primary" href="<c:url value="/status/waiting/${pendingLoan.loanId}"/>" > Waiting Loan</a></td>
				<td><a class="btn btn-danger" href="<c:url value="/status/rejected/${pendingLoan.loanId}"/>" >Rejected Loan</a></td>
				<td><a class="btn btn-danger" href="<c:url value="/status/delete/${pendingLoan.loanId}"/>" >delete Loan</a></td>
			</tr>
			
	</table>
</div>



<jsp:include page="../layout/adminfooter.jsp" />