package com.javacore.method;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n:   ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
