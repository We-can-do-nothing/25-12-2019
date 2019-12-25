package com.cqjtu.test;

import java.sql.*;

import com.cqjtu.Utils.connectionPool;
import com.cqjtu.Utils.connectionPoolUtils;

public class dbTest {
    public static void main(String[] args) {
        connectionPool connectPool = connectionPoolUtils.getPoolInstance();
        Connection connection = null;
//        获取连接池的一个数据库连接
        try {
            connection = connectPool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }
}
