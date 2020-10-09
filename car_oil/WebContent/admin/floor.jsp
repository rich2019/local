<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
</head>

<body>
	
	<table width="100%">
		<tr width="30%">
		
			<td width="33%" align="center">
			<a href="${pageContext.request.contextPath }/admin/main.jsp" target="mainFrame">
			<img src="${pageContext.request.contextPath }/image/1.png" height="150" width="150">
			</a>
			</td>
			
			<td width="33%" align="center">
			<a href="${pageContext.request.contextPath }/admin/update.jsp" target="mainFrame">
			<img src="${pageContext.request.contextPath }/image/2.png" height="190" width="190">
			 </a>
			</td>
			
			<td width="33%" align="center">
			<a href="${pageContext.request.contextPath }/admin/addCar.jsp" target="mainFrame">
			<img src="${pageContext.request.contextPath }/image/3.png" height="190" width="190">
			 </a>
			</td>
			
		</tr>
	</table>
	
</body>
</html>