<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<jsp:include page="../layout/header.jsp" />

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 125px;">
		<div class="text-center px-lg-5">
			<h3 style="color: green;">${msg}</h3>
			<h3 class="title-w3ls mb-5" style="color: green;">Your
				Installment Status</h3>
		</div>
		<div class="contact-w3ls-form mt-5">
			<form action="<c:url value="/get-installment-status"/>" >
				<div class="row" style="margin-left: 96px;">

					<div class="col-lg-6">
						<div class="form-group">
							<input class="form-controller" type="number" name="earchloanId"
								placeholder="Search bye loan ID" required="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<button type="submit" class="btn btn-success"
								style="width: 200px; height: 55px;">Search</button>
						</div>
					</div>

				</div>
			</form>

			<div class="row">
				<c:if test='${Boolean.parseBoolean(installmentList.isEmpty())}'>
			<h1 align="center" style="color: red; margin-top: 200px;">There
				is no Matching Installment. Please insert correct Loan ID.</h1>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</c:if>
				<c:if test='${!Boolean.parseBoolean(installmentList.isEmpty())}'>
					<table class="table table-success table-striped table-bordered">
						<thead style="color: blue;">
							<tr>
								<td>Nmae</td>
								<td>Email</td>
								<td>Username</td>
								<td>Loan Id</td>
								<td>Total Amount</td>
								<td>Loan Paid</td>
								<td>Loan Payable</td>
								<td>Paid Amount</td>
								<td>Installment Date</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="installment" items="${installmentList}">
								<tr>
									<td>${installment.name}</td>
									<td>${installment.email}</td>
									<td>${installment.username}</td>
									<td>${installment.loanId}</td>
									<td>${installment.loanAmount}</td>
									<td>${installment.totalPaid}</td>
									<td>${installment.totalPayable}</td>
									<td>${installment.installmentAmount}</td>
									<td>${installment.installmentDate}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
		</div>
	</div>
</section>


<jsp:include page="../layout/footer.jsp" />

