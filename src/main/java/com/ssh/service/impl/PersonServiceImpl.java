package com.ssh.service.impl;

import com.ssh.dao.PersonDao;
import com.ssh.entity.Person;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName PersonServiceImpl
 * @Author Lenovo
 * @Date 2020/6/5 16:48
 * @Version 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    public List<Person> getAllPerson() {
        List<Person> list = personDao.getAllPerson();
        return list;
    }
}
