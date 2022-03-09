package com.ustc.util;

import java.security.MessageDigest;

import javax.servlet.http.HttpServletRequest;

/**
 * DOCUMENT ME!
 * 
 * @author <a href="mailto:roy.wang123@gmail.com">Roy Wang</a>
 * @version 1.0
 */
public final class SecurityUtil {
	private SecurityUtil() {
	}

	public static final String JMA_MD5 = "MD5";
	public static final String SCH_USERID = "20080808";
	public static final String SCH_USERNAME = "admin";
	public static final String SCH_PSW = "pass111";

	/**
	 * @param input
	 * @return
	 */
	/**
	 * @param input
	 * @return
	 */
	// ͳһ��MD5�����㷨,Ϊ��վ��ȫ��
	public static String md5(String input) {
		StringBuffer total = new StringBuffer();

		try {
			MessageDigest md5 = MessageDigest.getInstance(JMA_MD5);
			byte[] inputs = input.getBytes();
			md5.update(inputs);

			byte[] out = md5.digest();

			// MessageDigest will return the 16 length byte[].
			for (int i = 0; i < 16; i++) {
				String temp = Integer.toHexString(out[i]);

				if (out[i] < 0) {
					temp = temp.substring(6);
				}

				// assure the result to be 32-character.
				if (temp.length() == 1) {
					temp = "0" + temp;
				}

				total.append(temp);
			}
		} catch (Exception ex) {

		}
		return total.toString();
	}

	/**
	 * @param userTicket
	 * @return
	 */
	// Ϊ��վ��ȫͳһ����֤�û�����������Դ������
	public static boolean isCorrectUserTicket(HttpServletRequest request) {

		String isCorrectUserTicket = (String) request.getSession().getAttribute("isCorrectUserTicket");

		return "1".equals(isCorrectUserTicket);
	}
}
