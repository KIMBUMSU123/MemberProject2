package day08;

import java.util.Scanner;

public class Game태양 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("틱택톡게임");
		String[][] table = new String[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				table[i][j] = " ";
			}
		}
		int playnum = 0;
		while(true) {
			System.out.println("======");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if( j != 2) {
						System.out.print(table[i][j]+ "|");
					} else {
						System.out.print(table[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println("======");
			System.out.print("x좌표: ");
			int x = sc.nextInt() - 1;
			System.out.print("y좌표: ");
			int y = sc.nextInt() - 1;
			if(x < 0 || x >= 3 || y < 0 || y >= 3) {
				System.out.println("좌표는 1~3까지 입력가능");
			}else {
				if(playnum == 0) {
					if(table[x][y].equals(" ")) {
						table[x][y] = "O";
						boolean w = true;
						boolean h = true;
						boolean c1 = true;
						boolean c2 = true;
						for(int i = 0; i < 3; i++) {
							if(!(table[x][i].equals("O"))) {
								w = false;
							}
							if(!(table[i][y].equals("O"))) {
								h = false;
							}
							if(!(table[i][i].equals("O"))) {
								c1 = false;
							}
							if(!(table[2 - i][i].equals("O"))) {
								c2 = false;
							}
						}
						if(w || h || c1 || c2) {
							System.out.println("======");
							for(int i = 0; i < 3; i++) {
								for(int j = 0; j < 3; j++) {
									if( j != 2) {
										System.out.print(table[i][j]+ "|");
									} else {
										System.out.print(table[i][j]);
									}
								}
								System.out.println();
							}
							System.out.println("======");
							System.out.println("1번 플레이어 win");
							break;
						} else {
							playnum = 1;
						}
					}else {
						System.out.println("빈 곳을 입력해 주세요");
					}
				}else{
					if(table[x][y].equals(" ")) {
						table[x][y] = "X";
						boolean w = true;
						boolean h = true;
						boolean c1 = true;
						boolean c2 = true;
						for(int i = 0; i < 3; i++) {
							if(!(table[x][i].equals("X"))) {
								w = false;
							}
							if(!(table[i][y].equals("X"))) {
								h = false;
							}
							if(!(table[i][i].equals("X"))) {
								c1 = false;
							}
							if(!(table[2 - i][i].equals("X"))) {
								c2 = false;
							}
						}
						if(w || h || c1 || c2) {
							System.out.println("======");
							for(int i = 0; i < 3; i++) {
								for(int j = 0; j < 3; j++) {
									if( j != 2) {
										System.out.print(table[i][j]+ "|");
									} else {
										System.out.print(table[i][j]);
									}
								}
								System.out.println();
							}
							System.out.println("======");
							System.out.println("2번 플레이어 win");
							break;
						} else {
							playnum = 0;
						}
					}else {
						System.out.println("빈 곳을 입력해 주세요");
					}
				}
			}
			int cnt = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(!(table[i][j].equals(" "))) {
						cnt++;
					}
				}
			}
			if(cnt == 9) {
				System.out.println("======");
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if( j != 2) {
							System.out.print(table[i][j]+ "|");
						} else {
							System.out.print(table[i][j]);
						}
					}
					System.out.println();
				}
				System.out.println("======");
				System.out.println("무승부");
				break;
			}
		}
	}

}