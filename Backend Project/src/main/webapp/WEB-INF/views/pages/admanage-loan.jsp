<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../layout/adminheader.jsp" />

<div class="row" style="margin-left: 10px; padding-right: 30px;">

	
	<h1 align="center" style="color: green; margin-top: 35px; margin-bottom: 30px;">Show Loan Information</h1>
	<table class="table table-striped table-bordered" style="margin-bottom: 50px;">
		<thead style="background-color: lightblue;">
			<tr>
				<td>Loan Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Address</td>
				<td>Username</td>
				<td>Loan Category</td>
				<td>Loan Amount</td>
				<td>Payable Amount</td>
				<td>Total Installment</td>
				<td colspan="2">Action</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="loan" items="${loanList}">
				<tr>
					<td>${loan.loanId}</td>
					<td>${loan.firstName} ${loan.lastName}</td>
					<td>${loan.email}</td>
					<td>${loan.phone}</td>
					<td>${loan.address}</td>
					<td>${loan.username}</td>
					<td>${loan.category}</td>
					<td>${loan.loanAmount}</td>
					<td>${loan.totalPayableAmount}</td>
					<td>${loan.totalInstallment}</td>
					<td><a class="btn btn-success"
						href="<c:url value="/edit-loan/${loan.loanId}"/>" ><i class="fa fa-edit"></i></a></td>
					<td> <a
						class="btn btn-danger" href="<c:url value="/delete-loan/${loan.loanId}"/>" ><i
							class="fa fa-trash"></i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<jsp:include page="../layout/adminfooter.jsp" />