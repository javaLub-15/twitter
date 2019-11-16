<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="pl">
<head>
    <jsp:include page="/include/meta.jsp"/>
    <link href="${pageContext.request.contextPath}/css/sign-in.css" rel="stylesheet">
    <title>SDA Twitter : Login</title>
</head>
<body>
<header>
    <jsp:include page="/include/header.jsp"/>
</header>
<main role="main">
    <form class="form-signin" action="login" method="post">
        <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
        <label for="inputLogin" class="sr-only">Login</label>
        <input name="login" type="text" id="inputLogin" class="form-control" placeholder="Login" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</main>
<footer>
    <jsp:include page="/include/footer.jsp"/>
</footer>
</body>
</html>
