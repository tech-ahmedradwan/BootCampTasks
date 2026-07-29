
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Data submitted successfully</h1>
<h3>first name is : ${userProfileModel.userName}</h3>
<h3>last name is : ${userProfileModel.country}</h3>
<h3>email is : ${userProfileModel.programmingLanguage}</h3>
<h3>date of birth is : ${userProfileModel.operatingSystem}</h3>
</body>
</html>
