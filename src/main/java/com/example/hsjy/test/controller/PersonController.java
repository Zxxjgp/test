package com.example.hsjy.test.controller;

import com.example.hsjy.test.entity.Person;
import com.example.hsjy.test.entity.Student;
import com.example.hsjy.test.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")

public class PersonController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("#{'大人的世界你好'}")
    private  String name;
   // @Value("${spring.datasource.driver-class-name}")
   // @Value("${medate}")
    @Value("#{testValue.name}")
    //@Value("${medate}")
    private String jdbcUrl;


    @Resource

    private PersonService personService;

    @RequestMapping(value = "list",  method = RequestMethod.GET)
    public ModelAndView getAll(){
        ModelAndView mv=new ModelAndView("index");
        return mv;
    }
    @RequestMapping("rr")
    public List<Person> getAlls(){
        logger.info("你会在哪啊  ");
        logger.trace("trace日志。。");
        logger.debug("debug日志。。");

        //SpringBoot默认给的是info级别，如果没指定就是springboot默认的root级别
        logger.info("info日志。。。");
        logger.warn("warn日志。。。");
        logger.error("error日志。。");
        return personService.selectAllUser();
    }

    @RequestMapping("test")
    public String get(){
        Student student = new Student(20160001, "孔明", 20, 1, "土木工程", "武汉大学");
        Student de = new Student(2,null,4,5,"","");
        //BeanUtils.copyProperties(student,de);
        Optional.ofNullable(de).map(x -> x.getName());
        System.out.println(de.getName());
        return null;
    }


    @RequestMapping("fileupload")
    public  void  testFileLoadFile(HttpServletRequest httpServletRequest, MultipartHttpServletRequest multipartHttpServletRequest){
        //获取文件的路径
        String filpath = multipartHttpServletRequest.getFile("file").getOriginalFilename();

        //获取文件名
        String fileName = filpath.substring(filpath.lastIndexOf('\\')+1);
    }

    @RequestMapping("ht")
    @ResponseBody
    public String getValue(){

        return jdbcUrl;
    }
}
