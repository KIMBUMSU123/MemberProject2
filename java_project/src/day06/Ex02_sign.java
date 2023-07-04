package day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 이름, 아이디, 비밀번호
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] date = new String[10];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		int cnt = 0;
		
		while(true) {
			System.out.println("=====마켓커리=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름> ");
				name[cnt] = sc.next();
				System.out.print("아이디> ");
				String signId = sc.next();
				boolean a = false;
				for(int i=0; i<cnt; i++) {
					if(signId.equals(id[i])) {
						a = true;
						break;
					}
				}
				if(a) {
					System.out.println("중복된 아이디 입니다");
					continue;
				}else {
					id[cnt] = signId;
				}
				System.out.print("비밀번호> ");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now(); // 현재날짜시간 구하는 문법
				date[cnt] = dtf.format(now);
				cnt++;
			}else if(menu == 2) {
				System.out.print("로그인할 아이디> ");
				String loginId = sc.next();
				System.out.print("로그인할 비밀번호> ");
				String loginPw = sc.next();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(loginId.equals(id[i])) {
						if(loginPw.equals(pw[i])) {
							System.out.println("로그인성공");
							break;
						}else {
							System.out.println("비밀번호가 틀렸습니다");
						}
						find = true;
					}
				}
				
				if(!find) {
					System.out.println("아이디가 틀렸습니다");
				}
				
			}else if(menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("==================================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
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









