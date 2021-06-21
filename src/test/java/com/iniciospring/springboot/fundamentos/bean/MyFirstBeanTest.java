package com.iniciospring.springboot.fundamentos.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyFirstBeanTest {

    @Autowired
    MyFirstBean myFirstBean;

    @Test
    void test_my_first_bean() {
        double valor1 = 2.0;
        double valor2 = 2.0;
        double valor3 = 3.0;
        double resultadoEsperado = 2.3333333333333335;

        Double resultadoObtenido = myFirstBean.calculaPromedio(valor1, valor2, valor3);
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    void test_my_first_bean_other() {
        double valor1 = 2.0;
        double valor2 = 2.0;
        double valor3 = 2.0;
        double resultadoEsperado = 2;

        Double resultadoObtenido = myFirstBean.calculaPromedio(valor1, valor2, valor3);
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);

    }
}
