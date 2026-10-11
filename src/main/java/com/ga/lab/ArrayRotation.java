package com.ga.lab;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ArrayRotation {

    public static void rotate(int arr[], int d, int n){
        if (n==0){
            return;
        }
        d= d % n;
        int[] temp= new int [n];

        for (int i =0; i< n; i++){
            temp[i]= arr[(i+d) % n];
        }
        for (int i=0;i<n; i++){
            arr[i]= temp[i];
        }
    }

    public static void main(String[] args) {
        int[] sampleArray= {10,20,30,40,50};
        rotate(sampleArray,2, sampleArray.length);
        System.out.println(Arrays.toString(sampleArray));
        System.out.println("=======");
        int[] sampleArray2= {10,20,30,40,50, 60};
        rotate(sampleArray2,4, sampleArray2.length);
        System.out.println(Arrays.toString(sampleArray2));

    }
}
