package com.mybatis.test;

import com.dao.PersonDao;
import com.mybatis.po.Person;
import com.pojo.SelectPersonById;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestOneToOneTest
{

    @Autowired
    private PersonDao personDao;

    @Test
    void test1()
    {
        Person p1 = personDao.selectPersonById1(1);
        System.out.println(p1);
        System.out.println("======================");
        Person p2 = personDao.selectPersonById2(1);
        System.out.println(p2);
        System.out.println("======================");
        SelectPersonById p3 = personDao.selectPersonById3(1);
        System.out.println(p3);
    }
}