package com.cqjtu.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class connectionPoolUtils {
    private static connectionPool poolInstance = null;
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    private connectionPoolUtils(){}

    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");

        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 给到数据库连接池的单例模式
     * @return
     */
    public static connectionPool getPoolInstance() {
        if (poolInstance == null){
            poolInstance = new connectionPool(driver, url, user, password);
            try {
                poolInstance.createPool();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return poolInstance;
    }
}
