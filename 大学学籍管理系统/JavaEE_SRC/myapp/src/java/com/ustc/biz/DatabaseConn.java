package com.ustc.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

import com.ustc.util.PropertiesUtil;


//һ�����ڲ�������Դ�Ĺ����ࡣ
public class DatabaseConn {
    private static String userName ="";//"root"; //�û���
    private static String password = "";//"pass"; //����
    private static String url = "";//"jdbc:mysql://localhost:3306/schadmin?useUnicode=true&characterEncoding=UTF-8"; //���ӵ�schadmin���ݿ�
    private static String driver = "";// "com.mysql.jdbc.Driver";
    
    private static void initDBconfig()
    {
    	ResourceBundle bundle = ResourceBundle
        .getBundle("config", Locale.ENGLISH);
		userName = bundle.getString("userid");
		password = bundle.getString("passwd");
		url = bundle.getString("url");
		driver = bundle.getString("driver");
    }
	
    public static synchronized Connection getConnection()
        throws Exception {
        Connection conn = null;

        try {
        	initDBconfig();
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw e;
        }

        return conn;
    }

    public static synchronized Connection getConnection(String userid,
        String pwd, String connectURL) throws Exception {
        Connection conn = null;

        try {
        	initDBconfig();
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(connectURL, userid, pwd);
        } catch (SQLException e) {
            throw e;
        }

        return conn;
    }
    
    public static void main(String[] agrs)
    {
    	ResourceBundle bundle = ResourceBundle
        .getBundle("config", Locale.ENGLISH);
    	System.out.print(bundle.getString("url"));
    }
}
