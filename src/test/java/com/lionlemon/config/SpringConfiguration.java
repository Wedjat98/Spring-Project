package com.lionlemon.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//表示该类是一个Spring的核心配置类
@Configuration // <context:component-scan base-package="com.lionlemon"/>
@ComponentScan("com.lionlemon")
//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
//<import resource="applicationContext-dao.xml"/>
@Import({DataSourceConfiguration.class})//参数是个数组，可以写多个引入 用,号隔开
public class SpringConfiguration {
}
