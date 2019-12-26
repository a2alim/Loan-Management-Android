<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<jsp:include page="../layout/adminheader.jsp" />
	
<div class="row" style="margin-left: 30px">
	<div class="inner-block">
		<div class="error-404">
			<div class="error-page-left">
				<img src="<c:url value="/assets/images/404.png"/>" alt="">
			</div>
			<div class="error-right">
				<h2>Oops! Page Not Open</h2>
				<h4>Nothing Is Found Here!!</h4>
				<a href="<c:url value="/adminhome"/>">Go Back</a>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../layout/adminfooter.jsp" />