package com.iniciospring.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation0;
    public MyBeanWithDependencyImplement(MyOperation myOperation){

        this.myOperation0 = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation0.sum(numero));
        System.out.println("hola desde el bean con dependencia");
    }
}
