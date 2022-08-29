package com.baewooga.study.test.ch07.practice;


public class Runner {

//	int plyer;
//	int oder1;
//	int oder2;
//	
//	public int add1 (int player, int oder1, int oder2) {
//		
//		return plyer * oder1 + oder2;
//	}
	
	int sum = 0; 
	int[] add = new int[3];
	
	
	public void SortByAsc(int add[]) {
		
		for(int i=0; i<add.length; i++) {
			
			for (int j = 0; j < add.length -1; j++) {
				
				if (add[i] < add[j]) {
					int temp = add[i];
					add[i] = add[j];
					add[j] = temp;
				}
			}
		}
	}

	public int getSum(int add[]) {
		sum = add[0] * add[1] + add[2];
		return sum;
	}
	
	public void printAdd(int add[]) {
		
		for (int i = 0; i < add.length; i++) {
			System.out.print(add[i] + " ");
		}
		System.out.println(" ");
	}	
	
	
	
	
	
	
}
