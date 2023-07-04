package day08;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		
		while(true) {
			System.out.printf("=====자판기=====[%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(balance >= 1000) {
					balance -= 1000;
					System.out.println("콜라선택");	
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 2) {
				if(balance >= 1200) {
					balance -= 1200;
					System.out.println("사이다선택");	
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 3) {
				if(balance >= 1500) {
					balance -= 1500;
					System.out.println("우유선택");	
				}else {
					System.out.println("잔액부족");
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("반복종료");
		
	}

}
