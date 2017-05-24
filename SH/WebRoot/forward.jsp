<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<%--
			设置定时跳转的头信息
			<meta http-equiv="refresh" content="5;URL=<%=basePath%>${url }">
		--%><!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript">
			var time = 5;
			function countDown() {
				document.getElementById("time_span").innerHTML = time;
				time--;
				if (time >= 0) {
					// js中定时调用的方法
					window.setTimeout("countDown();",1000);
				}
			}
		</script>
	</head>

	<body onload="countDown();">
		<center>
			<%
				response.setHeader("refresh","5;URL=" + basePath + request.getAttribute("url"));
			%>
			${message }，<span id="time_span">5</span> 秒后自动跳转！<br/>
			<a href="${url}">如果没有跳转，请点这里！</a>
		</center>
		<br>
	</body>
</html>
