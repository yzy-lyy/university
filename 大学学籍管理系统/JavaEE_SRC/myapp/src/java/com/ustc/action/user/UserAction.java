package com.ustc.action.user;
import org.apache.struts.action.*;
import javax.servlet.http.*;
//Action�ࡣ//Ϊ����д����
public class UserAction extends Action
{
	public ActionForward perform(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)
	{

		String actionFlag = (String) request.getParameter("AT");
		if(!"pass".equals(actionFlag)){
			return (mapping.findForward("success"));
		}
		return (mapping.findForward("teststudent"));
	}
}
