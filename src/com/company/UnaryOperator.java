package com.company;

public interface UnaryOperator<D extends Number> {
    static UnaryOperator<Double> sqrt() {
        return sqrt();
    }

    void method();
}
