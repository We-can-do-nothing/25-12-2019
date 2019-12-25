package com.cqjtu.service.impl;

import com.cqjtu.dao.IFirstHomeworkDao;
import com.cqjtu.dao.impl.FirstHomeworkDao;
import com.cqjtu.pojo.FirstHomework;
import com.cqjtu.service.IFirstHomeworkService;

public class FirstHomeworkService implements IFirstHomeworkService {

    private IFirstHomeworkDao dao = new FirstHomeworkDao();

    @Override
    public FirstHomework findFirstHomeworkByNameAndPassword(String name, String password) {
        return dao.findFirstHomeworkByNameAndPassword(name, password);
    }

    @Override
    public boolean findFirstHomeworkByName(String name) {
        return dao.findFirstHomeworkByName(name);
    }

    @Override
    public void registerFirstHomework(FirstHomework firstHomework) {
        dao.registerFirstHomework(firstHomework);
    }
}
