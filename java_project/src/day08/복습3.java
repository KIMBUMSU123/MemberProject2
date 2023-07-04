package day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				// 예금주, 계좌번호, 초기잔액 입력받아 각각 배열에 0번째 방부터 넣기
				System.out.print("예금주> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기잔액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt]+"님 계좌생성!");
				cnt++;
			}else if(menu == 2) {
				// 입금할 계좌번호, 입금금액 입력받고 입금할 계좌를 account배열에서 반복하면서 찾아 입금
				System.out.print("입금할 계좌> ");
				String inAccount = sc.next();
				System.out.print("입금금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(inAccount.equals(account[i])) {
						find = true;
						balance[i] += inMoney;
						System.out.println("입금성공");
						break;
					}
				}
				if(!find) {
					System.out.println("존재하지 않는 계좌번호 입니다");
				}
				
			}else if(menu == 3) {
				// 출금할 계좌번호, 출금금액 입력받고 출금할 계좌를 account배열에서 반복하면서 찾아 출금
				// 잔액부족 표시
				System.out.print("출금할 계좌번호> ");
				String outAccount = sc.next();
				System.out.print("출금할 금액>");
				int outMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(outAccount.equals(account[i])) {
						find = true;
						if(balance[i] >= outMoney) {
							balance[i] -= outMoney;
							System.out.println("출금성공!");
						}else {
							System.out.println("잔액부족");
						}
					}
				}
				
				if(!find) {
					System.out.println("존재하지 않는 계좌번호입니다");
				}
			}else if(menu == 4) {
				// name배열, account배열, balance배열의 모든 값을 0번째 방부터 출력
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i],account[i],balance[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}













