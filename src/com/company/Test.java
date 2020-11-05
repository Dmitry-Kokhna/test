package com.company;

import javax.xml.catalog.Catalog;
import java.security.spec.NamedParameterSpec;
import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String []args) {

        System.out.println("Введите вес животного");
        Animal a1=new Animal();
        a1.voice();
        System.out.println(a1.ves());

        System.out.println(a1.w1);
        System.out.println("Введите вес кота");
        Cat cat1=new Cat();
        cat1.voice();
        System.out.println(cat1.ves());

            }
    }








