package com.zr.ems.service;

import com.zr.ems.pojo.Emp;

/**
 * ����ӿ�
 *
 */
public interface IEmpService {

	/**
	 * ͨ���ǳƺ��������emp����
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

	/**
	 * �����ǳ��ж��û��Ƿ����
	 * 
	 * @param nickname
	 * @return
	 */
	

}
