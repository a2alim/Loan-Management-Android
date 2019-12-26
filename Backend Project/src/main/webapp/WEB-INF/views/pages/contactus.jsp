<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<jsp:include page="../layout/header.jsp" />
<section class="content-info py-5" >
        <div class="container py-md-5" style="margin-top: 125px;">
            <div class="text-center px-lg-5">
            	<h3 style="color: blue;">${msg}</h3>
                <h3 class="title-w3ls mb-5" style="color: green;">Contact Us</h3>
                <div class="title-desc text-center px-lg-5">
                    <p class="px-lg-5 sub-vj">If you fetch Any problem you can contact us by filluping The field and send message.</p>
                </div>
            </div>
            <div class="contact-w3ls-form mt-5">
                <form action="<c:url value="/contactRequest"/>" class="w3-pvt-contact-fm" method="post">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label>First Name</label>
                                <input class="form-control" type="text" name="fName" placeholder="" required=""/>
                            </div>
                            <div class="form-group">
                                <label>Last Name</label>
                                <input class="form-control" type="text" name="lName" placeholder="" required=""/>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input class="form-control" type="email" name="email" placeholder="" required=""/>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label>Write Message</label>
                                <textarea class="form-control" name="message" placeholder="" required=""></textarea>
                            </div>
                        </div>
                        <div class="form-group mx-auto mt-3">
                            <button type="submit" class="btn submit">Submit</button>
                            
                        </div>
                    </div>
                </form>
                
            </div>
        </div>
    </section>
<jsp:include page="../layout/footer.jsp" />