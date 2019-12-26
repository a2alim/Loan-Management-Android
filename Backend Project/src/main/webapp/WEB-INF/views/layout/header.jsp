<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Loan management</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="Repay Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- //Meta tag Keywords -->
<!-- Custom-Files -->
<link rel="stylesheet" href="<c:url value="/uassets/css/bootstrap.css"/>">
<!-- Bootstrap-Core-CSS -->
<link rel="stylesheet" href="<c:url value="/uassets/css/style.css"/>" type="text/css"
	media="all" />
<link rel="stylesheet" href="<c:url value="/uassets/css/slider.css"/>" type="text/css"
	media="all" />
<!-- Style-CSS -->
<!-- font-awesome-icons -->
<link href="<c:url value="/uassets/css/font-awesome.css"/>" rel="stylesheet">
<!-- //font-awesome-icons -->
<!-- /Fonts -->
<link href="<c:url value="//fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800"/>"
	rel="stylesheet">

<!-- //Fonts -->

<style>
.banner {
	height: 100%;
	width: 100%;
	position: absolute;
}
</style>
</head>

<body>
	<!-- mian-content -->
	<div class="main-w3-pvt-header-sec" id="home">

		<!-- header -->
		<header >
			<img src="<c:url value="/uassets/images/navPic2.jpg"/>" class="banner" alt="" />
			<div class="container" style="position: relative;">
				<div class="row">
					<div
						class="header d-lg-flex justify-content-between align-items-center py-lg-3 px-lg-3">
						<!-- logo -->
						<div id="logo">
							<h1>
								<a href="<c:url value="/"/>" ><span class="fa fa-recycle mr-2"></span>Loan <br />
									Management</a>
							</h1>
						</div>
						<!-- //logo -->
						<div class="w3pvt-bg">
							<!-- nav -->
							<div class="nav_w3pvt">
								<nav>
									<label for="drop" class="toggle">Menu</label> <input
										type="checkbox" id="drop" />
									<ul class="menu">
										<li class="active"><a href="<c:url value="/home"/>" >Home</a></li>
										<li><a href="<c:url value="/contactus"/>" >Contact Us</a></li>
										<li>
											<!-- First Tier Drop Down --> <label for="drop-2"
											class="toggle toogle-2">Actions <span
												class="fa fa-angle-down" aria-hidden="true"></span>
										</label> <a href="#">Loans <span class="fa fa-angle-down" aria-hidden="true">
												</span></a> <input type="checkbox" id="drop-2" />
											<ul>
												<li><a href="<c:url value="/applyforloan"/>" class="drop-text">Apply For Loan</a></li>
												<li><a href="<c:url value="/user-loan-status/${pageContext.request.remoteUser}"/>"  class="drop-text">Loan Status</a></li>
												<li><a href="<c:url value="/user-installment"/>" class="drop-text">Installment Payemetn</a></li>
												<li><a href="<c:url value="/installment-status"/>"  class="drop-text">Installment Status</a></li>
											</ul>
										</li>
										<li><a href="<c:url value="/logout"/>" >Logout</a></li>
									</ul>
								</nav>
							</div>
							<!-- //nav -->
							<div class="justify-content-center">
								<!-- search -->
								<div class="apply-w3-pvt ml-lg-3">
									<a class="btn read"  href="<c:url value="/userregistration"/>"  role="button">User Registration
										Now</a>
								</div>
								<!-- //search -->

							</div>
						</div>
					</div>
				</div>
			</div>
		</header>
	</div>
	
	
											
	