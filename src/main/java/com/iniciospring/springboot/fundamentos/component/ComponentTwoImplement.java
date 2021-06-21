package com.iniciospring.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("hola desde mi componente dos");
    }

    @Override
    public void multiplicar(int n1, int n2, Function<Integer, Integer> function) {
        int total = n1/n2;
        System.out.println(total);
        System.out.println(function.apply(10));
    }

}
