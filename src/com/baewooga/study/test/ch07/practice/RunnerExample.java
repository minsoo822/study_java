package com.baewooga.study.test.ch07.practice;

public class RunnerExample {

	public static void main(String[] args) {
	
		Runner sortFirst = new Runner();
		
		Runner2 sortSecond = new Runner2();
		
		int[] add = {2, 40, 20};
		
		
		System.out.println("정렬 전=============");
		sortFirst.printAdd(add);
		
		System.out.println("정렬 후=============");
		sortFirst.SortByAsc(add);
		sortFirst.printAdd(add);
		
		System.out.println("부모 메서드2=============");
		System.out.println(sortFirst.getSum(add));
		
		System.out.println("자식 메서드2=============");
		System.out.println(sortSecond.getSum(add));
		
		System.out.println("값 차이=============");
		System.out.println(sortFirst.getSum(add) - sortSecond.getSum(add));
	
	}
}
