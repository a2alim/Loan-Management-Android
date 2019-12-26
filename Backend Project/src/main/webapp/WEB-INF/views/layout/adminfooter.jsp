<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="copyrights" style="background-color: gray;">
	<div class="container py-md-3">
		<p style="color: white;">MD. Abdul Alim</p>
		<p style="color: white;">Student of IDB-BISEW</p>
		<p style="color: white;">New Horizon Computer Learning Center</p>
	</div>
</div>
<!--COPY rights end here-->
</div>
</div>
<!--slider menu-->
<div class="sidebar-menu">
	<div class="logo">
		<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
		</a> <a href="#"> <span id="logo"></span> <!--<img id="logo" src="" alt="Logo"/>-->
		</a>
	</div>
	<div class="menu">
		<ul id="menu">
			<li id="menu-home"><a href="/userinfo"><i class="fa fa-user"></i><span>Manage
						user</span><span class="fa fa-angle-right" style="float: right"></span></a>
				<ul>
					<li><a href="<c:url value="/userinfo"/>" >View User Info</a></li>
					<li><a href="<c:url value="/adcreate-user"/>" >Create User</a></li>
				</ul></li>
			<li><a href="#"><i class="fa fa-bank"></i><span>Loans</span><span
					class="fa fa-angle-right" style="float: right"></span></a>
				<ul>
					<li><a href="<c:url value="/pending-loan"/>"  >Approve Loan</a></li>
					<li><a href="<c:url value="/admanage-loan"/>" >Manage Loan</a></li>
				</ul></li>
				
			<li><a href="#"><i class="fa fa-envelope"></i><span>Mailbox</span><span
					class="fa fa-angle-right" style="float: right"></span></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="<c:url value="/messageinbox"/>"  >Mail Inbox </a></li>
					<li id="menu-academico-boletim"><a  href="<c:url value="/compose-email"/>"  >Compose
							Email</a></li>
				</ul></li>
					
			<li id="menu-comunicacao"><a  href="<c:url value="/report"/>" ><i
					class="fa fa-book nav_icon"></i><span>View Report</span></a>
			</li>
			
			<li><a href="<c:url value="/admanage-installment"/>"  ><i class="	fa fa-cc-mastercard"></i><span>Installment</span></a></li>
			
			<li id="menu-academico"><a href="#"><i
					class="fa fa-file-text"></i><span>Pages</span><span
					class="fa fa-angle-right" style="float: right"></span></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-boletim"><a href="<c:url value="/logout"/>" >Login</a></li>
					<li id="menu-academico-avaliacoes"><a href="<c:url value="/adcreate-user"/>" >Sign
							Up</a></li>
				</ul></li>
			
			<li><a href="#"><i class="fa fa-cog"></i><span>System</span><span
					class="fa fa-angle-right" style="float: right"></span></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="<c:url value="/errorpage"/>" >404</a></li>
					<li id="menu-academico-boletim"><a href="<c:url value="/blankpage"/>" >Blank</a></li>
				</ul></li>

		</ul>
	</div>
</div>
<div class="clearfix"></div>
</div>
<!--slide bar menu end here-->
<script>
	var toggle = true;

	$(".sidebar-icon").click(
			function() {
				if (toggle) {
					$(".page-container").addClass("sidebar-collapsed")
							.removeClass("sidebar-collapsed-back");
					$("#menu span").css({
						"position" : "absolute"
					});
				} else {
					$(".page-container").removeClass("sidebar-collapsed")
							.addClass("sidebar-collapsed-back");
					setTimeout(function() {
						$("#menu span").css({
							"position" : "relative"
						});
					}, 400);
				}
				toggle = !toggle;
			});
</script>
<!--scrolling js-->
<script src="<c:url value="/assets/js/jquery.nicescroll.js"/>" ></script>
<script src="<c:url value="/assets/js/scripts.js"/>" ></script>
<!--//scrolling js-->
<script src="<c:url value="/assets/js/bootstrap.js"/>" >
	
</script>
<!-- mother grid end here-->
</body>
</html>