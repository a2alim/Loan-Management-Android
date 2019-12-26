<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../layout/header.jsp" />

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 125px;">
		<div class="text-center px-lg-5">
			<h3 style="color: green;">${msg}</h3>
			<h3 class="title-w3ls mb-5" style="color: green;">Apply For Loan</h3>
		</div>
		<div class="contact-w3ls-form mt-5">
		
		<form action="<c:url value="/api/user/userinfo-search"/>" >
				<div class="row" style="margin-left: 96px;">

					<div class="col-lg-5">
						<div class="form-group">
							<input class="form-controller" type="number" name="earchloanId"
								placeholder="Search bye User ID" required=""/>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<button type="submit" class="btn btn-success" style="width: 200px; height: 55px;">Search</button>
						</div>
					</div>

				</div>
			</form>

			<form  action="<c:url value="/saveloan"/>"  class="w3-pvt-contact-fm" method="post">
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<label>First Name</label> <input class="form-control" type="text"
								name="fName" value="${userInfo.firstName}" readonly placeholder="Enter First Name" required="" >
						</div>
						<div class="form-group">
							<label>Last Name</label> <input class="form-control" type="text"
								name="lName" value="${userInfo.lastName}" readonly placeholder="Enter Last Name" required="">
						</div>

						<div class="form-group">
							<label>Email</label> <input class="form-control" type="email"
								name="email" value="${userInfo.email}" readonly placeholder="Enter Email" required="">
						</div>
						<div class="form-group">
							<label>Phone</label> <input class="form-control" type="number"
								name="phone" value="${userInfo.phone}" readonly placeholder="Enter Phone Number" required="">
						</div>
						<div class="form-group">
							<label>Loan Amount</label> <input class="form-control"
								type="number" name="loanAmount" placeholder="Enter Amount"
								required="">
						</div>
						<div class="form-group">
							<label>Category</label> <select class="form-control"
								name="category">
								<option value="personalLOan">Personal Loan</option>
								<option value="bussinessLoan">Bussiness Loan</option>
								<option value="homeLoan">Home Loan</option>
								<option value="autoLoan">Auto Loan</option>
								<option value="helthLoan">Helth Loan</option>
								<option value="educationLoan">Education Loan</option>
							</select>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label>Address</label>
							<textarea class="form-control" name="address"
								placeholder="Enter Address" required="" readonly>${userInfo.address}</textarea>
						</div>

						<div class="form-group">
							<label>Username</label> <input class="form-control" type="text"
								name="username" value="${userInfo.username}" readonly placeholder="Enter Username" required="">
						</div>
						<div class="form-group">
							<label>Password</label> <input class="form-control" type="text"
								name="password" value="${userInfo.password}" readonly placeholder="Enter Password" required="">
						</div>
						<div class="form-group">
							<label>Installment Type</label> <select class="form-control"
								name="inatallmentType">
								<option value="Weekly">Weekly</option>
								<option value="Monthly">Monthly</option>
								<option value="Yearly">Yearly</option>
							</select>
						</div>
					</div>
					<div class="form-group mx-auto mt-3">
						<button type="submit" class="btn submit btn-success">Submit</button>
					</div>
				</div>

			</form>
		</div>
	</div>
</section>


<jsp:include page="../layout/footer.jsp" />