package day09;

import java.util.Scanner;

public class 수정복습 {

	public static void main(String[] args) {
		
		// 조건문 if
		
		// if(조건문1){	// 만약 조건문1이 참이라면 실행문1 실행
		// 		실행문1
		// }else if(조건문2){		// 만약 조건문1이 참이 아니고 
		//		실행문2			// 조건문2가 참이면 실행문2 실행
		// }else {
		//		실행문3			// 모든 조건문이 거짓일 때 실행문3 실행
		// }
		
		//int a = 0;
		
		Scanner sc = new Scanner(System.in);
		// 숫자 입력 : nextInt()
		// 문자 입력 : next()
		
//		System.out.print("숫자 입력> ");
//		int a = sc.nextInt();
//		
//		if(a > 0) {
//			System.out.println("양수");
//		}else if(a < 0) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0");
//		}
		
		
		
		
		 //문자를 입력받고 "안녕"과 같으면 통과, 다르면 실패 출력!
		 //숫자 같다(==)
		 //문자 같다(equals())
		
//		System.out.print("문자 입력> ");
//		String b = sc.next();
//		String c = "안녕";
//		
//		if(b.equals("안녕")) {
//			System.out.println("통과");
//		}else {
//			System.out.println("실패");
//		}
		
		
		// String(문자열)
//		System.out.println("문자 입력> ");
//		String b = sc.next();
//		String c = "안녕";
		
		//문자를 입력받고 "안녕"과 같으면 통과, 다르면 실패 출력!
		//숫자 같다(==)
		//문자 같다(equals())
		
//		if(b.equals("안녕")) {
//			System.out.println("통과");
//		}else {
//			System.out.println("실패");
//		}
		
		
		
		
		// 로그인
		
//		String id = "test";
//		String pw = "1234";
//		
//		System.out.print("아이디 입력> ");
//		String loginId = sc.next();
//		System.out.print("비밀번호 입력> ");
//		String loginPw = sc.next();
//		
//		// 아이디, 비밀번호 일치했을 때만 로그인 성공 출력
//		
//		// &&(and) : 둘 다 true일 때 true
//		// ||(or) : 둘 중에 하나라도 true면 true
//		
//		if(id.equals(loginId) && pw.equals(loginPw)) {
//			System.out.println("로그인 성공");
//		}else if(!id.equals(loginId)) {
//			System.out.println("아이디 틀림");
//		}else if(!pw.equals(loginPw)){
//			System.out.println("비밀번호 틀림");
//		}else {
//			System.out.println("둘 다 틀림");
//		}
//		
//		if(id.equals(loginId)) {
//			if(pw.equals(loginPw)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호 틀림");
//			}
//		}
		
		
		
		
		
		
		// 반복문 for
		
		// for(초기문; 조건문; 증감문){
		//		실행문
		//}
//		int sum = 0;
//		int cnt = 0;
//		for(int i = 1; i <= 10; i++) {
			
			// i가 짝수일 때만 출력
			// % : 나눈 후 나머지
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
						
			// i가 3의 배수일 때만 출력
			//if(i % 3 == 0) {
			//	System.out.println(i);
			//}
					
			// i들의 총합
			// sum = sum + i; 
			// 0 + 1 = 1
			// 1 + 2 = 3
			// 3 + 3 = 6
			// 6 + 4 = 10
			// 10 + 5 = 15
			
			// i가 홀수인 것만 더한 총합 출력
			// == : 같다
			// != : 같지 않다.
			//if(i % 2 != 0) {
			//	sum = sum + i;
			//}
			
			// 5의 배수인 것만 cnt 증가하고 출력
//			if(i % 5 == 0) {
//				cnt++;
//			}
//			
//		}
//		System.out.println(cnt);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}