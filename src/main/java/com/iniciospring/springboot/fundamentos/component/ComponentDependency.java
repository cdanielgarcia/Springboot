package com.iniciospring.springboot.fundamentos.component;

import java.util.function.Function;

public interface ComponentDependency {
    void saludar();
    void multiplicar(int n1, int n2, Function<Integer, Integer> function);
}
