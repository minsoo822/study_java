package com.baewooga.study.ch06;

public class PostExample {

	public static void main(String[] args) {
		
		
		Post post0 = new Post();
		Post post1 = new Post("김민수");
		Post post2 = new Post("김민수", 24);
		Post post3 = new Post("김민수", false);
		Post post4 = new Post("김민수", 54, true);
		
		
		System.out.println("post1.name: " + post1.name);
		System.out.println("---------------------------");
		
		
		System.out.println("post2.name: " + post2.name);
		System.out.println("post2.lookup: " + post2.lookup);
		System.out.println("---------------------------");
		
		
		System.out.println("post3.name: " + post3.name);
		System.out.println("post3.use: " + post3.use);
		System.out.println("---------------------------");
		
		
		System.out.println("post4.name: " + post4.name);
		System.out.println("post4.lookup: " + post4.lookup);
		System.out.println("post4.use: " + post4.use);
		System.out.println("---------------------------");
		
		post0.show();
		post1.show();
		post2.show();
		post3.show();
		post4.show();
		
		
	}

}
