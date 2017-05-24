<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    	<a href="upload/${imgeString==null?'nophoto.png':imgeString}" title="Images" class="MagicZoom" id="MagicZoom"><img src="upload/${imgeString==null?'nophoto.png':imgeString}" width="390px" height="390px"/></a>
    	<div id="tsImgS"><a href="upload/${goods.goodsphoto==null?'nophoto.png':goods.goodsphoto}" title="Images" class="MagicZoom" id="MagicZoom"><img src="/upload/${goods.goodsphoto==null?'nophoto.png':goods.goodsphoto}" width="390px" height="390px"/></a></div>
    </center>
  </body>
</html>
