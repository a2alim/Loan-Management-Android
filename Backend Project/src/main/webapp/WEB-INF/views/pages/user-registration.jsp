<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../layout/header.jsp" />

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 125px;">
		<div class="text-center px-lg-5">
			<h3 style="color: green;">${msg}</h3>
			<h3 class="title-w3ls mb-5" style="color: green;">Please Registation</h3>
		</div>
		<div class="contact-w3ls-form mt-5">
			<form action="<c:url value="/api/user/save-user-registration"/>" class="w3-pvt-contact-fm"
				enctype="multipart/form-data" method="post">
				
				<div class="row" style="margin-top: 50px;">
					<div class="col-md-6">
						<div class="form-group">
							<label>Add Your Picture</label> <input type="file" name="filename"
								accept="image/x-png,image/gif,image/jpeg" />
						</div>
					</div>
					
				</div>
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<label>First Name</label> <input class="form-control" type="text"
								name="fName" placeholder="Enter First Name" required="">
						</div>
						<div class="form-group">
							<label>Last Name</label> <input class="form-control" type="text"
								name="lName" placeholder="Enter last Name" required="">
						</div>

						<div class="form-group">
							<label>Email</label> <input class="form-control" type="email"
								name="email" placeholder="Enter Email" required="">
						</div>
						<div class="form-group">
							<label>Phone</label> <input class="form-control" type="number"
								name="phone" placeholder="Enter Phone" required="">
						</div>
						<div class="form-group">
							<label>Created Date</label> <output class="form-control"
								type="text" id="demo" name="createDate" />
						</div>
						<div class="form-group">
							<label>Role</label> <select class="form-control" name="role">
								<option value="User">User</option>
							</select>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label>Address</label>
							<textarea class="form-control" name="address" placeholder="Enter Full Address "
								required=""></textarea>
						</div>

						<div class="form-group">
							<label>Username</label> <input class="form-control" type="text"
								name="username" placeholder="Enter Username" required="">
						</div>
						<div class="form-group">
							<label>Password</label> <input class="form-control" type="text"
								name="password" placeholder="Enter Password" required="">
						</div>
						<div class="form-group">
							<label>Enabled</label> <select class="form-control"
								name="enabled">
								<option value="True">True</option>
								<option value="False">False</option>
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

<script>
	var d = new Date();
	document.getElementById("demo").innerHTML = d;
</script>

<jsp:include page="../layout/footer.jsp" />