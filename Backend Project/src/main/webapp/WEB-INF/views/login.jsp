<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous" />

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 20px;">
		<div class="form-row">
			<div class="card"
				style="width: 25rem; margin: auto; padding-bottom: 20px; background-color: pink;">
				<div class="col-md-12">
					<h3 align="center" style="color: #0000FF; margin:20px">Welcome to <br> Loan Management</h3>
				</div>
				<form  action="<c:url value="/login"/>"  method="post" >
					<div class="col-md-12">
						<h3 style="color: green; margin-bottom: 20px;" align="center">Login</h3>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text" id="inputGroupPrepend3"><i
										class="fa fa-user"></i></span>
								</div>
								<input type="text" name="username" class="form-control is-valid"
									placeholder="Username" aria-describedby="inputGroupPrepend3"
									required>
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text" id="inputGroupPrepend3"><i
										class="fa fa-key"></i></span>
								</div>
								<input type="password" class="form-control is-valid"
									placeholder="Password" name="password"
									aria-describedby="inputGroupPrepend3" required>
							</div>
						</div>
						<button class="btn btn-primary btn-block" type="submit">Login</button>
					</div>
				</form>
				<p align="center">
					New user? <a style="color: black;"  href="<c:url value="/registration"/>" >Registration Here</a>
				</p>
			</div>
		</div>
	</div>
</section>




