package com.zr.ems.dao;

import com.zr.ems.pojo.Emp;

/**
 * emp�ĳ־ò�ӿ�
 */
public interface IEmpDao {

	/**
	 * ͨ���ǳƺ��������emp����
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

}
