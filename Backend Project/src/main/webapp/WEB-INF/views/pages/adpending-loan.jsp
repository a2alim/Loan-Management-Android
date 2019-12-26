<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../layout/adminheader.jsp" />


<div class="row" style="margin-left: 40px; margin-top: 20px;">
	
	<c:if test='${Boolean.parseBoolean(pendinLoanList.isEmpty())}'>
		<h1 align="center" style="color: red; margin-top: 200px;">There is not available Pending Loan</h1>
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</c:if>
	
	
	<c:if test='${Boolean.parseBoolean(!pendinLoanList.isEmpty())}'>
		<h1 align="center" style="color: green; margin-top: 40px;"> Show Pending Loan</h1>
		<table align="center" class="table table-striped " style="margin-top:30px; width: 90%; margin-bottom: 50px">
		<thead>
			<tr>
				<td>Loan Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Address</td>
				<td>Loan Status</td>
				<td>Loan Amount</td>
				<td>Action</td>
			</tr>
		</thead>
		</c:if>
		<tbody>
			<c:forEach var="ploan" items="${pendinLoanList}">
				<tr>
					<td>${ploan.loanId}</td>
					<td>${ploan.firstName} ${ploan.lastName}</td>
					<td>${ploan.email}</td>
					<td>${ploan.address}</td>
					<td>${ploan.status}</td>
					<td>${ploan.loanAmount}</td>
					<td><a data-toggle="modal" class="btn btn-success"
						href="<c:url value="/pending-loan/${ploan.loanId}"/>" >Show loan details</i>
					</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</div>


<jsp:include page="../layout/adminfooter.jsp" />