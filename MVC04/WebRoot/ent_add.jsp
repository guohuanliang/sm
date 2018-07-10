<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ent_add.jsp' starting page</title>
    
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
    <h3><s:message code="label.nav"/></h3>

    <sf:form modelAttribute="ent" method="POST" action="add">

       <p>

           <label><s:message code="ent.ent.name"/></label>

           <sf:input path="ent_name" />

           <sf:errors path="ent_name"></sf:errors>

       </p>

       <p>

           <label><s:message code="ent.biz.lic"/></label>

           <sf:input path="biz_lic" />

           <sf:errors path="biz_lic"></sf:errors>

       </p>

       <p>

           <label><s:message code="ent.fnd.date"/></label>

           <sf:input path="fnd_date" />

           <sf:errors path="fnd_date"></sf:errors>

       </p>

       <p>

           <input type="submit" value="<s:message code="label.save"/>">

       </p>

    </sf:form>
  </body>
</html>
