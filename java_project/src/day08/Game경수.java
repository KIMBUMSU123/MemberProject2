package day08;

import java.util.Scanner;

public class Game경수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] jo = new String[100];
		String[] str = new String[100];
		int ty = (int)(Math.random()*15)+3;
		System.out.println(ty);
		int cnt = 1;
		
		System.out.println("===========끝말잇기=============");
		System.out.print("시작단어 > ");
		String answer = sc.next();
		str[0] = answer;
		jo[0] = answer.substring(answer.length()-1,answer.length());

		while (true) {
			answer = sc.next();
			 
			for (int i = 0; i<100; i++) {
				if (answer.equals(str[i])) {
					System.out.println("삐빅!!!!! 중복입니다.");
					break;
				}
			}
			
			if (answer.substring(0,1).equals(jo[cnt-1])) {
				jo[cnt] = answer.substring(answer.length()-1,answer.length());
				str[cnt] = answer;
				cnt ++;
			}else {
				System.out.println("틀렸습니다.");
				break;
			}
			
			if (ty+1 == cnt) {
				System.out.println("당첨(상품 = 탈락)");
				break;
			}
		}
	}

}