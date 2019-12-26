<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../layout/header.jsp" />

<div class="row" style="margin-left: 40px">

	
	<h1 style="color: green; margin-top: 200px; margin-bottom: 30px;" align="center">Show User Loan Status.</h1>
	<table class="table table-dark table-striped" style="margin-bottom: 30px;">
		<thead>
			<tr>
				<td>Loan Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Address</td>
				<td>Username</td>
				<td>Loan Amount</td>
				<td>Installment Type</td>
				<td>Installment Amount</td>
				<td>Total Installment</td>
				<td>Status</td>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="loan" items="${checkLoanList}">
				<tr>
					<td>${loan.loanId}</td>
					<td>${loan.firstName} ${loan.lastName}</td>
					<td>${loan.email}</td>
					<td>${loan.phone}</td>
					<td>${loan.address}</td>
					<td>${loan.username}</td>
					<td>${loan.loanAmount}</td>
					<td>${loan.installmentType}</td>
					<td>${loan.installmentAmount}</td>
					<td>${loan.totalInstallment}</td>
					<td><a href="#" class="btn btn-success">${loan.status}</a></td>
				</tr>
			</c:forEach>
		</tbody> 
	</table>
</div>

<jsp:include page="../layout/footer.jsp" />