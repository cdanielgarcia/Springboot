package com.iniciospring.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean {
    @Override
    public void print(int a, int b) {
        int resultado = a<b ? a : b;
        System.out.println(resultado);
    }
}
