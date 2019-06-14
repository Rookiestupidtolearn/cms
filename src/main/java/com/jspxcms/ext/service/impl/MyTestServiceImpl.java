package com.jspxcms.ext.service.impl;

import com.jspxcms.ext.domain.MyTest;
import com.jspxcms.ext.repository.MyTestDao;
import com.jspxcms.ext.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MyTestServiceImpl implements MyTestService {
    @Autowired
    private MyTestDao myTestDao;

    @Override
    public List<MyTest> findAll() {
        return myTestDao.findAll();
    }
}
