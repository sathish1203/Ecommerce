<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted User Information</h2>
   <table>
    <tr>
        <td>FirstName</td>
        <td>${firstname}</td>
    </tr>
    <tr>
        <td>LastName</td>
        <td>${lastname}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
</table>  
</body>
</html>