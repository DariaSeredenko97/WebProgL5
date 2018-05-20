<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="icon" href="../favicon.ico"/>
    <title>Registration Page</title>
    <style>
        .background {
            width: 100%;
            height: 100%;
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            z-index: -999;
        }
    </style>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen animated fadeInDown">
    <div style="width: 30%; margin: auto;">

        <%--@elvariable id="user" type="com.webprog.lab5.model.User"--%>
        <div>${user.username}</div>
        <div>${user.firstName}</div>
        <div>${user.lastName}</div>
        <div>${user.patronymic}</div>
        <div>${user.birthday}</div>
        <div>${user.gender}</div>
        <div>${user.address}</div>
        <img class="background" src="${user.imagePath}"/>
    </div>
</div>

</body>
</html>