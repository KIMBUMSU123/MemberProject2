package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		int fAccount = 100;
		
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				//계좌생성
				Account account = new Account();
				System.out.print("예금주> ");
				account.setName(sc.next());
				System.out.print("계좌번호> ");
				account.setAccount(sc.next());
				System.out.print("잔액> ");
				account.setBalance(sc.nextInt());
				list.add(account);
				System.out.println("계좌개설!");
			}else if(menu == 2) {
				System.out.print("입금 할 계좌번호> ");
				String inAccount = sc.next();
				System.out.print("입금 할 금액>");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for(Account a : list) {
					if(inAccount.equals(a.getAccount())) {
						a.deposit(inMoney);
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("없는계좌");
				}
			}else if(menu == 3) {
				System.out.print("출금 할 계좌> ");
				String outAccount = sc.next();
				System.out.print("출금 할 금액> ");
				int outMoney = sc.nextInt();
				
				for(Account a : list) {
					if(outAccount.equals(a.getAccount())) {
						if(a.withdraw(outMoney)) {
							System.out.println("출금성공");
						}else {
							System.out.println("잔액부족");
						}
					}
				}
			}else if(menu == 4) {
				//계좌목록 *향상된for문 사용
				System.out.println("예금주\t계좌\t잔액\t개설일");
				System.out.println("=============================");
				for(Account a : list) {
					a.print();
				}
			}else if(menu == 5) {
				System.out.print("출금계좌> ");
				String outAccount = sc.next();
				System.out.print("입금계좌> ");
				String inAccount = sc.next();
				System.out.print("이체금액> ");
				int sendMoney = sc.nextInt();
				
				int outIndex = -1;
				int inIndex = -1;
				for(int i=0; i<list.size(); i++) {
					if(outAccount.equals(list.get(i).getAccount())) {
						outIndex = i;
					}
					if(inAccount.equals(list.get(i).getAccount())) {
						inIndex = i;
					}
				}
				if(outIndex == -1) {
					System.out.println("출금계좌 없음");
				}else if(inIndex == -1) {
					System.out.println("입금계좌 없음");
				}else {
					if(list.get(outIndex).withdraw(sendMoney)) {
						list.get(inIndex).deposit(sendMoney);
						System.out.println("이체성공");
					}else {
						System.out.println("잔액부족");
					}
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

