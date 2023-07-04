package day08;

import java.util.Scanner;
import java.util.Random;
public class Game승용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자야구
		
		Scanner sc = new Scanner(System.in);

		int count = 3; 
		int num[] = new int[count];
		Random r = new Random();
		
		// 1~9까지의 중복없이 난수 생성 
		for(int i=0; i<count; i++){
			num[i] = r.nextInt(9) + 1; 
			for(int j=0; j<i; j++){
				if(num[i] == num[j]){
					i--;
				}
			}
		}
		// 정답 부분 주석처리할 예정
//		for(int i=0; i<count; i++){// 정답 부분 주석처리할 예정
//			System.out.print(num[i]);// 정답 부분 주석처리할 예정
//		}// 정답 부분 주석처리할 예정
//		System.out.println();// 정답 부분 주석처리할 예정
		
		
		while(true) {
			int s=0; // 스트라이크 수 초기화
			int b=0; // 볼 수 초기화
			int o=0; // 아웃 수 초기화
			
			// 숫자를 3번 입력
			System.out.print("1번 숫자입력 : ");
			int num1 = sc.nextInt();
			System.out.print("2번 숫자입력 : ");
			int num2 = sc.nextInt();
			System.out.print("3번 숫자입력 : ");
			int num3 = sc.nextInt();
			
			// 3개다 숫자와 순서가 맞으면 게임 끝
			if(num1 == num[0] && num2 == num[1] && num3 == num[2]) {
				System.out.println("성공");
				break;
			}
			// 첫번째 숫자가 첫번째 0번 인덱스 배열과 맞으면 스트라이크 +1
			if(num1 == num[0]) {
				s++;
			} // 첫번째 숫자가 1번 인덱스 배열이나 2번 인덱스 배열과 맞으면 볼 +1
			else if(num1 == num[1] || num1 == num[2]) {
				b++;
			} // 첫번째 숫자가 맞는 배열에 없으면 아웃+1
			else {
				o++;
			}// 두번째 숫자가 1번 인덱스 배열과 맞으면 스트라이크 +1
			if(num2 == num[1]) {
				s++;
			}// 두번째 숫자가 0번 인덱스 배열이나 2번 인덱스 배열과 맞으면 볼 +1
			else if(num2 == num[0] || num2 == num[2]) {
				b++;
			} // 두번째 숫자가 맞는 배열에 없으면 아웃+1
			else {
				o++;
			}// 세번째 숫자가 2번 인덱스 배열과 맞으면 스트라이크 +1
			if(num3 == num[2]) {
				s++;
			}// 세번째 숫자가 1번 인덱스 배열이나 0번 인덱스 배열과 맞으면 볼 +1
			else if(num3 == num[1] || num3 == num[0]) {
				b++;
			}// 세번째 숫자가 맞는 배열에 없으면 아웃+1
			else {
				o++;
			}
			
			System.out.println("===============");
			System.out.println(s+" 스트라이크");
			System.out.println(b+" 볼");
			System.out.println(o+"아웃");
			System.out.println("===============");
		}
	}
}