<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="/struts-logic" prefix="logic" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-html" prefix="html" %>
<html:html locale="true">
<head>
<html:base/>
<title>
添加用户
</title>
</head>
<body>
<h2>创建一个用户</h2>
<form NAME="createUser" action="<%=request.getContextPath()%>/createUsered.do?AT=pass" method="GET">
<!--<form NAME="createUser" action="<%=request.getContextPath()%>/teststudent.do" method="POST">-->

        userName:<input type="text" name="username"> <br/>
        password:<input type="password" name="password"><br/>       
        age:  <input type="text" name="age"> <br/> 
        <input type="hidden" name="AT" value="pass"> <br/>  
        <input type="hidden" name="rnd" value="<%=Math.random()%>">     
        <input type="submit">
    </form>
</body>
</html:html>