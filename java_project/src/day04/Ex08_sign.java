package day04;

import java.util.Scanner;

public class Ex08_sign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";
		String pw = "";
		boolean login = false;
		
		while(true) {
			System.out.println("=====회원가입=====");
			if(login) {
				System.out.println("1.회원정보("+name+"님) 2.로그아웃 0.종료");
			}else {
				System.out.println("1.회원가입 2.로그인 0.종료");
			}
			
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(login) {
					System.out.println("이름 : "+name);
					System.out.println("아이디 : "+id);
					System.out.println("비밀번호 : "+pw);
				}else {
					System.out.print("이름> ");
					name = sc.next();
					System.out.print("아이디> ");
					id = sc.next();
					System.out.print("비밀번호> ");
					pw = sc.next();
					System.out.println(name+"님 회원가입을 축하드립니다");
				}
			}else if(menu == 2) {
				if(login) {
					login = false;
					System.out.println(name+"님 로그아웃 되었습니다");
				}else {
					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 비밀번호> ");
					String loginPw = sc.next();
					
					if(loginId.equals(id) && loginPw.equals(pw)) {
						System.out.println("로그인 성공");
						login = true;
					}else {
						System.out.println("로그인 실패");
					}
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~3까지 입력가능");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}











