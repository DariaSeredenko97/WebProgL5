<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="icon" href="../favicon.ico"/>
    <title>Registration Page</title>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div style="width: 30%; margin: auto;">

        <h4>New User Registration</h4>

        <%--@elvariable id="authModel" type="com.webprog.lab5.domain.AuthModel"--%>
        <form:form method="post" action="auth" modelAttribute="authModel">
            <form:input path="username" placeholder="username" title=""/>
            <form:input path="password" placeholder="password" title=""/>

            <button type="submit" class="btn btn-primary block full-width m-b">Auth</button>
        </form:form>

        <form:errors path="auth"/>
    </div>
</div>

</body>
</html>