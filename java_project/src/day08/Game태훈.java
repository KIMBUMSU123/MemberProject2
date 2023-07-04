package day08;

import java.util.Random;
import java.util.Scanner;

public class Game태훈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String[] members = new String[2];
		int[] positions = new int[4];

		for (int i = 0; i < 2; i++) {
			System.out.print("맴버 이름을 입력해주세요 : ");
			members[i] = sc.nextLine();
			positions[i] = 0;
		}

		int m = 0;
		int n = 0;
		int m2 = 0;
		int n2 = 0;
		while (true) {
			String[][] pan = new String[5][5];
			String[][] pan2 = new String[5][5];

			for (int l = 0; l < 2; l++) {
				System.out.println();
				System.out.println(members[0] + "님 차례입니다.");
				sc.nextLine();
				
				int move = random.nextInt(4) + 1;
				System.out.println("" + move + "이동");
				System.out.println();
				n += move;
				if (n >= 5) {
					n -= 5;
					m++;
					if (m == 5) {
						System.out.println("도착!!!!!!!\n" + members[0] + "님 승!!!!!");
						break;
					}
				}
				System.out.println(members[0] + "님이 " + move + "만큼 움직였습니다.");
				System.out.println();
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						pan[m][n] = "x";
						pan[i][j] = "O";
						pan[0][0]= "=>";
						pan[4][4]= "도착";
					}
				}

				// 이중 배열 출력
				System.out.println(members[0] + "플레이어===============================");
				for (int k = 0; k < 5; k++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(pan[k][j] + "\t");
					}
					System.out.println();
				}
				System.out.println("======================================");
				System.out.println();
				System.out.println(members[1] + "님 차례입니다.");
				sc.nextLine();
				int move2 = random.nextInt(4) + 1;
				System.out.println("" + move2 + "이동");
				System.out.println();

				n2 += move2;
				if (n2 >= 5) {
					n2 -= 5;
					m2++;
					if (m2 == 5) {
						System.out.println("도착!!!!!!!\n" + members[1] + "님 승!!!!!");
						break;
					}
				}

				System.out.println(members[1] + "님이 " + move2 + "만큼 움직였습니다.");
				System.out.println();
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						pan2[m2][n2] = "x";
						pan2[i][j] = "O";
						pan2[0][0]= "=>";
						pan2[4][4]= "도착";
					}
				}

				System.out.println(members[1] + "플레이어============================");
				for (int k = 0; k < 5; k++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(pan2[k][j] + "\t");
					}
					System.out.println();
				}
				System.out.println("======================================");

			}
		}
	}

}