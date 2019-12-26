<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/adminheader.jsp" />

<section>
	<div class="container" style="margin-top: 25px; margin-right: 180px;">



		<div class="text-center px-lg-5">

			<h2 class="title-w3ls mb-5"
				style="color: green; margin-bottom: 20px;">Manage Installment</h2>
		</div>
		<div class="row">
			<form action="<c:url value="/adsearch-installment"/>">
				<div class="row">

					<div class="col-lg-6">
						<div class="form-group">
							<input type="number" name="searchloanId"
								placeholder="Search by loan Id" required="" />
							<button type="submit" class="btn btn-success">Search</button>
						</div>
					</div>

				</div>
			</form>

			<c:if test='${Boolean.parseBoolean(installmentListView.isEmpty())}'>
				<h1 align="center" style="color: red; margin-top: 200px;">There
					is no Matching Installment.</h1>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
			</c:if>

			<div style="margin-bottom: 200px; margin-right: 2000px;">
				<table class="table table-striped table-bordered"
					style="">
					<c:if test='${!installmentListView.isEmpty()}'>
						<thead>
							<tr>
								<td>Installment Id</td>
								<td>Name</td>
								<td>Email</td>
								<td>Address</td>
								<td>Username</td>
								<td>Loan Category</td>
								<td>Loan Amount</td>
								<td>Payable Amount</td>
								<td>Total Paid</td>
								<td>Total Installment</td>
								<td>Installment Amount</td>
								<td>Installment Date</td>
								<td colspan="2">Action</td>
							</tr>
						</thead>
					</c:if>
					<tbody>
						<c:forEach var="installment" items="${installmentListView}">
							<tr>
								<td>${installment.installmentId}</td>
								<td>${installment.name}</td>
								<td>${installment.email}</td>
								<td>${installment.address}</td>
								<td>${installment.username}</td>
								<td>${installment.category}</td>
								<td>${installment.loanAmount}</td>
								<td>${installment.totalPayable}</td>
								<td>${installment.totalPaid}</td>
								<td>${totalInstallment}</td>
								<td>${installment.installmentAmount}</td>
								<td>${installment.installmentDate}</td>
								<td><a class="btn btn-success" href="#"><i
										class="fa fa-edit"></i></a></td>
								<td><a class="btn btn-danger" href="#"><i
										class="fa fa-trash"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h2 style="color: red;">${msg}</h2>

			</div>
		</div>
	</div>
</section>


<jsp:include page="../layout/adminfooter.jsp" />

