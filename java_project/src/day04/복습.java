package day04;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");
		int number = sc.nextInt();
		
		// 문제1) 입력받은 수가 0이아닌짝수, 홀수, 0 출력
		if(number == 0) {
			System.out.println("0");
		}else if(number % 2 == 0) {
			System.out.println("짝수");
		}else if(number % 2 != 0) {
			System.out.println("홀수");
		}
		
		// 문제2) 입력받은 수가 3의배수, 7의배수, 3과7의배수, 둘다아님 출력
		if(number % 3 == 0 && number % 7 == 0) {
			System.out.println("3과7의배수");
		}else if(number % 3 == 0) {
			System.out.println("3의배수");
		}else if(number % 7 == 0) {
			System.out.println("7의배수");
		}else {
			System.out.println("둘다아님");
		}
		
	}

}














