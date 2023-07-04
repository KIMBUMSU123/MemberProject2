package day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; // 회원가입 이름 배열
		String[] id = new String[10]; // 회원가입 아이디 배열
		String[] pw = new String[10]; // 회원가입 비밀번호 배열
		String[] date = new String[10]; // 회원가입 날짜 배열
		int[] balance = new int[10]; // 회원 충전한 돈
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		int cnt = 0;
		boolean login = false;
		int loginIndex = -1;
		
		while(true) {
			System.out.print("=====마켓커리=====");
			if(login) {
				System.out.println("▶▷"+name[loginIndex]+"님◀◁");
				System.out.println("1.물품구매 2.로그아웃 3.회원정보 0.종료");
			}else {
				System.out.println("\n1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			
			
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(login) {
					System.out.println();
					// 물품구매
					while(true) {
						System.out.printf("=====마켓커리 물품구매=====[%,d원]\n",balance[loginIndex]);
						System.out.println("1.짜장면(3,000) 2.짬뽕(3,500) 3.탕수육(8,000) 4.충전 0.나가기");
						System.out.print("선택> ");
						int menu2 = sc.nextInt();
						
						if(menu2 == 1) {
							if(balance[loginIndex] >= 3000) {
								System.out.println("짜장면구매!");
								balance[loginIndex] -= 3000;
							}else {
								System.out.println("잔액부족");
							}
						}else if(menu2 == 2) {
							if(balance[loginIndex] >= 3500) {
								System.out.println("짬뽕구매!");
								balance[loginIndex] -= 3500;
							}else {
								System.out.println("잔액부족");
							}
						}else if(menu2 == 3) {
							if(balance[loginIndex] >= 8000) {
								System.out.println("탕수육구매!");
								balance[loginIndex] -= 8000;
							}else {
								System.out.println("잔액부족");
							}
						}else if(menu2 == 4) {
							System.out.print("충전할 금액> ");
							balance[loginIndex] = sc.nextInt();
							System.out.println("충전되었습니다");
						}else if(menu2 == 0) {
							break;
						}
						
						System.out.println();
					}
				}else {
					System.out.print("이름입력> ");
					name[cnt] = sc.next();
					System.out.print("아이디입력> ");
					id[cnt] = sc.next();
					System.out.print("비밀번호입력> ");
					pw[cnt] = sc.next();
					LocalDateTime now = LocalDateTime.now(); // 현재날짜
					date[cnt] = dtf.format(now); // 현재날짜 포맷해서 입력
					System.out.println(name[cnt]+"님 회원가입을 축하드립니다");
					cnt++;
				}
			}else if(menu == 2) {
				if(login) {
					// 로그아웃
					login = false;
					System.out.println(name[loginIndex]+"님 로그아웃 되었습니다");
					loginIndex = -1;
				}else {
					System.out.print("아이디입력> ");
					String loginId = sc.next();
					System.out.print("비밀번호입력> ");
					String loginPw= sc.next();
					boolean find = false;
					
					for(int i=0; i<cnt; i++) {
						if(loginId.equals(id[i])){
							find = true;
							if(loginPw.equals(pw[i])) {
								System.out.println(name[i]+"님 반갑습니다");
								login = true;
								loginIndex = i;
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다");
								break;
							}
						}
					}
					
					if(!find) {
						System.out.println("아이디가 틀렸습니다");
					}
				}
				
			}else if(menu == 3) {
				if(login) {
					// 회원정보
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("===========================================");
					System.out.printf("%s\t%s\t%s\t%s\n", name[loginIndex], id[loginIndex], pw[loginIndex], date[loginIndex]);
				}else {
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("===========================================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
					}
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("마켓커리 종료");
		
	}

}













