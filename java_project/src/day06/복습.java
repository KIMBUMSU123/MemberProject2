package day06;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아 "아이디가 틑렸습니다", "비밀번호가 틀렸습니다", "로그인 성공" 출력 
//		Scanner sc = new Scanner(System.in);
//		String id = "test"; // 회원가입한아이디
//		String pw = "1234"; // 회원가입한비밀번호
//		
//		System.out.print("아이디입력> ");
//		String a = sc.next();
//		System.out.print("비밀번호입력> ");
//		String b = sc.next();
//		
//		if(a.equals(id)) {
//			if(b.equals(pw)) {
//				System.out.println("로그인성공");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다");
//			}
//		}else {
//			System.out.println("아이디가 틀렸습니다");
//		}
		
		// 1~100까지의 합출력 *for문 사용
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// dan변수를 사용하여 19단까지 출력
		int dan = 5;
		for(int i=1; i<20; i++) {
			System.out.println(dan +" * "+ i +" = " + (dan*i));
		}
		
		// 5 * 1 = 5
		// ...
		// 5 * 19 = 95;
		
	}

}






