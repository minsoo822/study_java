package com.baewooga.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		
		int[][] score = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		System.out.println("score[0][0]: " + score[0][0]);
		System.out.println("score[1][1]: " + score[1][1]);
		System.out.println("score[1][2]: " + score[1][2]);
		System.out.println("score[2][1]: " + score[2][1]);
		System.out.println("score[2][2]: " + score[2][2]);
		
		
//		개인의 평균
		
//		int sum = 0;
//		double avg = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 1 ; j++) {
//				System.out.println("i=" + i + " j = " + j + "  "+score[i][j] );
//				System.out.println(score[i][j]);
//			}
//			
//		}
//			avg = sum/3;
//			System.out.println("장원영의 국영수 평균점수: " + avg);
//
//		
		
//		과목별 평균
			
			System.out.println("국어 평균 : " + (score[0][0] + score[1][0] + score[2][0] + score[3][0] + score[4][0])/score.length);
			System.out.println("영어 평균 : " + (score[0][1] + score[1][1] + score[2][1] + score[3][1] + score[4][1])/score.length);
			System.out.println("수학 평균 : " + (score[0][2] + score[1][2] + score[2][2] + score[3][2] + score[4][2])/score.length);
			
			int kosum = 0;
			int egsum = 0;
			int masum = 0;
			
			double koavg = 0;
			double egavg = 0;
			double maavg = 0;
			
			
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 3; j++) {
					if (j == 1) {
						kosum = kosum + score[i][j];
					} else if (j == 2){
						egsum = egsum + score[i][j];	
					} else {
						masum = masum + score[i][j];
					}
		
				}
			}	
				koavg = ((double)kosum/score.length);
					System.out.println("국어점수를 다 더한 값의 평균은: " + koavg);
				egavg = ((double)egsum/score.length);
					System.out.println("영어점수를 다 더한 값의 평균은: " + egavg);
				maavg = ((double)masum/score.length);
					System.out.println("수학점수를 다 더한 값의 평균은: " + maavg);
					
					
					
					
					
					
					
			System.out.println("------------------------------------------");
			
			String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
			String[] subject = {"국어","영어","수학"};
			
			
			//1 개인의 평균
			/*
			for(int i=0; i<5; i++) {
				int sum=0;
				for(int j=0; j<3; j++) {
					sum +=scores[i][j];
				}
				System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
			}
			System.out.println("------------------------------");
			*/
			for(int i=0; i<scores.length; i++) {
				int sum=0;
				for(int j=0; j<scores[i].length; j++) {
					sum +=scores[i][j];
				}
				System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
//				System.out.println(name[i]+"의 평균 점수는: "+((double)sum/scores[i].length));
			}
			
			System.out.println("------------------------------");
			//2 과목별 평균
			for(int j=0; j<3; j++) {
				int sum=0;
				for(int i=0; i<5; i++) {
					sum +=scores[i][j];
				}
				System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
			}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			
		
	}

}
