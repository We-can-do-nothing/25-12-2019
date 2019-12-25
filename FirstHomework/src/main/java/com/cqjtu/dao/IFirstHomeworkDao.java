package com.cqjtu.dao;

import com.cqjtu.pojo.FirstHomework;

public interface IFirstHomeworkDao {

    /**
     * 通过名字和密码查询FirstHomework
     * @param name
     * @param password
     * @return
     */
    FirstHomework findFirstHomeworkByNameAndPassword(String name, String password);

    /**
     * 查找是否存在该用户
     * @param name
     * @return
     */
    boolean findFirstHomeworkByName(String name);

    /**
     * 插入用户信息
     * @param firstHomework
     */
    void registerFirstHomework(FirstHomework firstHomework);
}
