package day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;
//		System.out.println(answer);
		int cnt = 0;
		int tryCnt = 6;
		
		// while문으 up&down 게임 만들기
		
		while(true) {
			System.out.println("=====Up&Down=====시도가능횟수 : "+(tryCnt-cnt));
			System.out.print("1~31까지 숫자입력> ");
			int a = sc.nextInt();
			cnt++;
			
			if(a == answer) {
				System.out.println("[정답] 시도횟수 : "+cnt);
				break;
			}else if(cnt == tryCnt) {
				System.out.println("시도횟수 초과");
				break;
			}else if(a > answer) {
				System.out.println("down");
			}else if(a < answer) {
				System.out.println("up");
			}
			
			System.out.println();
		}
		System.out.println("Up&Down게임 종료");
		
	}

}
