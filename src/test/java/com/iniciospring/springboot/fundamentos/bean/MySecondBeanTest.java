package com.iniciospring.springboot.fundamentos.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MySecondBeanTest {

    @Autowired
    MySecondImplement mySecondImplement;

//    @MockBean
//    MyFirstBean myFirstBean;

    @Test
    void test_my_first_bean() {

//        Mockito.when(myFirstBean.calculaPromedio(any(Double.class), any(Double.class), any(Double.class))).thenReturn(any(Double.class));

        String resultadoEsperado = "hola mundo";
        String stringDevuelto = mySecondImplement.inicio();
        Assertions.assertEquals(resultadoEsperado, stringDevuelto);

    }

}
