<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/adminheader.jsp" />

<div class="row"
	style="margin-left: 40px; margin-right: 2rem; padding-bottom: 5rem; border: 2px solid green;">
	<h1 class="text-center text-success">Show User Report</h1>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<a href="<c:url value="/user-report"/>">
				<div class="card-body">
					<h2 class="text-primary">Show Total User</h2>
					<p class="card-text">View Total Information. And Can Download
						The Report</p>
					<a href="<c:url value="/user-report"/>" class="btn btn-primary">Show
						Report</a>
				</div>
			</a>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<form action="<c:url value="/user-report-byId"/>" method="post">
					<h2 class="text-primary">Show User By ID</h2>
					<input type="number" name="userId" required="" /> <input
						type="submit" value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<h2 class="text-primary">Show User By Username</h2>
				<form action="<c:url value="/user-report-byUsernmae"/>"
					method="post">
					<input type="text" name="username" /> <input type="submit"
						value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
</div>



<div class="row"
	style="margin-left: 40px; margin-right: 2rem; margin-top: 10px; padding-bottom: 5rem; border: 2px solid blue;">
	<h1 class="text-center text-success">Show Loan Report</h1>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<a href="<c:url value="/loan-report"/>">
				<div class="card-body">
					<h2 class="text-primary">Show Total Loan</h2>
					<p class="card-text">View Total loan Information. And Can Download
						The Report</p>
					<a href="<c:url value="/loan-report"/>" class="btn btn-primary">Show
						Report</a>
				</div>
			</a>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<form action="<c:url value="/loan-report-byId"/>" method="post">
					<h2 class="text-primary">Show Loan By Loan ID</h2>
					<input type="number" name="loanId" required="" /> <input
						type="submit" value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<h2 class="text-primary">Show Loan By Username</h2>
				<form action="<c:url value="/loan-report-byUsernmae"/>"
					method="post">
					<input type="text" name="username" /> <input type="submit"
						value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
</div>



<div class="row"
	style="margin-left: 40px; margin-top: 10px; margin-right: 2rem; margin-bottom: 10px; padding-bottom: 5rem; border: 2px solid green;">
	<h1 class="text-center text-success">Show Installment & Mail Report</h1>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<a href="<c:url value="/mail-report"/>">
				<div class="card-body">
					<h2 class="text-primary">Show Mail Report</h2>
					<p class="card-text">View Total Customers mail. And Can Download
						The Report</p>
					<a href="<c:url value="/mail-report"/>" class="btn btn-primary">Show
						Report</a>
				</div>
			</a>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<form action="<c:url value="/installment-report-byloanId"/>" method="post">
					<h2 class="text-primary">Show Installment By Loan ID</h2>
					<input type="number" name="loanId" required="" /> <input
						type="submit" value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4">
		<div class="card"
			style="width: 25rem; margin-left: 3rem; margin-top: 2rem;">
			<div class="card-body">
				<h2 class="text-primary">Show Installment By Username</h2>
				<form action="<c:url value="/installment-report-byUsernmae"/>"
					method="post">
					<input type="text" name="username" /> <input type="submit"
						value="Show Report" class="btn btn-primary">
				</form>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../layout/adminfooter.jsp" />