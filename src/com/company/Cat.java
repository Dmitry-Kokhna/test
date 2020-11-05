package com.company;

import java.util.Scanner;

public class Cat extends Animal {

    @Override
    public int ves() {
        return w1*w1;
    }
    @Override
    public void voice() {
        System.out.println("умножим вес кота");
    }
}
