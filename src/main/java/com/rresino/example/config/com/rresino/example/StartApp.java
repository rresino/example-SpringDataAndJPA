package com.rresino.example.config.com.rresino.example;

import com.rresino.example.config.AppConfig;
import com.rresino.example.config.com.rresino.example.repository.HomeDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by rresino on 20/09/2016.
 */
public class StartApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        HomeDao dao = (HomeDao) ctx.getBean("HomeDao");

        System.out.println(dao.findByName("name1"));
    }

}
