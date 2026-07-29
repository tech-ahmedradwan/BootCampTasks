
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
<div style="width:60%; margin:0 auto;">
    <h1 class="text-center">User Registration</h1>
    <f:form action="confirmation" modelAttribute="userProfileModel">
        <label class="form-text">First Name</label>
        <f:input type="text" placeholder="Enter first name" path="firstName" cssClass="form-control"/>
        <label class="form-text">Last Name</label>
        <f:input type="text" placeholder="Enter last name" path="lastName" cssClass="form-control"/>
        <label class="form-text">Email Address</label>
        <f:input type="text" placeholder="Enter Email Address" path="email" cssClass="form-control"/>
        <label class="form-text">Birth of Date</label>
        <f:input type="date" placeholder="Enter Birth of Date" path="dateOfBirth" cssClass="form-control"/>
        <label class="form-text">City</label>
        <f:input type="text" placeholder="Enter City" path="city" cssClass="form-control"/>
        <input type="submit" class="btn btn-primary mt-4">
    </f:form>
</div>
</body>
</html>
