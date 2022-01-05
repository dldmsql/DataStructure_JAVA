package com.company.day02;

import java.util.Arrays;

public class fibonacci {
    // 피보나치 수열 구현하기

    public static int fibo1(int n){
        // n <0 안된다.
        // n <=1 자기 자신을 반환한다.

        // 점화식 f(0) = 0, f(1) = 1, f(n) = f(n-2) + f(n-1) ( n >= 2 )

        if (n <0 ) return -1;
        if(n<=1) return n;

        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for(int i = 2; i <= n; i++){
            fn = f1 +f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    public static int fibo2(int n ){
        // 점화식 f(0) = 0, f(1) = 1, f(n) = f(n-2) + f(n-1) ( n >= 2 )

        if ( n <0 ) return -1;
        if (n <= 1 ) return n;

        return fibo2(n-2) + fibo2(n-1);
    }
    public static void main(String[] args) {
        System.out.println("fibo1: "+fibo1(5));
        System.out.println("fibo2: "+fibo2(5));

        // 2 <= n <= 40, 알고리즘 반복 횟수 출력
        int cnt = 0;
        for(int i = 2; i<=40; i++){
            fibo2(i);
            cnt++;
        }
        System.out.print("Cnt: " + cnt); // cnt = 39

        // 점화식 f(1) =1 , f(2) = 1, f(n) = f(n-2) + f(n-1) ( n>2 )
    }
}
