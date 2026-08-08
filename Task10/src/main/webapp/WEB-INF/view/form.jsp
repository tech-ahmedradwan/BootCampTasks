<%--
  Created by IntelliJ IDEA.
  User: ahmedradwan
  Date: 08/08/2026
  Time: 4:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form Data</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <h1>Employee Registration Form</h1>
    <br>
    <f:form action="process" modelAttribute="userModel">
        <label>
            user name
        </label>
            <f:input type="text"  path="userName" placeholder="Enter your name"  class="form-control"/>
            <f:errors path="userName" cssClass="alert-danger"/>
        <br>
        <label>
            email address
        </label>
        <f:input type="email"  path="email" placeholder="Enter your email"  class="form-control"/>
        <f:errors path="email" cssClass="alert-danger"/>
        <br>
        <label>
            password
        </label>
        <f:input type="password"  path="password" placeholder="Enter your password"  class="form-control"/>
        <f:errors path="password" cssClass="alert-danger"/>
        <br>
        <label>
           confirm password
        </label>
        <f:input type="password"   path="confirmPassword" placeholder="Enter your password"  class="form-control"/>
        <f:errors path="confirmPassword" cssClass="alert-danger"/>
        <br>
        <input type="submit" class="btn btn-primary"/>
    </f:form>
</div>
</body>
</html>