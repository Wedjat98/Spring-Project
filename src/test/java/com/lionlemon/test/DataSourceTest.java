package com.lionlemon.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    //读取配置文件
    ResourceBundle rb = ResourceBundle.getBundle("jdbc");
    String driver = rb.getString("jdbc.driver");
    String url = rb.getString("jdbc.url");
    String username = rb.getString("jdbc.username");
    String password = rb.getString("jdbc.password");
    @Test
    //测试手动创建c3p0数据源
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/maven?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false\n");
        dataSource.setUser("root");
        dataSource.setPassword("admin");
        Connection connection = dataSource.getConnection();
        //暂时不去真正操作数据库
        System.out.println(connection);
        connection.close();

    }
    @Test
    //测试手动创建c3p0数据源(配置文件)
    public void test3() throws Exception {
        //创建数据源对象 设置连接参数
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        Connection connection= dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //测试手动创建druid数据源
    public void test2() throws Exception {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/maven?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false\n");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("admin");
        Connection connection = druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //测试spring容器产生的c3p0数据源对象
    public void test4() throws Exception {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection =dataSource.getConnection();
        //暂时不去真正操作数据库
        System.out.println(connection);
        connection.close();
    }
    @Test
    //测试spring容器产生的druid数据源对象
    public void test5() throws Exception {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DruidDataSource.class);
        Connection connection =dataSource.getConnection();
        //暂时不去真正操作数据库
        System.out.println(connection);
        connection.close();
    }
}
