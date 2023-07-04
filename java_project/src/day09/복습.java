package day09;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1; // 랜덤정답
		
		// 반복하면서 입력받는데 정답보다 크면 down, 정답보다 작으면 up, 정답이면 반복문종료
		while(true){
			System.out.print("숫자입력> ");
			int a = sc.nextInt();
			
			if(a > answer) {
				System.out.println("down");
			}else if(a < answer) {
				System.out.println("up");
			}else if(a == answer) {
				System.out.println("정답");
				break;
			}
			
		}
		
	}

}








