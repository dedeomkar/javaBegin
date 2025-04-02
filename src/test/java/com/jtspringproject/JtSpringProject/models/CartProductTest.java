package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;

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

        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                result = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                result = "Weird";
            } else if (n > 20) {
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
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
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
        for (int i = 0; i + k <= sLen; i++) {
            String subStr = s.substring(i, i + k);
            if (smallest.compareTo(subStr) > 0)
                smallest = subStr;
            if (largest.compareTo(subStr) < 0)
                largest = subStr;
        }
        System.out.println("The smallest Lexicographically formed substring from welcometojava is : " + smallest + " \n" + "The largest Lexicographically formed substring from welcometojava is : " + largest);
    }


    @Test
    void theTest4() {
        // https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=false
        int a = 5;
        int b = 3;
        int n = 5;
        int q = 2;
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println();
    }


    @Test
    public void theTest5() {
        // https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=false
        String one = "cat";
        String two = "car";
        System.out.println(one.length() + two.length());
        int result = one.compareTo(two);
        if (result <= 0) {
            System.out.println("No");
        } else if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("hello is equal to java");
        }
        System.out.println(Character.toUpperCase(one.charAt(0)) + one.substring(1) + " " + Character.toUpperCase(two.charAt(0)) + two.substring(1));
    }

//    public static String capitalizeFirstLetter(String str) {
//        if (str == null || str.isEmpty()) {
//            return str;  // Return original if it's null or empty
//        }
//        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
//    }


    @Test
    public void theTest6(){
    //    https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=false
        String A = "madam";
        char Arr = A.charAt(0);
        String B = StringUtils.reverse(A);
        Boolean T = true;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                T = true;
            } else {
                T = false;
            }
        }
        if (T) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//        A.chars().forEach(i -> System.out.println((char)i));
//        for(char i = 0; i < A.length(); i++){
//            if(Character.isLetterOrDigit(i)){
//                Arr.
//            }
//        }


    }

    @Test
    public void theTest7() {
        // https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=false

    }

    @Test
    public void theTest8() {
        // https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=false

    }
}





















