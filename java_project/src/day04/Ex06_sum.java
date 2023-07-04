package day04;

import java.util.Scanner;

public class Ex06_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====sum=====");
			System.out.print("첫번째수입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째수입력> ");
			int num2 = sc.nextInt();
			
			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
			System.out.print("입력> ");
			int menu = sc.nextInt();
			int sum = 0;
			if(menu == 1) {
				for(int i=num1; i<=num2; i++) {
					sum += i;
				}
			}else if(menu == 2) {
				for(int i=num1; i<num2; i++) {
					if(i % 2 == 0) {
						sum += i;
					}
				}
			}else if(menu == 3) {
				for(int i=num1; i<num2; i++) {
					if(i % 2 != 0) {
						sum += i;
					}
				}
			}else if(menu == 0) {
				break;
			}
			System.out.println(sum);
			System.out.println();
		}
	}

}














