package com.baewooga.study.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
//		*************************		
		int[] arr1 = new int[3];
//		**************************중요
		int[] arr2 ;
		arr2 = new int[5];
		
		arr1[0] = 77;
		System.out.println("arr1[0] : " + arr1[0]);

		arr1[1] = 88;
		System.out.println("arr1[1] : " + arr1[1]);
		
		arr1[2] = 99;
		System.out.println("arr1[2] : " + arr1[2]);
	
		System.out.println("-------------------------------");
		
		arr2[0] = 55;
		arr2[1] = 66;
		arr2[2] = 77;
		arr2[3] = 88;
		arr2[4] = 99;
		
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i +"] :" + arr2[i]);
		}
		
	}

}
