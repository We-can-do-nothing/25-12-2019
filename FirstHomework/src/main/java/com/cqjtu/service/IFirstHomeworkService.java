package com.cqjtu.service;

import com.cqjtu.pojo.FirstHomework;

public interface IFirstHomeworkService {

    /**
     * 通过姓名和密码查询
     * @param name
     * @param password
     * @return
     */
    FirstHomework findFirstHomeworkByNameAndPassword(String name, String password);

    /**
     * 查找用户是否存在
     * @param name
     * @return
     */
    boolean findFirstHomeworkByName(String name);

    /**
     * 插入注册信息
     * @param firstHomework
     */
    void registerFirstHomework(FirstHomework firstHomework);
}
