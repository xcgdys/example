package com.helloworld.example.service;

import com.helloworld.example.bean.TestBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/15.
 */
public interface TestBeanServiceIf {

    public int save(TestBean testBean);

    public TestBean findById(Serializable id);

    /**
     * xml实现
     * @return 主键
     */
    public int insertDemo(TestBean testBean);

}
