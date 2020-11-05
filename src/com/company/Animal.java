package com.company;

import java.util.Scanner;

class Animal {

    Scanner scan=new Scanner(System.in);
    int w1=scan.nextInt();
    public int ves() {
        return w1+2;
    }

    public void voice() {
        System.out.println("добавим 2 кг");
    }

}
