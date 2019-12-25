package com.zr.ems.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zr.ems.dao.IEmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.utils.MyDBUtils;

/**
 * �־ò��ʵ����
 *
 */
public class EmpDao implements IEmpDao {

	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		String sql = "select * from usr where nickname=? and password=?";

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname);
			prepareStatement.setString(2, password);

			// 4, ִ��sql���, �õ������
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, �����ֵ, ���װ, Ȼ��, ����
			while (resultSet.next()) {
				// ��ȡ���ݿ��ж�Ӧ������ֵ
				int id = resultSet.getInt("id");
				String gender = resultSet.getString("gender");
				String email = resultSet.getString("email");

				// �����ݸ�ײ��������
				Emp emp = new Emp(id, nickname, password, gender, email);

				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �Ͽ�����, �ͷ���Դ
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public int findEmpByNickname(String nickname) {

		String sql = "select * from emp where nickname=?";

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname);

			// 4, ִ��sql���, �õ������
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, �����ֵ, ���װ, Ȼ��, ����
			while (resultSet.next()) {

				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �Ͽ�����, �ͷ���Դ
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public void registerEmp(Emp emp) {
		String sql = "insert into usr values(null, ?, ?, ?, ?)";

		Connection connection = MyDBUtils.getConnection();

		try {
			// ��ȡ��ִ��sql�Ķ���
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// ��ռλ����ֵ
			prepareStatement.setString(1, emp.getNickname());
			prepareStatement.setString(2, emp.getPassword());
			prepareStatement.setString(3, emp.getGender());
			prepareStatement.setString(4, emp.getEmail());

			// ִ�� ��, ɾ, ��, ����ʹ��executeUpdate()����
			prepareStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
