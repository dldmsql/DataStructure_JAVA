package com.company.day02;

import java.util.Arrays;

public class factorial {
    // 팩토리얼 알고리즘 구현하기

    public static int fact1(int n) {
        if (n <0 ) return -1;
        if(n<=1) return n;

        int fn = 1;
        for(int i = 2; i <= n; i++){
            fn = fn * i;
        }
        return fn;
    }
    public static int fact2(int n){
        if (n<0) return -1;
        if(n<=1) return n;

        return n*fact2(n-1);
    }
    public static void main(String[] args) {
        System.out.println("fact1: " + fact1(5) );
        System.out.println("fact2: " + fact2(5) );

        int cnt = 0;
        for(int i =2; i<=40; i++){
            fact2(i);
            cnt++;
        }
        System.out.println("cnt::" + cnt); // cnt = 39
    }
}
