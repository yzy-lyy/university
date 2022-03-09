<%@ include file="../frame/head.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-html" prefix="html" %> 
<%@ taglib uri="/struts-bean" prefix="bean" %> 
<%@ taglib uri="/struts-logic" prefix="logic" %> 

<script language="javascript">
function query()
{
   var querystr = document.studentForm.querystring.value; 
   	if ((AtTrim(querystr) == "")) {
		alert("请输入需要查询的学生学号、姓名、籍贯或身份证号，再进行查询!");
		document.studentForm.querystring.focus();
		return;
	}
	
	document.studentForm.submit();	
}
</script>

<form name="studentForm" method="POST" action="<%=request.getContextPath()%>/studentSearch.do">
<table width=778 cellspacing="4" width="100%" border="0">
 <tr>
  <td class="page-title" bordercolor="#000000" align="left" nowrap>
   <font>学生信息查询</font>
  </td>
 </tr>
 
 <tr>
  <td height="10">
  </td>
 </tr>
 </table>
 
 <table width=778 cellspacing="4" width="100%" border="1">
  <tr>
  <td align="left" nowrap>
   <font size=2>请输入需要查询的学生学号、姓名、籍贯或身份证号：<input type="text" name="querystring"></font>
   <input type=button name="querybtn" value="查 询" onclick="javascript:query()">
  </td>
 </tr>
 
</table>
<br>

<table width=778 width="90%"  border="0" cellpadding="4" cellspacing="1" bgcolor="#56B205">
	   <tr bgcolor="#ffffff"> 
	      <td height="22" class="header-center">学号</td>
	      <td height="22" class="header-center">姓名</td>
	      <td height="22" class="header-center">性别</td>
	      <td height="22" class="header-center">籍贯</td>
	      <td height="22" class="header-center">身份证号</td>
	      <td height="22" class="header-center">邮政编码</td>
	      <td height="22" class="header-center">电子邮件</td>
	      <td height="22" class="header-center">通讯地址</td>
	  </tr>
	  <logic:notEmpty name="studentlist" scope="request"> 
	  <logic:iterate id="student" name="studentlist" type="com.ustc.vo.StudentVO" scope="request"> 
      <tr bgcolor="#ffffff"> 
	      <td height="22" align="center"><bean:write name="student" property="stuID" scope="page"/></td>
	      <td height="22" align="center" ><bean:write name="student" property="username" scope="page"/></td>
	      <td height="22" align="center"><bean:write name="student" property="gender" scope="page"/></td>
	      <td height="22" align="center"><bean:write name="student" property="city" scope="page"/></td>
	      <!-- <td height="22" align="center">33</td> -->
	      <td height="22" align="center"><bean:write name="student" property="identityID" scope="page"/>
	      <td height="22" align="center"><bean:write name="student" property="email" scope="page"/></td>
	      <td height="22" align="center"><bean:write name="student" property="postID" scope="page"/></td>
	      <td height="22" align="center"><bean:write name="student" property="address" scope="page"/></td>
	  </tr>
	  </logic:iterate> 
	  </logic:notEmpty> 
	  
	  <logic:empty  name="studentlist" scope="request"> 
	    <tr bgcolor="#ffffff"> 
	      <td height="22" align="center" colspan=9>没有任何学生信息，请重新查询!</td>	      
	  </tr>
	  </logic:empty> 
</table>
<input type=hidden name="studentids" value="">

 <table>
 <tr>
 <td height="22" align="center" height=8>
 </td>
 </tr>
  <!--  	<tr> 
	      <td height="22" align="right" colspan=8>
			<input type=button name="return" value="返回" onclick="">
		</td>
	</tr> -->
</table>
</form>


<%@ include file="../frame/foot.jsp" %>