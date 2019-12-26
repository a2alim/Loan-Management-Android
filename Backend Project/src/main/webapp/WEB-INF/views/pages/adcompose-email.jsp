<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../layout/adminheader.jsp" />

<section class="content-info py-5">
	

		<div class="inner-block">
    <div class="inbox">
    	  
    	 <div class="col-md-4 compose">   	 	
    	 	<div class="mail-profile">
    	 		<div class="mail-pic">
    	 			<a href="#"><img src="images/b3.png" alt=""></a>
    	 		</div>
    	 		<div class="mailer-name"> 			
    	 				<h5><a href="#">Abdul Alim</a></h5>  	 				
    	 			     <h6><a href="#">ador.abdulalim@gmail.com</a></h6>   
    	 		</div>
    	 	    <div class="clearfix"> </div>
    	 	</div>
    	 	<div class="compose-bottom">
    	 		<ul>
    	 			<li><a class="hilate" href="#"><i class="fa fa-inbox"> </i>Inbox</a></li>
    	 			<li><a href="#"><i class="fa fa-envelope-o"> </i>Sent Mail</a></li>
    	 			<li><a href="#"><i class="fa fa-star-o"> </i>Important</a></li>
    	 			<li><a href="#"><i class="fa fa-pencil-square-o"> </i>Drafts</a></li>
    	 			<li><a href="#"><i class="fa fa-trash-o"> </i>Trash</a></li>
    	 		</ul>
    	 	</div>
    	 </div>   	 
    	 	<div class="col-md-8 compose-right">
    	 			<h2>${msg}</h2>
					<div class="inbox-details-default">
						<div class="inbox-details-heading">
							Compose New Message 
						</div>
						<div class="inbox-details-body">
							<div class="alert alert-info">
								Please fill details to send a new message
							</div>
							<form class="com-mail" action="<c:url value="/sendEmail"/>" method="get">
								<input type="text" name="mail" id="mail" value="${email}" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'To';}">
								<input type="text" name="sub" id="sub" value="Subject :" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Subject';}">
								
								<textarea rows="6" name="body" id="body" value="Message :" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message </textarea>
								<div class="form-group">
									<div class="btn btn-default btn-file">
										<i class="fa fa-paperclip"> </i> Attachment
										<input type="file" name="attachment">
									</div>
								</div>
								<input type="submit" value="Send Message"> 
							</form>
						</div>
					</div>
				</div>
    	
          <div class="clearfix"> </div>     
   </div>
</div>

	
</section>


<jsp:include page="../layout/adminfooter.jsp" />

