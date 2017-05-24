<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  %>


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
		<meta http-equiv="Content-Type" charset="GB18030"> 

		<title>My JSP 'index.jsp' starting page</title>
	</head>

	<body>
	
	<%--
		使用说明:
			将以下代码拷贝到需要显示分页内容的地方
			
			<jsp:include page="/split_page_plugin.jsp">
				<jsp:param value="${pageNo}" name="pageNo"/>
				<jsp:param value="${pageSize}" name="pageSize"/>
				<jsp:param value="${keyword}" name="keyword"/>
				<jsp:param value="${column}" name="column"/>
				<jsp:param value="${count}" name="count"/>
				<jsp:param value="news!list.action" name="URL"/>
				<jsp:param value="title:新闻标题|content:新闻内容" name="columnData"/>
				<jsp:param value="3" name="pageStyle"/>
			</jsp:include>
	
			参数说明:
				URL为查询列表的路径
				columnData是搜索选项的值,格式为: 字段名1:显示文字1|字段名2:显示文字2....
				pageStyle为页面显示风格， 1是数字型， 2是文本框，其他是下拉列表
	
	 --%>
					<br/>
			<%
			

			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");

				int pageNo = Integer.parseInt(request.getParameter("pageNo"));
				
				int pageSize = Integer.parseInt(request.getParameter("pageSize"));
				int count = Integer.parseInt(request.getParameter("count"));
				
				String column = request.getParameter("column");
				String keyword = request.getParameter("keyword");
				
				String URL = request.getParameter("URL");
				
				// 总页数
				int allPages = (count - 1) / pageSize + 1;
			%>
			<form action="<%=URL %>" method="post" id="split_page" onsubmit="return checkPageNo();">				
				<%
					String pageStyle = request.getParameter("pageStyle");
					if ("1".equals(pageStyle)) {
				%>
				<input type="button" value="<<" <%=pageNo==1?"disabled":"" %> onclick="changePage(1);"> 
				<input type="button" value="<" <%=pageNo==1?"disabled":"" %> onclick="changePage(<%=pageNo - 1 %>);"> 
				
				<%
					if (pageNo - 2 > 1) {
				%>
				...
				<%		
					}
				
					for (int i = pageNo - 2;i <= pageNo + 2 && i <= allPages;i++) {
						if (i == pageNo) {
				%>
					<font color='red'><%=i %></font>
				<%			
						} else if (i > 0) {
				%>
					<a href="javascript:changePage(<%=i %>);"><%=i %></a>
						
				<%		
						}
					}
				
					if (pageNo + 2 < allPages) {
				%>
				...
				<%		
					}
				
				%>
				
				
				<input type="button" value=">" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=pageNo + 1 %>);"> 
				<input type="button" value=">>" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=allPages %>);">
				 
				<input type="hidden" name="pageNo" id="pageNo" value="<%=pageNo %>"/>
				
				
				<%		
					} else if ("2".equals(pageStyle)) {
				%>
				<input type="button" value="首页" <%=pageNo==1?"disabled":"" %> onclick="changePage(1);"> 
				<input type="button" value="000" <%=pageNo==1?"disabled":"" %> onclick="changePage(<%=pageNo - 1 %>);"> 
				<input type="button" value="下一页" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=pageNo + 1 %>);"> 
				<input type="button" value="尾页" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=allPages %>);">
				
				跳转到
				<input type="text" id="pageNo" name="pageNo" value="<%=pageNo %>" size="3" maxlength="3"/>
				页 / 共 <%=allPages %> 页
				<input type="submit" value="Go"/>
				<%		
					} else {
				%>
				<input type="button" value="首页" <%=pageNo==1?"disabled":""%> onclick="changePage(1);"> 
				<input type="button" value="上一页" <%=pageNo==1?"disabled":"" %> onclick="changePage(<%=pageNo - 1 %>);"> 
				<input type="button" value="下一页" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=pageNo + 1 %>);"> 
				<input type="button" value="尾页" <%=pageNo==allPages?"disabled":"" %> onclick="changePage(<%=allPages %>);">
								
				跳转到
				<select id="pageNo" name="pageNo" onchange="changePage(this.value);">
					<%
						for (int i = 1;i <= allPages;i++) {
					%>
					<option value="<%=i %>" <%=i==pageNo?"selected":"" %>><%=i %></option>
					<%
						}
					%>
				</select>
				页 / 共 <%=allPages %> 页
				
				
				<%		
					}
				
				%>
				<%
					int[] allSize = {1,2,5,10,20};
				%>
				每页显示
				<select id="pageSize" name="pageSize" onchange="changePage(1);">
					<%
						for (int i = 0 ;i < allSize.length;i++) {
					%>
					<option value="<%=allSize[i] %>" <%=allSize[i]==pageSize?"selected":"" %>><%=allSize[i] %></option>
					<%		
						}
					%>
				</select>
				条数据
				<br/>
				<!-- 
				<select name="column" id="column">
					<%
						String columnData = request.getParameter("columnData");
						String[] columnValues = columnData.split("\\|");
						for (int i = 0;i < columnValues.length;i++) {
							String[] values = columnValues[i].split(":");
					%>
					<option value="<%=values[0] %>" <%=values[0].equals(column)?"selected":"" %>><%=values[1]%></option>
					<%
						}
					%>
				</select>
				<input type="text" name="keyword" value="<%=keyword %>"/>
				<input type="button" value="搜索" onclick="changePage(1);"/>
				  -->
			</form>
			
			<script type="text/javascript">
				function changePage(newPage) {
					document.getElementById("pageNo").value = newPage;
					document.getElementById("split_page").submit();
				}
				
				function checkPageNo() {
					var pageNo = document.getElementById("pageNo").value;
					
					// 在js中,使用  /^规则$/.test(内容)   来判断内容是否符合规则的要求.
					// \d 表示是否为数字, + 表示前面的内容必须存在一个以上, 两个和到一起表示  数字要有1个以上,不能有其他内容.
					// \w 表示字母数字或下划线
					// ? 表示可以出现0次或1次,但不能出现多次
					// . 在正则表达式中表示任意字符   
					// 比如:验证邮件地址的规则        \w+@\w+\.\w+   
					   
					if (/^\d+$/.test(pageNo)) {
						if (pageNo > 0 && pageNo <= <%=allPages%>) {
							return true;
						}
					}
					return false;
				}
				
			</script>
	</body>
</html>
