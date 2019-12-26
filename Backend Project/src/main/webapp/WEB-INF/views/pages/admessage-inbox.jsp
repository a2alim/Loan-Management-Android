<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/adminheader.jsp" />

<section class="content-info py-5">
	<div class="container py-md-5" style="margin-top: 25px;">

		

		<div class="text-center px-lg-5">
			<h2 class="title-w3ls mb-5"
				style="color: green; margin-bottom: 20px;">Manage Customers Message</h2>
		</div>
		<div class="contact-w3ls-form mt-5" style="margin-left: -60px;">
			<form  action="<c:url value="/adsearch-contact"/>"  method="post">
				<div class="row">

					<div class="col-lg-6">
						<div class="form-group">
							<input type="number" name="searchContatId"
								placeholder="Search by Id" required="" />
							<button type="submit" class="btn btn-success">Search</button>
						</div>
					</div>

				</div>
			</form>
			
			<c:if test='${Boolean.parseBoolean(messageInbox.isEmpty())}'>
			<h1 align="center" style="color: red; margin-top: 200px;">There
				is no Matching Message ID. Please Insert Correct One.</h1>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		</c:if>
			
			<div style="margin-bottom: 300px;">
				<table class="table table-striped table-bordered table-primary"
					style=" margin-right: 50px;">
					<c:if test='${!messageInbox.isEmpty()}'>
						<thead>
							<tr>
								<td>Message Id</td>
								<td>Name</td>
								<td>Email</td>
								<td>Message</td>
								<td>Action</td>
							</tr>
						</thead>
					</c:if>
					<tbody>
						<c:forEach var="contact" items="${messageInbox}">
							<tr>
								<td>${contact.contactId}</td>
								<td>${contact.firstName} ${contact.lastName}</td>
								<td>${contact.email}</td>
								<td>${contact.message}</td>
								
								<td><a class="btn btn-success"
									href="<c:url value="/sendEmail/${contact.contactId}"/>"><i
										class="fa fa-reply"></i> Reply</a></td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</section>


<jsp:include page="../layout/adminfooter.jsp" />

