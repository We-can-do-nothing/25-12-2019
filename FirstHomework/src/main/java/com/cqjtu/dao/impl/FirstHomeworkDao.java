package com.cqjtu.dao.impl;

import com.cqjtu.Utils.connectionPool;
import com.cqjtu.Utils.connectionPoolUtils;
import com.cqjtu.dao.IFirstHomeworkDao;
import com.cqjtu.pojo.FirstHomework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstHomeworkDao implements IFirstHomeworkDao {

    @Override
    public FirstHomework findFirstHomeworkByNameAndPassword(String name, String password) {
        connectionPool mysqlConnectPool = connectionPoolUtils.getPoolInstance();
        Connection connection = null;
        try {
            connection = mysqlConnectPool.getConnection();
            if (connection == null)
                throw new SQLException();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("select * from Admin where name=? and password=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String gender = resultSet.getString("gender");
                double salary = resultSet.getDouble("salary");
                FirstHomework firstHomework = new FirstHomework(0, name, password, gender, salary);
                return firstHomework;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean findFirstHomeworkByName(String name) {
        connectionPool mysqlConnectPool = connectionPoolUtils.getPoolInstance();
        Connection connection = null;
        try {
            connection = mysqlConnectPool.getConnection();
            if (connection == null)
                throw new SQLException();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("select * from Admin where name=?");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public void registerFirstHomework(FirstHomework firstHomework) {
        connectionPool mysqlConnectPool = connectionPoolUtils.getPoolInstance();
        Connection connection = null;
        try {
            connection = mysqlConnectPool.getConnection();
            if (connection == null)
                throw new SQLException();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into Admin values (null, ?, ?, ?, ?)");
            preparedStatement.setString(1, firstHomework.getName());
            preparedStatement.setString(2, firstHomework.getPassword());
            preparedStatement.setString(3, firstHomework.getGender());
            preparedStatement.setDouble(4, firstHomework.getSalary());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
