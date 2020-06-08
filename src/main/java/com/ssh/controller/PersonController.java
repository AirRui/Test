package com.ssh.controller;

import com.ssh.entity.Person;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName PersonController
 * @Author Lenovo
 * @Date 2020/6/5 16:49
 * @Version 1.0
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/getAllPerson")
    @ResponseBody
    public List<Person> getAllPerson(){
        List<Person> allPerson = personService.getAllPerson();
        return allPerson;
    }
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
