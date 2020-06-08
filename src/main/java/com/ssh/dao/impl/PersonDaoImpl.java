package com.ssh.dao.impl;

import com.ssh.dao.PersonDao;
import com.ssh.entity.Person;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserDaoImpl
 * @Author Lenovo
 * @Date 2020/6/5 16:40
 * @Version 1.0
 */
@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<Person> getAllPerson() {
        String hql = "from Person";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }
}
