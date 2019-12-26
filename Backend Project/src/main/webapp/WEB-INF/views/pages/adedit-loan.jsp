<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<jsp:include page="../layout/adminheader.jsp" />

<div>
	<style>
		button {
			width: 400px;
			margin-left: 456px;
		}
	</style>
	<div>
		<div class="signup-head">
			<h1>Update Loan Information</h1>
		</div>
		<div class="signup-block">
			<form action="<c:url value="/update-loan"/>" class="w3-pvt-contact-fm" method="post">
				<div class="row">
					<div class="col-md-1"></div>
					<div class="col-lg-5">
						<div class="form-group">
							<label>First Name</label> 
							<input type="hidden" name="loanId" value="${loan.loanId}"/>
							<input class="form-control" type="text"
								name="fName" value="${loan.firstName}" placeholder="Enter First Name" required="">
						</div>
						<div class="form-group">
							<label>Last Name</label> <input class="form-control" type="text"
								name="lName" value="${loan.lastName}" placeholder="Enter Last Name" required="">
						</div>

						<div class="form-group">
							<label>Email</label> <input class="form-control" type="email"
								name="email" value="${loan.email}" placeholder="Enter Email" required="">
						</div>
						<div class="form-group">
							<label>Loan Amount</label> <input class="form-control"
								type="number" value="${loan.loanAmount}" name="loanAmount" placeholder="Enter Amount"
								required="">
						</div>
						<div class="form-group">
							<label>Category</label> <select class="form-control"
								name="category">
								<option value="${loan.category}">${loan.category}</option>
								<option value="personalLOan">Personal Loan</option>
								<option value="bussinessLoan">Bussiness Loan</option>
								<option value="homeLoan">Home Loan</option>
								<option value="autoLoan">Auto Loan</option>
								<option value="helthLoan">Helth Loan</option>
								<option value="educationLoan">Education Loan</option>
							</select>
						</div>
					</div>
					<div class="col-lg-5">
						<div class="form-group">
							<label>Address</label>
							<textarea class="form-control" name="address"
								placeholder="Enter Address" required="">${loan.address}</textarea>
						</div>
						<div class="form-group">
							<label>Phone</label> <input class="form-control" type="number"
								name="phone" value="${loan.phone}" placeholder="Enter Phone Number" required="">
						</div>

						<div class="form-group">
							<label>Username</label> <input class="form-control" type="text"
								name="username" value="${loan.username}" placeholder="Enter Username" required="">
						</div>
						<div class="form-group">
							<label>Password</label> <input class="form-control" type="text"
								name="password" value="${loan.password}" placeholder="Enter Password" required="">
						</div>
						<div class="form-group">
							<label>Installment Type</label> <select class="form-control"
								name="inatallmentType">
								<option value="${loan.installmentType}">${loan.installmentType}</option>
								<option value="Weekly">Weekly</option>
								<option value="Monthly">Monthly</option>
								<option value="Yearly">Yearly</option>
							</select>
						</div>
					</div>
				</div>
				<div class="form-group">
					<button type="submit" class="btn submit btn-success">Update Change</button>
				</div>

			</form>
		</div>
	</div>
</div>



<jsp:include page="../layout/adminfooter.jsp" />