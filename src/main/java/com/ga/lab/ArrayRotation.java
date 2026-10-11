package com.ga.lab;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ArrayRotation {

    public static void rotateArray(int arr[], int positionsToRotate, int arraySize){
        if (arraySize==0){
            return;
        }
        positionsToRotate= positionsToRotate % arraySize;
        int[] temp= new int [arraySize];

        for (int i =0; i< arraySize; i++){
            temp[i]= arr[(i+positionsToRotate) % arraySize];
        }
        for (int i=0;i<arraySize; i++){
            arr[i]= temp[i];
        }
    }

    public static void main(String[] args) {
        int[] sampleArray= {10,20,30,40,50};
        rotateArray(sampleArray,2, sampleArray.length);
        System.out.println(Arrays.toString(sampleArray));
        System.out.println("=======");
        int[] sampleArray2= {10,20,30,40,50, 60};
        rotateArray(sampleArray2,4, sampleArray2.length);
        System.out.println(Arrays.toString(sampleArray2));

    }
}
