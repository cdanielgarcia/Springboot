package com.iniciospring.springboot.fundamentos.configuration;


import com.iniciospring.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation myOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependencyImplement beanOperationWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }

    @Bean
    public MyFirstBean myFirsBean() {
        return new MyFirstBeanImplement();
    }

    @Bean
    public MySecondImplement mySecondBean(MyFirstBean myFirstBean) {
        return new MySecondBean(myFirstBean);
    }
}
