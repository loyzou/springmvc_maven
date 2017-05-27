<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript" src="../../../js/jquery.min.js"></script>

<script type="text/javascript">

$(function(){
	
	alert(1);
	
	$.ajax({url:"/life/home/login/test",async:false,success:function(data){
		alert(data);
			
	}})
	
})


</script>

<body>

	<%
		List<Map<String ,Object>> custList = (List)request.getAttribute("userList");
	
	
	%>

	
	sufow homepage
	
	
	
</body>
</html>