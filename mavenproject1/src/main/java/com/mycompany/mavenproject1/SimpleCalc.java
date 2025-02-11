/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author lavry
 */
public class SimpleCalc {
    private double p1;
    private double p2;

    public SimpleCalc(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getSum() {
        return p1 + p2;
    }

    public double getDiff() {
        return p1 - p2;
    }

    public double getMult() {
        return p1 * p2;
    }

    public double getDiv() {
        if (p2 != 0) {
            return p1 / p2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
