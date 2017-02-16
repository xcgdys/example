package com.helloworld.example.dao;

import com.helloworld.example.bean.TestBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/15.
 */
@Mapper
public interface TestBeanMapper extends tk.mybatis.mapper.common.Mapper<TestBean>{

    @Insert("insert into testbean(name) values(#{name})")
    public int save(TestBean testBean);

    @Select("select * from testbean where id = #{id}")
    public TestBean findById(Serializable id);

    /**
     * xml实现
     * @return 主键
     */
    public int insertDemo(TestBean testBean);
}
