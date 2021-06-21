package com.iniciospring.springboot.fundamentos.bean;

public class MySecondBean implements MySecondImplement {

    private MyFirstBean myFirstBean;

    public MySecondBean(MyFirstBean myFirstBean) {
        this.myFirstBean = myFirstBean;
    }

    @Override
    public String inicio() {
        double a, b, c;
        a = 10;
        b = 8;
        c = 9;
        System.out.println(myFirstBean.calculaPromedio(a, b, c));
       return "hola mundo";
    }
}
