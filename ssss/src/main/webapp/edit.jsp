<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css" />
<title>Insert title here</title>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
</script>
<script src="https://www.layuicdn.com/layui-v2.5.4/layui.js"></script>
</head>
<body>
<c:if test="${info==null}">
	<form action="insert" method="post">
</c:if>
<c:if test="${info!=null}">
	<form action="Change" method="post">
	<input name="id" type="hidden" value="${info.id}">
</c:if>
<input name="name" value="${info.name}" >
<input name="sex" value="${info.sex}">
<input name="typeid" value="${info.typeid}">

<button class="layui-btn layui-btn-warm" type="submit">提交</button>
</form>

</body>
</html>