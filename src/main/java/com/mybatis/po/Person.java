package com.mybatis.po;

public class Person
{
    private int id;
    private String name;
    private int age;
    private int idcard_id;

    public Person(){}

    public Person(int id, String name, int age, int idcard_id)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idcard_id = idcard_id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getIdcard_id()
    {
        return idcard_id;
    }

    public void setIdcard_id(int idcard_id)
    {
        this.idcard_id = idcard_id;
    }
}
