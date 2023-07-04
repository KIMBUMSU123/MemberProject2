package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		String[] product = new String[100];
		// product[0] = "우유";
		// product[1] = "사이다";
		int cnt = 0;
		
		while(true) {
			System.out.printf("=====자판기=====[%,d원]\n", balance);
			System.out.println("1.콜라 2.사이다 3.우유 4.구매목록 0.종료 ");	
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(balance >= 1000) {
					System.out.println("콜라선택");
					balance -= 1000;	
					product[cnt++] = "콜라";
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 2) {
				if(balance >= 1200) {
					System.out.println("사이다 선택");
					balance -= 1200;
					product[cnt++] = "사이다";
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 3) {
				if(balance >= 1500) {
					System.out.println("우유선택");
					balance -= 1500;
					product[cnt++] = "우유";
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 4) {
				System.out.println("구매목록\t수량");
				System.out.println("===========");
				int coke = 0;
				int soda = 0;
				int milk = 0;
				for(int i=0; i<cnt; i++) {
					if(product[i].equals("콜라")) {
						coke++;
					}else if(product[i].equals("사이다")) {
						soda++;
					}else if(product[i].equals("우유")) {
						milk++;
					}
				}
				System.out.println("콜라\t"+coke+"개");
				System.out.println("사이다\t"+soda+"개");
				System.out.println("우유\t"+milk+"개");
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		// 문제1) 반복하면서 
		// 1번 누르면 "콜라선택" 출력
		// 2번 누르면 "사이다선택" 출력
		// 3번 누르면 "우유선택" 출력
		// 0번 누르면 "반복문" 종료
		
		// 문제2) 잔액추가하기
		// 1번 누르면 1000원 차감 출력
		// 2번 누르면 1200원 차감 출력
		// 3번 누르면 1500원 차감 출력
		// 0번 누르면 "반복문" 종료
		
		// 문제3) 잔액부족 출력하기
		
	}

}









