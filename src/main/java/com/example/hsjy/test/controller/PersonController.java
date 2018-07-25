package com.example.hsjy.test.controller;

import com.example.hsjy.test.entity.Person;
import com.example.hsjy.test.entity.Student;
import com.example.hsjy.test.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * @ProjectName: test
 * @Package: com.example.hsjy.test.controller
 * @ClassName: PersonController
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/25 13:44
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/25 13:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("person")
public class PersonController {
    Logger logger = LoggerFactory.getLogger(getClass());

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
}
