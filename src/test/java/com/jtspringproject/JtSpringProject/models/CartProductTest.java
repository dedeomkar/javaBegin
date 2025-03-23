package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CartProductTest {

    @Test
    void getIdTest() {
        CartProduct cartProduct = new CartProduct();
        cartProduct.getId();
        cartProduct.getId();
    }

    @Test
    void theTest1() {
        CartProduct cartProduct = new CartProduct();
        int n = 8;


        String result = "";

        if (n%2 == 0) {
            if (n >= 2 && n <= 5) {
                result = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                result = "Weird";
            } else if (n > 20)  {
                result = "Not Weird";
            }
        } else {
            result = "Weird";
        }

        System.out.println(result);
    }

    @Test
    void theTest2() {
        CartProduct cartProduct = new CartProduct();
        int N = 12;

        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 4 = 8
        // 2 x 5 = 10
        // ...
        for (int i=1; i<=10; i++) {
            System.out.println( N + " x " + i + " = " + N * i);
        }
    }

    @Test
    void theTest3() {
        //https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=false
        CartProduct cartProduct = new CartProduct();

        String s = "welcometojava";
        int k = 3;
        int sLen = s.length();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i=0; i+k <= sLen ; i++) {
            String subStr = s.substring(i, i + k);
            if (smallest.compareTo(subStr) > 0)
                smallest = subStr;
            if (largest.compareTo(subStr) < 0)
                largest = subStr;
        }
        System.out.println("The smallest Lexicographically formed substring from welcometojava is : " + smallest +" \n"+ "The largest Lexicographically formed substring from welcometojava is : " + largest);
    }


    @Test
    void theTest4() {
        // https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=false
        int a = 5;
        int b = 3;
        int n = 5;
        int q = 2;
        int sum = a;
        for(int i = 0; i < n; i++){
            sum += (int)Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println();
    }



    @Test
    void theTest5() {
        // https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=false


    }
}


















