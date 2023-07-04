package day03;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000; // 잔액
		
		while(run) {
			System.out.println("=====자판기===== 잔액 : "+balance+"원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(balance >= 1000) {
					System.out.println("콜라선택");
					balance = balance - 1000; // balance -= 1000	
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 2:
				if(balance >= 1200) {
					System.out.println("사이다선택");
					balance = balance - 1200;
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 3:
				if(balance >= 1500) {
					System.out.println("우유선택");
					balance = balance - 1500;
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 4:
				System.out.print("충전할 금액> ");
				int inputMoney = sc.nextInt();
				balance = balance + inputMoney;
//				balance += inputMoney;
				break;
			case 0:
				run = false;
				break;
				default:
					System.out.println("0~3까지 입력가능");
			}
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}
