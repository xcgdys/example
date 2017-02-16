package com.helloworld.example.service.impl;

import com.helloworld.example.bean.TestBean;
import com.helloworld.example.dao.TestBeanMapper;
import com.helloworld.example.service.TestBeanServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/15.
 */
@Service
public class TestBeanService implements TestBeanServiceIf {
    @Autowired
    private TestBeanMapper testBeanMapper;

    @Override
    public int save(TestBean testBean) {
        return testBeanMapper.save(testBean);
    }

    @Override
    public TestBean findById(Serializable id) {
        return testBeanMapper.findById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertDemo(TestBean testBean) {
        int i = testBeanMapper.insertDemo(testBean);
        return i;
    }

}
