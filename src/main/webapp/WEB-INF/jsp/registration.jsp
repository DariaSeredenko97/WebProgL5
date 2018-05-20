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

        <%--@elvariable id="user" type="com.webprog.lab5.model.User"--%>
        <form:form method="post" action="registration" modelAttribute="user" enctype="multipart/form-data">
            <form:input path="username" placeholder="username" title=""/>
            <form:input path="password" placeholder="password" title=""/>
            <form:input path="lastName" placeholder="lastName" title=""/>
            <form:input path="firstName" placeholder="firstName" title=""/>
            <form:input path="patronymic" placeholder="patronymic" title=""/>
            <form:input path="birthday" placeholder="birthday" title=""/>
            <div>
                <form:radiobutton path="gender" placeholder="gender" title="" value="MALE" label="MALE"/>
                <form:radiobutton path="gender" placeholder="gender" title="" value="FEMALE" label="FEMALE"/>
            </div>
            <form:input path="address" placeholder="address" title=""/>
            <input type="file" name="file">

            <button type="submit" class="btn btn-primary block full-width m-b">Register</button>
        </form:form>

    </div>
</div>

</body>
</html>