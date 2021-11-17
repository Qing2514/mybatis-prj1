package com.mybatis.test;

import com.mybatis.po.MyUser;
import com.pojo.MapUser;
import com.pojo.SelectUserParam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest
{
    public static void main(String[] args)
    {
        try
        {
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            SqlSession ss = ssf.openSession();

            //查询一个用户
//            MyUser mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
//            System.out.println("查找：" + mu.getUname());
//
//            //添加一个用户
//            MyUser addmu = new MyUser();
//            addmu.setUid(11);
//            addmu.setUname("王五");
//            addmu.setUsex("男");
//            ss.insert("com.mybatis.mapper.UserMapper.addUser", addmu);
//            System.out.println("添加：" + addmu.getUname());
//
//            //修改一个用户
//            MyUser updatemu = new MyUser();
//            updatemu.setUid(1);
//            updatemu.setUname("孙琦");
//            updatemu.setUsex("女");
//            ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
//            System.out.println("修改：" + updatemu.getUname());
//
//            //删除一个用户
//            System.out.println("删除数量：" + ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 1));

            //查询所有用户
//            Map<String, Object> map = new HashMap<>();
//            map.put("u_name", "陈");
//            map.put("u_sex", "男");
//            SelectUserParam su = new SelectUserParam();
//            su.setU_name("陈");
//            su.setU_sex("男");
//            List<MyUser> allmu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser", su);
//            List<Map<String, Object>> allmu=ss.selectList ("com.mybatis.mapper.UserMapper.selectAllUser");

            List<MapUser> mapUsers = ss.selectList ("com.mybatis.mapper.UserMapper.selectResultMap");
            System.out.println("所有用户：");
            for (MapUser user : mapUsers)
            {
                System.out.println(user.getM_uid() + " " + user.getM_uname() + " " + user.getM_usex());
            }
            ss.commit();
            ss.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}