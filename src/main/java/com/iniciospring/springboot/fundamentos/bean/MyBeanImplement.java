package com.iniciospring.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print(int a, int b) {

        System.out.println("hola desde mi bean");
    }
}
