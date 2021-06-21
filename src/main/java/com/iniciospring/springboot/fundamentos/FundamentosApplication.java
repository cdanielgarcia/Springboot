package com.iniciospring.springboot.fundamentos;

import com.iniciospring.springboot.fundamentos.bean.MyBean;
import com.iniciospring.springboot.fundamentos.bean.MyBeanWithDependency;
import com.iniciospring.springboot.fundamentos.bean.MyFirstBean;
import com.iniciospring.springboot.fundamentos.bean.MySecondImplement;
import com.iniciospring.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
    private MyBean myBean;
    private MyBeanWithDependency myBeanWithDependency;
    private MySecondImplement mySecondImplement;

    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,
                                  MyBeanWithDependency myBeanWithDependency, MySecondImplement mySecondImplement) {

        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
        this.mySecondImplement = mySecondImplement;

    }


    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        componentDependency.saludar();
        Function<Integer, Integer> function = (t) -> t * t;
        componentDependency.multiplicar(49, 7, function);
        myBean.print(8, 3);
        myBeanWithDependency.printWithDependency();
        mySecondImplement.inicio();

    }
}
