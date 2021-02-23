<%@ page import="com.zu_min.java.webapp.SampleClass"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%
    SampleClass sc = new SampleClass();
%>
    <h2>Hello World!</h2>
    <p><%= sc.now(request) %></p>
</body>
</html>
