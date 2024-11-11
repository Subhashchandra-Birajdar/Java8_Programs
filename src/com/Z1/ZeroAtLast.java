package com.Z1;
import java.util.Arrays;

public class ZeroAtLast {
	     public static void m1(int[] arr){
	         int nonZeroIndex = 0;
	         for(int i=0;i<arr.length;i++){
	             if(arr[i]!=0){
	                 arr[nonZeroIndex++] =arr[i];
	             }
	         }
	         
	         while(nonZeroIndex < arr.length){
	             arr[nonZeroIndex++] =0;
	         }
	     }	     
	     
	    public static void main(String[] args) {
	     int[] arr = {1,2,2,0,0,3,2,1,0,9,2,0};
	     m1(arr);
	     System.out.println("array zero at last :"+Arrays.toString(arr));
	    }
	}