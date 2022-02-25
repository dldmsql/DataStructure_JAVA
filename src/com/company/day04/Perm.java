package com.company.day04;

import java.util.Arrays;

public class Perm {
    static int[] list;
    static int R = 3;
    static int[] resulList;
    static boolean[] visited;
    private static boolean nextPermutation(int[] list){
        int i = list.length - 1;
        int j = list.length -1;

        while(i > 0 && list[i-1] >= list[i]) i--;
        if( i <= 0 ) return false;

        while(list[i-1] > list[j]) j--;
        swap(i-1,j);

        j = list.length -1;
        for(; i<j; ++i, --j){
            swap(i,j);
        }
        return true;
    }
    private static void swap(int i , int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static void nPrSwap(int d){
        // d = depth
        if( d == R ){
            System.out.println(Arrays.toString(list));
            return;
        }
        for(int i = d; i < list.length; i++){
            swap(d, i);
            nPrSwap(d+1);
            swap(d, i);
        }
    }
    public static void permutation(int idx){
        if( idx == R){
            return;
        }
        for( int i = 0; i < list.length; ++i){
            if(visited[i]) continue;

            resulList[idx] = list[i];
            visited[i] = true;
            permutation(idx+1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        list = new int[]{1,2,3};
        resulList = new int[R];
        visited = new boolean[list.length];
        permutation(3);
    }
}
