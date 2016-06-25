package com.ourgame.wpqservice.main;

import com.ourgame.wpqservice.service.ITestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lishj on 2016/6/26.
 */
public class main {

    public static void  main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ITestService bean = (ITestService) context.getBean("testService") ;
        bean.seyHello("test");
        System.in.read();

    }
}
