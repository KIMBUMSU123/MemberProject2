package day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; // 예금주배열
		String[] account = new String[10]; // 계좌번호배열
		int[] balance = new int[10]; // 잔액배열
		int cnt = 0;
		
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("예금주> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기잔액> ");
				balance[cnt] = sc.nextInt();
				cnt++;
			}else if(menu == 2) {
				System.out.print("입금할 계좌> ");
				String inAccount = sc.next();
				System.out.print("입금할 금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(inAccount.equals(account[i])) {
						balance[i] += inMoney;
						System.out.printf("[%,d원] 입금완료", inMoney);
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("계좌없음");
				}
			}else if(menu == 3) {
				System.out.print("출금할 계좌> ");
				String outAccount = sc.next();
				System.out.print("출금할 금액> ");
				int outMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(outAccount.equals(account[i])) {
						
						if(outMoney > balance[i]) {
							System.out.println("잔액부족");
						}else {
							balance[i] -= outMoney;
							System.out.printf("[%,d원] 출금완료",outMoney);
						}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("계좌없음");
				}
					
			}else if(menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("===========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);
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










