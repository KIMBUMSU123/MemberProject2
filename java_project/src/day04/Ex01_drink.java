package day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.printf("=====자판기=====\n");
			System.out.println("1.콜라 2.사이다 3.우유 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			// 콜라선택 or 사이다선택 or 우유선택 or 반복문종료시키기
			if(menu == 1) {
				System.out.println("콜라선택");
			}else if(menu == 2) {
				System.out.println("사이다선택");
			}else if(menu == 3) {
				System.out.println("우유선택");
			}else if(menu == 0) {
				run = false;
			}else {
				System.out.println("다시선택");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
