
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body class="bg-light">
<h1 class="text-center py-4">User Registration</h1>
<div style="width:60%; margin:0 auto;" class="border py-md-5 px-lg-5 card" >
    <f:form action="confirmation" modelAttribute="userProfileModel">
        <f:input type="text" cssClass="form-control my-md-2 bg-light" placeholder="Enter UserName"  path="userName"  />
        <f:input type="password" cssClass="form-control  my-md-2 bg-light" placeholder="Enter password"  path="password" />
        <f:select path="country" cssClass="custom-select  my-md-2">
            <f:option value="Egypy" label="EGY"/>
            <f:option value="Brazile" label="Bra"/>
            <f:option value="Spain" label="Spn"/>
        </f:select>
        <label class="my-md-1">Preferred Programming Language</label>
        <br>
        Java <f:radiobutton path="programmingLanguage" value="Java" cssClass="custom-radio"/>
        PHP <f:radiobutton path="programmingLanguage" value="PHP" cssClass="custom-radio"/>
        C# <f:radiobutton path="programmingLanguage" value="C#" cssClass="custom-radio"/>
        Ruby <f:radiobutton path="programmingLanguage" value="Ruby" cssClass="custom-radio"/>
        <br>
        <br>
        <label class="my-md-1">Preferred Operating System</label>
        <br>
        <f:checkbox path="operatingSystem" value="Windows" label=" Windows" cssClass="custom-checkbox"/>
        <f:checkbox path="operatingSystem" value="Linux" label=" Linux" cssClass="custom-checkbox"/>
        <f:checkbox path="operatingSystem" value="Macintoch" label=" Mac" cssClass="custom-checkbox"/>
        <br>
        <input type="submit" class="btn btn-danger mt-4 btn-block">
    </f:form>
</div>
</body>
</html>
