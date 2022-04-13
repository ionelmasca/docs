package com.company;

import java.sql.SQLOutput;

public class Euclid {


    // non-recursive implementation
    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {

        int d  = gcd(-2, -4);
        System.out.println(d);
    }
}


