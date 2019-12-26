<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/header.jsp" />
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 125px;">
		<div class="form-group text-center">
			<ul class="list-inline">
				<li class="list-inline-item"><i
					class="text-muted fa fa-cc-visa fa-2x"></i></li>
				<li class="list-inline-item"><i
					class="fa fa-cc-mastercard fa-2x"></i></li>
				<li class="list-inline-item"><i class="fa fa-cc-amex fa-2x"></i></li>
				<li class="list-inline-item"><i class="fa fa-cc-discover fa-2x"></i></li>
			</ul>
		</div>
		<div class="text-center px-lg-5">
			<h3 style="color: blue;">${msg}</h3>
			<h3 class="title-w3ls mb-5" style="color: green;">Installment
				Payment</h3>
		</div>
		<div class="contact-w3ls-form mt-5">
			<form action="<c:url value="/loaninfo-search"/>" >
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
			<form  class="w3-pvt-contact-fm" action="/save-installment" method="post">
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<label>Name</label> <input class="form-control" type="text"
								name="name" readonly
								value="${loaninfo.firstName} ${loaninfo.lastName} " required="">
						</div>
						<div class="form-group">
							<label>Username</label> <input class="form-control" type="text"
								name="username" readonly required=""
								value="${loaninfo.username}">
						</div>

						<div class="form-group">
							<label>Email</label> <input class="form-control" type="text"
								name="email" readonly value="${loaninfo.email}" required="">
						</div>
						<div class="form-group">
							<label>Address</label> <input class="form-control" type="text"
								name="address" readonly value="${loaninfo.address}" required="">
						</div>
						<div class="form-group">
							<label>Phone</label> <input class="form-control" type="text"
								name="phone" value="${loaninfo.phone}" required="">
						</div>
						<div class="form-group">
							<label>City</label> <input class="form-control" type="text"
								name="city" required="">
						</div>
						
						<div class="form-group">
							<label>Cuntry</label> <select class="form-control"
								name="country">
								<option value="bangladesh" selected="">Bangladesh</option>
								<option value="bangladesh" selected="">Bangladesh</option>
							</select>
						</div>

					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label>Category</label> <input class="form-control" type="text"
								name="category" readonly value="${loaninfo.category}"
								required="">
						</div>
						<div class="form-group">
							<label>Loan ID</label> <input class="form-control" type="number"
								id="loanId" readonly value="${loaninfo.loanId}" name="loanId" />
								<input class="form-control" type="hidden"
								id="loanAmount" readonly value="${loaninfo.loanAmount}" name="loanAmount" />
						</div>

						<div class="form-group">
							<label>Currency</label> <select class="form-control"
								name="currency">
								<option value="local">Local (BDT)</option>
								<option value="False">International (USD)</option>
							</select>
						</div>

						<div class="form-group">
							<label>Installment Amount</label> <input class="form-control"
								type="number" name="paybleInstallment" readonly
								value="${loaninfo.installmentAmount}" required="">
						</div>
						<div class="form-group">
							<label>Total Amount</label> <input class="form-control"
								type="number" value="${loaninfo.installmentAmount}"
								name="installmentAmount" required="">
						</div>
						<div class="form-group">
							<label>Transection Id </label> <input class="form-control"
								type="text" name="transectionId" readonly="" required="" value="${showtransectionId}">
						</div>
						<div class="form-group mx-auto mt-3">
							<button type="submit" class="btn btn-success btn-block"
								style="margin-top: 43px; height: 59px;"> Check Out</button>
						</div>
					</div>

				</div>

			</form>
		</div>


		<%-- <div class="row justify-content-center" style="margin-top: 20px;">
			<div class="col-md-4">
				<form action="<c:url value="/card-payement"/>"   method="get" class="form-group">
					<h3 style="color: blue;">For Payment Through Card</h3>
					
					<label for="Card_Number">Card Number</label>
					<input type="number" name="cardNumber" class="form-control" id="Card_Number" />
					
					 <label for="Card_Name">Card Holder's Name</label>
					 <input type="text" name="holderName" class="form-control" id="Card_Name" />
					 
					 <label for="expiryDate">Expiry Date</label>
					 <input type="date" name="expiryDate" class="form-control" id="expiryDate" />
					 <br/>
					<input type="submit" class="btn btn-info text-center" value="Pay Now" />
				</form>
			</div>
		</div> --%>


	</div>
</section>


<jsp:include page="../layout/footer.jsp" />
<!-- <script>
	angular.module('app', [])
	.controller('appController', function($scope, $http){
		 $scope.onSubmit = function(){
			 alert();
			 $http.post("/save-installment", {suggest: "fdskfkds"})
			 .then(function(res){
				 console.log(res);
			 }).catch(function(err){
				 console.log(err);
			 });
		}
	});
	
</script> -->

