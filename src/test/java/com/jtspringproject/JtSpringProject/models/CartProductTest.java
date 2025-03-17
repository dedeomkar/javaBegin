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
        CartProduct cartProduct = new CartProduct();

        String s = "aaaaaaaaabaa";
        int k = 1;

        int sLen = s.length();

        String smallest = s.substring( 0, k);
        String largest = s.substring( 0, k);

        List<String> list = new ArrayList<>();
        for (int i=0; i+k <= sLen ; i++){
            String subStr = s.substring( i, i + k);
            if (smallest > subStr) {
                smallest = subStr;
            }
            if (largest < subStr) {
                largest = subStr;
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}


















