<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../layout/adminheader.jsp" />

<div class="row" style="margin-left: 10px;">
	<h3 align="center" style="color: green;">${msg}</h3>
	
	<h1 align="center" style="color: green; margin-top: 40px; margin-bottom: 30px;">Show User Information</h1>
	<table class="table table-striped" style="margin-bottom: 30px; font-size: 20px;">
		<thead style="background-color: gray; color: white; font-size: 25px;">
			<tr>
				<td>Pricture</td>
				<td>User Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>User Role</td>
				<td>Address</td>
				<td>Username</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td><img src="<c:url value="../uassets/usersImages/${user.filename}"/>"  
				 alt="..."></td>
					<td>${user.userId}</td>
					<td>${user.firstName} ${user.lastName}</td>
					<td>${user.email}</td>
					<td>${user.phone}</td>
					<td>${user.role}</td>
					<td>${user.address}</td>
					<td>${user.username}</td>
					<td><a class="btn btn-success"
						href="<c:url value="/api/user/edit/${user.userId}"/>" ><i class="fa fa-edit"></i></a> <a
						class="btn btn-danger" href="<c:url value="/api/user/deleteuserinfo/${user.userId}"/>"  ><i
							class="fa fa-trash"></i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<jsp:include page="../layout/adminfooter.jsp" />