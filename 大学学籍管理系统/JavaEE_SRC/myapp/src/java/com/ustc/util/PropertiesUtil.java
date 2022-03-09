package com.ustc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtil {
	private Properties p;

	private FileInputStream in;


	/**
	 * 
	 * 
	 * ���ݴ������ļ��������ļ�
	 * 
	 * 
	 * @param fileName
	 *            String
	 * 
	 * 
	 */

	public PropertiesUtil(String fileName) {

		File file = new File(fileName);

		try {

			in = new FileInputStream(file);

			p = new Properties();

			// �����ļ�

			p.load(in);

			in.close();

		}

		catch (FileNotFoundException e) {

			System.err.println("�����ļ�config.properties�Ҳ�������");

			e.printStackTrace();

		}

		catch (Exception e) {

			System.err.println("��ȡ�����ļ�config.properties���󣡣�");

			e.printStackTrace();

		}

	}

	/**
	 * 
	 * 
	 * �г����е������ļ�����
	 * 
	 * 
	 */

	public void list() {

		p.list(System.out);

	}

	/**
	 * 
	 * 
	 * ָ�����������ƣ���������ֵ
	 * 
	 * 
	 * @param itemName
	 *            String
	 * 
	 * 
	 * @return String
	 * 
	 * 
	 */

	public String getValue(String itemName) {

		return p.getProperty(itemName);

	}

	/**
	 * 
	 * 
	 * ָ�����������ƺ�Ĭ��ֵ����������ֵ
	 * 
	 * 
	 * @param itemName
	 *            String
	 * 
	 * 
	 * @param defaultValue
	 *            String
	 * 
	 * 
	 * @return String
	 * 
	 * 
	 */

	public String getValue(String itemName,

	String defaultValue) {

		return p.getProperty(itemName, defaultValue);

	}

	/**
	 * 
	 * 
	 * �������������Ƽ���ֵ
	 * 
	 * 
	 * @param itemName
	 *            String
	 * 
	 * 
	 * @param value
	 *            String
	 * 
	 * 
	 */

	public void setValue(String itemName, String value) {

		p.setProperty(itemName, value);

		return;

	}


	/**
	 * 
	 * 
	 * main method for test
	 * 
	 * 
	 * @param args
	 *            String[]
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String file = "config.properties";

		PropertiesUtil pu = new PropertiesUtil(file);

		pu.list();
		System.out.print("test ="+pu.getValue("url"));

	}

}
