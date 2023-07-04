package day08;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] 판 = new int[10][10];
		String[][] 돌 = new String[100][3];
		int cnt = 0;
		int turn = 0;
		
		System.out.println("■□오목게임■□");
		for(int i=0; i<10; i++) {
			if(i == 0) {
				System.out.print("   ");
				for(int j=0; j<10; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.print(i+" ━");
			for(int j=0; j<10; j++) {
				System.out.print("┿━");
			}
			System.out.println("");
		}
		
		while(true) {
			System.out.print("돌위치 위치(x y)> ");
			돌[cnt][0] = sc.next();
			돌[cnt][1] = sc.next();
			// 중복체크
			boolean overlap = false;
			for(int i=0; i<cnt; i++) {
				if(돌[cnt][0].equals(돌[i][0]) && 돌[cnt][1].equals(돌[i][1])) {
					overlap = true;
					break;
				}
			}
			if(overlap) {
				System.out.println("중복된 위치입니다!");
				System.out.println();
				continue;
			}
			if(turn++ % 2 == 0) {
				돌[cnt][2] = "흑"; 
			}else {
				돌[cnt][2] = "백";
			}
			cnt++;
			System.out.println("\n■□오목게임■□");
			for(int i=0; i<10; i++) {
				if(i == 0) {
					System.out.print("   ");
					for(int j=0; j<10; j++) {
						System.out.print(j+" ");
					}
					System.out.println();
				}
				System.out.print(i+" ━");
				for(int j=0; j<10; j++) {
					String find = null;
					for(int s=0; s<100; s++) {
						if(돌[s][0] != null && 돌[s][1] != null &&
								돌[s][0].equals(i+"") && 돌[s][1].equals(j+"")) {
							if(돌[s][2].equals("흑")) {
								find = "흑";
							}else {
								find = "백";
							}
							break;
						}
					}
					if(find == null) {
						System.out.print("┿━");
					}else if(find.equals("흑")) {
						System.out.print("●━");
					}else if(find.equals("백")) {
						System.out.print ("○━");
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
