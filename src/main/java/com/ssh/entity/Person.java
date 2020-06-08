package com.ssh.entity;

import javax.persistence.*;

/**
 * @ClassName Person
 * @Author Lenovo
 * @Date 2020/6/5 16:43
 * @Version 1.0
 */
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;

    public Person() {
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
