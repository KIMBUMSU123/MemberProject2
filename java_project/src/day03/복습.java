package day03;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");
		int num = sc.nextInt();
		
		// 3의배수, 7의배수, 3과7의배수, 둘다아님
//		if(num == 0) {
//			System.out.println("0");
//		}else if(num % 3 == 0 && num % 7 == 0) {
//			System.out.println("3과 7의배수");	
//		}else if(num % 3 == 0) {
//			System.out.println("3의배수");	
//		}else if(num % 7 == 0) {
//			System.out.println("7의배수");	
//		}else {
//			System.out.println("둘다아님");	
//		}
		
		// 홀수, 0이아닌 짝수, 0
//		if(num == 0) {
//			System.out.println("0");
//		}else if(num % 2 == 0) {
//			System.out.println("0이아닌 짝수");
//		}else if(num % 2 == 1) {
//			System.out.println("홀수");
//		}
		
		// 양수, 음수, 0 출력
//		if(num > 0) {
//			System.out.println("양수");
//		}else if(num < 0 ) {
//			System.out.println("음수");
//		}else if(num == 0) {
//			System.out.println("0");
//		}
		
		
	}
	
}
