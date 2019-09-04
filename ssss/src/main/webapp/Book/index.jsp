<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset=UTF-8">
<title></title>
</script>
</head>
<body>
<script type="text/javascript">
	function del(id){
		if(confirm("删除?")){
			 open("delete?id="+id,"_self");
		}
	}
	
</script>
<form action="index" method="post">
<input type="text"  name="txt" >
<button type="submit">查询</button>
</form>

<a href="edit">新增</a>

<table>
<tr>
<td>编号</td>>
<td>姓名</td>
<td>性别</td>
<td>类型</td>
<td>操作</td>
</tr>

<c:forEach items="${list}" var="r">
<tr><td>${r.name}</td>
<td>${r.sex}</td>
<td>${r.typeidname}</td>
<td>

<a href="update?id=${r.id}">修改</a>
<a href="javascript:del(${r.id})">删除</a>
</td>
</tr>
</c:forEach>

</table>
</body>
</html>