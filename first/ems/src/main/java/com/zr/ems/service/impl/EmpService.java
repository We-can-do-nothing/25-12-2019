package com.zr.ems.service.impl;

import com.zr.ems.dao.IEmpDao;
import com.zr.ems.dao.impl.EmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;

/**
 * 
 * ����ӿڵ�ʵ����
 * 
 * @author Administrator
 *
 */
public class EmpService implements IEmpService {

	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
		IEmpDao empDao = new EmpDao();

		// ����dao�еķ���
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

}
