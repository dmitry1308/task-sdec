<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<spring:form modelAttribute="orderFromServer" method="POST" action="/courier/result">
    Номер заказа <spring:input path="number"/>
    <spring:button>Не успеваю</spring:button>
</spring:form>
</body>
</html>