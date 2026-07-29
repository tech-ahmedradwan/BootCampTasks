
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Data submitted successfully</h1>
<h3>first name is : ${userProfileModel.firstName}</h3>
<h3>last name is : ${userProfileModel.lastName}</h3>
<h3>email is : ${userProfileModel.email}</h3>
<h3>date of birth is : ${userProfileModel.dateOfBirth}</h3>
<h3>city is : ${userProfileModel.city}</h3>
</body>
</html>
