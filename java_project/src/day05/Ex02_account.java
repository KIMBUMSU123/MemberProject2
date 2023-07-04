package day05;

import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("예금주> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("잔액> ");
				balance[cnt] = sc.nextInt();
				cnt++;
			}else if(menu == 2) {
				// 입금할 계좌 * 없는계좌입니다
				// 입금 금액
				System.out.print("입금할 계좌> ");
				String inAccount = sc.next();
				System.out.print("입금할 금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(inAccount.equals(account[i])) {
						balance[i] += inMoney;
						System.out.printf("%,d원 입금완료",inMoney);
						find = true;
						break;
					}
				}
				if(find == false) {
					System.out.println("없는 계좌번호입니다");
				}
				
			}else if(menu == 3) {
				// 출금할 계좌 * 없는계좌입니다
				// 출금 금액 *잔액부족 표시
			}else if(menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("=========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i],account[i],balance[i]);
				}
				// 홍길동 	1111	1000
				// 이순신		2222	2000
				// 심청이		3333 	6520
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~4까지 입력가능합니다");
			}
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}













