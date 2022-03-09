<%@ include file="../frame/head.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-html" prefix="html" %> 
<%@ taglib uri="/struts-bean" prefix="bean" %> 
<%@ taglib uri="/struts-logic" prefix="logic" %> 

<script language="javascript">
//document.gradeForm.querystring.focus();

function query()
{
   var querystr = document.gradeForm.querystring.value; 
   if (document.gradeForm.queryradio[0].checked)
   {
   	document.gradeForm.queryoption.value="0";
   	if ((AtTrim(querystr) == "")) {
		alert("请输入需要查询成绩的学生学号或姓名，再进行查询!");
		document.gradeForm.querystring.focus();
		return;
	}
   }
   else if (document.gradeForm.queryradio[1].checked)
   {
       querystr = document.gradeForm.querystring1.value; 
       document.gradeForm.queryoption.value="1";
   		if ((AtTrim(querystr) == "")) {
		alert("请输入需要查询成绩的学生分数，再进行查询!");
		document.gradeForm.querystring1.focus();
		return;
	}
   }
   else
    {
       querystr = document.gradeForm.querystring2.value; 
       document.gradeForm.queryoption.value="2";
   		if ((AtTrim(querystr) == "")) {
		alert("请输入需要查询的名次，再进行查询!");
		document.gradeForm.querystring2.focus();
		return;
	}
   }
	document.gradeForm.submit();	
}

function selectoption(option)
{
	if (option == 1)
		document.gradeForm.queryradio[1].checked = true;
	else if (option == 2)
		document.gradeForm.queryradio[2].checked = true;
	else
		document.gradeForm.queryradio[0].checked = true;
}
</script>

<form name="gradeForm" method="POST" action="<%=request.getContextPath()%>/gradeSearch.do">
<table width=778 cellspacing="4" width="100%" border="0">
 <tr>
  <td class="page-title" bordercolor="#000000" align="left" nowrap>
   <font>学生成绩查询</font>
  </td>
 </tr>
</table>

 <table width=778 cellspacing="4" width="100%" border="1">
  <tr>
  <td align="left" nowrap>
   <input type="hidden" name="queryoption">
   <input type="radio" size="2" name="queryradio" value="0" checked>
   <font size=2>查询学号或姓名为<input type="text" name="querystring" onfocus="selectoption(0)">的学生成绩</font>
   <br>
   <input type="radio" size="2" name="queryradio" value="1">
   <font size=2>要查询成绩小于<input type="text" name="querystring1" value="60" onfocus="selectoption(1)">分的学生成绩</font>
    <br>
   <input type="radio" size="2" name="queryradio" value="2">
   <font size=2>查询总成绩前<input type="text" name="querystring2" value="10" onfocus="selectoption(2)">名的学生成绩</font>
   <input type=button name="querybtn" value="查 询" onclick="javascript:query()">
  </td>
 </tr>
 
</table>
<br>
<table width=778 width="90%"  border="0" cellpadding="4" cellspacing="1" bgcolor="#56B205">
	   <tr bgcolor="#ffffff"> 
	      <td height="22" width=14% class="header-center">学号</td>
	      <td height="22" width=12% class="header-center">姓名</td>
	      <td height="22" width=8% class="header-center">电子技术</td>
	      <td height="22" width=8% class="header-center">软件工程</td>
	      <td height="22" width=8% class="header-center">计算机网络与信息安全</td>
	      <td height="22" width=8% class="header-center">Java程序设计</td>
	      <td height="22" width=8% class="header-center">高级数据库</td>
	      <td height="22" width=8% class="header-center">图形图像处理技术</td>
	      <td height="22" width=8% class="header-center">分布计算与互联网技术</td>
	      <td height="22" width=8% class="header-center">软件测试与自演化技术</td>
	      <td height="22" width=10% class="header-center">总  分</td>

	  <logic:notEmpty name="gradelist" scope="request"> 
	  <logic:iterate id="grade" name="gradelist" type="com.ustc.vo.GradeVO" scope="request"> 
	    <bean:define id="numElectron"  name="grade" property="numElectron" type="Integer"/>
	    <bean:define id="numSoftware"  name="grade" property="numSoftware" type="Integer"/>
	    <bean:define id="numSecurity"  name="grade" property="numSecurity" type="Integer"/>
	    <bean:define id="numJava"  name="grade" property="numJava" type="Integer"/>
	    <bean:define id="numDB"  name="grade" property="numDB" type="Integer"/>
	    <bean:define id="numImage"  name="grade" property="numImage" type="Integer"/>
	    <bean:define id="numDistributed"  name="grade" property="numDistributed" type="Integer"/>
	    <bean:define id="numTest"  name="grade" property="numTest" type="Integer"/>
	  </tr>    
      <tr bgcolor="#ffffff"> 
	      <td height="22" align="center"><bean:write name="grade" property="stuID" scope="page"/></td>
	      <td height="22" align="center" ><bean:write name="grade" property="userName" scope="page"/></td>
	      <td height="22" align="right"><%=numElectron%></td>
	      <td height="22" align="right"><%=numSoftware%></td>
	      <td height="22" align="right"><%=numSecurity%></td>
	      <td height="22" align="right"><%=numJava%></td>
	      <td height="22" align="right"><%=numDB%></td>
	      <td height="22" align="right"><%=numImage%></td>
	      <td height="22" align="right"><%=numDistributed%></td>
	      <td height="22" align="right"><%=numTest%></td>
	      <td height="22" align="right"><%=(numElectron+numSoftware+numSecurity+numJava+numImage+numDB+numDistributed+numTest)%></td>
	  </tr>
	  </logic:iterate> 
	  </logic:notEmpty> 
	  
	  <logic:empty  name="gradelist" scope="request"> 
	    <tr bgcolor="#ffffff"> 
	      <td height="22" align="center" colspan=11>没有任何学生成绩，请重新查询!!</td>	      
	  </tr>
	  </logic:empty> 
	  
</table>
</form>

 <table>
   	<tr> 
	      <td height="22" align="center" colspan=8>&nbsp;</td>
	</tr>
</table>
<%@ include file="../frame/foot.jsp" %>