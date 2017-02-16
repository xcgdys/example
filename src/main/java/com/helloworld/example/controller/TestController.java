package com.helloworld.example.controller;

import com.helloworld.example.bean.TestBean;
import com.helloworld.example.service.TestBeanServiceIf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2017/2/15.
 */
@Controller
@RequestMapping("test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestBeanServiceIf testBeanServiceIf;
    @Autowired
    private FreeMarkerProperties properties;

    @RequestMapping("index")
    public String test(){
        return "index";
    }

    @RequestMapping("save")
    @ResponseBody
    public Object test2(TestBean testBean){
        int id = testBeanServiceIf.save(testBean);
        logger.info("id:{}",id);
        return testBean;
    }

    @RequestMapping("/find/{id}")
    @ResponseBody
    public TestBean find(@PathVariable("id") int id){
        return testBeanServiceIf.findById(id);
    }


    @RequestMapping("insertDemo")
    @ResponseBody
    public Object insertDemo(){
        TestBean testBean = new TestBean();
        testBean.setName("中文字符串测试");
        testBeanServiceIf.insertDemo(testBean);
        return testBean;
    }

    @RequestMapping("freemarker")
    @ResponseBody
    public Map freemarker(){
        return properties.getSettings();
    }

}
