/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lavry
 */
public class Main {
    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc(4, 2);
        System.out.println("Sum: " + calc.getSum());
        System.out.println("Diff: " + calc.getDiff());
        System.out.println("Mult: " + calc.getMult());
        System.out.println("Div: " + calc.getDiv());
    }
}    