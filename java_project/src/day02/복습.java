package day02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 숫자를 입력받고, 양수, 음수, 0 출력하시오
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		
//		if(a > 0) {
//			System.out.println("양수");
//		}
//		if(a < 0) {
//			System.out.println("음수");
//		}
//		if(a == 0) {
//			System.out.println("0입니다");
//		}
		
		// score 90이상 A
		// 		80이상 B
		//		70이상 C
		// 		60이상 D
		// 		60미만 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력> ");
//		int score = sc.nextInt();
		
		// 숫자하나를 입력받고, 0이아닌 짝수, 홀수, 0
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		
//		// + - * / %
//		if(num == 0) {
//			System.out.println("0");
//		}else if(num % 2 == 0) {
//			System.out.println("0이 아닌 짝수");
//		}else if(num % 2 == 1) {
//			System.out.println("홀수");
//		}
		
		// 숫자를 하나 입력받아, 3의배수, 5의배수, 3과5의배수, 둘다아님 출력
		// 출력예시) 숫자입력> 15 => 3과5의배수
		// 출력예시) 숫자입력> 20 => 5의배수
		// 출력예시) 숫자입력> 7 => 둘다아님
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		
//		if(a % 15 == 0) {
//			System.out.println("3과5의배수");
//		}else if(a % 5 == 0) {
//			System.out.println("5의배수");
//		}else if(a % 3 == 0) {
//			System.out.println("3의배수");
//		}else {
//			System.out.println("둘다아님");
//		}
		
		// 계산기프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자입력> ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴선택> ");
//		int menu = sc.nextInt();
//		
//		if(menu == 1) {
//			System.out.println(num1 +" + "+ num2 +" = "+ (num1 + num2));
//		}else if(menu == 2) {
//			System.out.println(num1 +" - "+ num2 +" = "+ (num1 - num2));
//		}else if(menu == 3) {
//			System.out.println(num1 +" * "+ num2 +" = "+ (num1 * num2));
//		}else if(menu == 4) {
//			System.out.println(num1 +" / "+ num2 +" = "+ (num1 / (double)num2));
//		}else if(menu == 5) {
//			System.out.println(num1 +" % "+ num2 +" = "+ (num1 % num2));
//		}else {
//			System.out.println("1~5까지 입력해 주세요");
//		}
		
		// 로그인 프로그램
		String id = "aa";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디입력> ");
		String loginId = sc.next();
		System.out.print("비밀번호입력> ");
		String loginPw = sc.next();
		
		// 아이디가 틀렸습니다, 비밀번호가 틀렸습니다, 로그인 성공
		if(loginId.equals(id)) {
			if(loginPw.equals(pw)) {
				System.out.println("로그인성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("아이디가 틀렸습니다");
		}
		
		if(loginId.equals(id) && loginPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else if(!loginId.equals(id)) {
			System.out.println("아이디가 틀렸습니다");
		}else if(!loginPw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다");
		}
		
		// loginId == id	=>	loginId.eqauls(id)
		// loginId != id	=> 	!loginId.eqauls(id)
		
		
	}

}











