package com.ustc.action.user;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

import com.ustc.vo.UserVO;

//Form������һ��user���ԡ�//Ϊ����д����

public class UserForm extends ActionForm
{
	private UserVO user=new UserVO();
	public void setUserName(String userName)
	{
		user.setUserName(userName);
	}
	public String getUserName()
	{
		return user.getUserName();
	}
	public void setUser(UserVO user)
	{
		this.user=user;
	}
	public UserVO getUser()
	{
		return this.user;
	}
	//��������form
	public void reset(ActionMapping mapping, HttpServletRequest request)
    {
                    this.user = new UserVO();
    }
    //form��Ч���жϣ��������򻯴���
     public ActionErrors validate(ActionMapping mapping,
                    HttpServletRequest request)
     {
        ActionErrors errors = new ActionErrors();
        if ((user.getUserName() == null) || (user.getPassword().length() < 3))
        { 
            errors.add("password", new ActionError("error.user.password"));
        }
        return errors;
     }
}
                
    