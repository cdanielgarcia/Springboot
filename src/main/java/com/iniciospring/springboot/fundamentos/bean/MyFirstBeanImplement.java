package com.iniciospring.springboot.fundamentos.bean;

public class MyFirstBeanImplement implements MyFirstBean {
    @Override
    public double calculaPromedio(double num1, double num2, double num3) {
        double promedio = (num1 + num2 + num3) / 3;
        return promedio;
    }
}
