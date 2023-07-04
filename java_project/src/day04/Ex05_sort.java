package day04;

import java.util.Scanner;

public class Ex05_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====sort=====");
			System.out.print("첫번째숫자> ");
			int num1 = sc.nextInt();
			System.out.print("두번째숫자> ");
			int num2 = sc.nextInt();
			
			System.out.println("1.오름차순 2.내림차순 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(num1 > num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for(int i=num1; i<=num2; i++) {
					System.out.println(i);
				}
			}else if(menu == 2) {
				if(num1 < num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for(int i=num1; i>=num2; i--) {
					System.out.println(i);
				}
			}else if(menu == 0) {
				break;
			}
			
			System.out.println();
		}
	}

}









