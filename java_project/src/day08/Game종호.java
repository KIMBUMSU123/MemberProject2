package day08;

import java.util.Scanner;

public class Game종호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오목
		// 19x19
//		  
//	?	1 ┏┯ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬ ┬
//?		2 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿ 
//?		3 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		4 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		5 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		6 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		7 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		8 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		9 ┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		10┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		11┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		12┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		13┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		14┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		15┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		16┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		17┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		18┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿
//		19┣┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿━┿

		// 가로

		String[] ver01 = { "┏", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯", "┯",
				"┯" };
		String[] ver02 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver03 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver04 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver05 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver06 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver07 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver08 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver09 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver10 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver11 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver12 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver13 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver14 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver15 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver16 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver17 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver18 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };
		String[] ver19 = { "┣", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿", "┿",
				"┿" };

		for (int i = 0; i < 19; i++) {
			System.out.print(ver01[i]);

		}
		System.out.println();

		for (int i = 0; i < 19; i++) {
			System.out.print(ver02[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver03[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver04[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver05[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver06[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver07[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver08[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver09[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver10[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver11[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver12[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver13[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver14[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver15[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver16[i]);

		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver17[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver18[i]);
		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
			System.out.print(ver19[i]);
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 백 돌 차례
			System.out.println();
			System.out.println("○ 백 돌 차례 ○");
			System.out.print("○돌 놓을 자리(가로) > ");
			int horWhite = sc.nextInt();
			System.out.print("○돌 놓을 자리(세로) > ");
			int verWhite = sc.nextInt();

//			if (horWhite == 1) {
//				for (int i = 0; i < 19; i++) {
//					if (verWhite == i) {
//						ver01[i] = "○";

//					}
//				}
//			}
			if (horWhite == 1) {
				if (verWhite == 1) {
					ver01[1] = "○";
				} else if (verWhite == 2) {
					ver01[2] = "○";
				} else if (verWhite == 3) {
					ver01[3] = "○";
				} else if (verWhite == 4) {
					ver01[4] = "○";
				} else if (verWhite == 5) {
					ver01[5] = "○";
				} else if (verWhite == 6) {
					ver01[6] = "○";
				} else if (verWhite == 7) {
					ver01[7] = "○";
				} else if (verWhite == 8) {
					ver01[8] = "○";
				} else if (verWhite == 9) {
					ver01[9] = "○";
				} else if (verWhite == 10) {
					ver01[10] = "○";
				} else if (verWhite == 11) {
					ver01[11] = "○";
				} else if (verWhite == 12) {
					ver01[12] = "○";
				} else if (verWhite == 13) {
					ver01[13] = "○";
				} else if (verWhite == 14) {
					ver01[14] = "○";
				} else if (verWhite == 15) {
					ver01[15] = "○";
				} else if (verWhite == 16) {
					ver01[16] = "○";
				} else if (verWhite == 17) {
					ver01[17] = "○";
				} else if (verWhite == 18) {
					ver01[18] = "○";
				} else if (verWhite == 19) {
					ver01[19] = "○";
				}

			} else if (horWhite == 2) {
				if (verWhite == 1) {
					ver02[1] = "○";
				} else if (verWhite == 2) {
					ver02[2] = "○";
				} else if (verWhite == 3) {
					ver02[3] = "○";
				} else if (verWhite == 4) {
					ver02[4] = "○";
				} else if (verWhite == 5) {
					ver02[5] = "○";
				} else if (verWhite == 6) {
					ver02[6] = "○";
				} else if (verWhite == 7) {
					ver02[7] = "○";
				} else if (verWhite == 8) {
					ver02[8] = "○";
				} else if (verWhite == 9) {
					ver02[9] = "○";
				} else if (verWhite == 10) {
					ver02[10] = "○";
				} else if (verWhite == 11) {
					ver02[11] = "○";
				} else if (verWhite == 12) {
					ver02[12] = "○";
				} else if (verWhite == 13) {
					ver02[13] = "○";
				} else if (verWhite == 14) {
					ver02[14] = "○";
				} else if (verWhite == 15) {
					ver02[15] = "○";
				} else if (verWhite == 16) {
					ver02[16] = "○";
				} else if (verWhite == 17) {
					ver02[17] = "○";
				} else if (verWhite == 18) {
					ver02[18] = "○";
				} else if (verWhite == 19) {
					ver02[19] = "○";
				}
			} else if (horWhite == 3) {
				if (verWhite == 1) {
					ver03[1] = "○";
				} else if (verWhite == 2) {
					ver03[2] = "○";
				} else if (verWhite == 3) {
					ver03[3] = "○";
				} else if (verWhite == 4) {
					ver03[4] = "○";
				} else if (verWhite == 5) {
					ver03[5] = "○";
				} else if (verWhite == 6) {
					ver03[6] = "○";
				} else if (verWhite == 7) {
					ver03[7] = "○";
				} else if (verWhite == 8) {
					ver03[8] = "○";
				} else if (verWhite == 9) {
					ver03[9] = "○";
				} else if (verWhite == 10) {
					ver03[10] = "○";
				} else if (verWhite == 11) {
					ver03[11] = "○";
				} else if (verWhite == 12) {
					ver03[12] = "○";
				} else if (verWhite == 13) {
					ver03[13] = "○";
				} else if (verWhite == 14) {
					ver03[14] = "○";
				} else if (verWhite == 15) {
					ver03[15] = "○";
				} else if (verWhite == 16) {
					ver03[16] = "○";
				} else if (verWhite == 17) {
					ver03[17] = "○";
				} else if (verWhite == 18) {
					ver03[18] = "○";
				} else if (verWhite == 19) {
					ver03[19] = "○";
				}
			} else if (horWhite == 4) {
				if (verWhite == 1) {
					ver04[1] = "○";
				} else if (verWhite == 2) {
					ver04[2] = "○";
				} else if (verWhite == 3) {
					ver04[3] = "○";
				} else if (verWhite == 4) {
					ver04[4] = "○";
				} else if (verWhite == 5) {
					ver04[5] = "○";
				} else if (verWhite == 6) {
					ver04[6] = "○";
				} else if (verWhite == 7) {
					ver04[7] = "○";
				} else if (verWhite == 8) {
					ver04[8] = "○";
				} else if (verWhite == 9) {
					ver04[9] = "○";
				} else if (verWhite == 10) {
					ver04[10] = "○";
				} else if (verWhite == 11) {
					ver04[11] = "○";
				} else if (verWhite == 12) {
					ver04[12] = "○";
				} else if (verWhite == 13) {
					ver04[13] = "○";
				} else if (verWhite == 14) {
					ver04[14] = "○";
				} else if (verWhite == 15) {
					ver04[15] = "○";
				} else if (verWhite == 16) {
					ver04[16] = "○";
				} else if (verWhite == 17) {
					ver04[17] = "○";
				} else if (verWhite == 18) {
					ver04[18] = "○";
				} else if (verWhite == 19) {
					ver04[19] = "○";
				}
			} else if (horWhite == 5) {
				if (verWhite == 1) {
					ver05[1] = "○";
				} else if (verWhite == 2) {
					ver05[2] = "○";
				} else if (verWhite == 3) {
					ver05[3] = "○";
				} else if (verWhite == 4) {
					ver05[4] = "○";
				} else if (verWhite == 5) {
					ver05[5] = "○";
				} else if (verWhite == 6) {
					ver05[6] = "○";
				} else if (verWhite == 7) {
					ver05[7] = "○";
				} else if (verWhite == 8) {
					ver05[8] = "○";
				} else if (verWhite == 9) {
					ver05[9] = "○";
				} else if (verWhite == 10) {
					ver05[10] = "○";
				} else if (verWhite == 11) {
					ver05[11] = "○";
				} else if (verWhite == 12) {
					ver05[12] = "○";
				} else if (verWhite == 13) {
					ver05[13] = "○";
				} else if (verWhite == 14) {
					ver05[14] = "○";
				} else if (verWhite == 15) {
					ver05[15] = "○";
				} else if (verWhite == 16) {
					ver05[16] = "○";
				} else if (verWhite == 17) {
					ver05[17] = "○";
				} else if (verWhite == 18) {
					ver05[18] = "○";
				} else if (verWhite == 19) {
					ver05[19] = "○";
				}
			} else if (horWhite == 6) {

			} else if (horWhite == 7) {

			} else if (horWhite == 8) {

			} else if (horWhite == 9) {

			} else if (horWhite == 10) {

			} else if (horWhite == 11) {

			} else if (horWhite == 12) {

			} else if (horWhite == 13) {

			} else if (horWhite == 14) {

			} else if (horWhite == 15) {

			} else if (horWhite == 16) {

			} else if (horWhite == 17) {

			} else if (horWhite == 18) {

			} else if (horWhite == 19) {

			}

			for (int i = 0; i < 19; i++) {
				System.out.print(ver01[i]);

			}
			System.out.println();

			for (int i = 0; i < 19; i++) {
				System.out.print(ver02[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver03[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver04[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver05[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver06[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver07[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver08[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver09[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver10[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver11[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver12[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver13[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver14[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver15[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver16[i]);

			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver17[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver18[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver19[i]);
			}
			System.out.println();

			System.out.println("● 흑 돌 차례 ●");
			System.out.print("돌 놓을 자리(세로) > ");
			int verBlack = sc.nextInt();
			System.out.print("돌 놓을 자리(가로) > \n");
			int horBlack = sc.nextInt();

			if (horBlack == 1) {
				if (verBlack == 1) {
					ver01[1] = "●";
				} else if (verBlack == 2) {
					ver01[2] = "●";
				} else if (verBlack == 3) {
					ver01[3] = "●";
				} else if (verBlack == 4) {
					ver01[4] = "●";
				} else if (verBlack == 5) {
					ver01[5] = "●";
				} else if (verBlack == 6) {
					ver01[6] = "●";
				} else if (verBlack == 7) {
					ver01[7] = "●";
				} else if (verBlack == 8) {
					ver01[8] = "●";
				} else if (verBlack == 9) {
					ver01[9] = "●";
				} else if (verBlack == 10) {
					ver01[10] = "●";
				} else if (verBlack == 11) {
					ver01[11] = "●";
				} else if (verBlack == 12) {
					ver01[12] = "●";
				} else if (verBlack == 13) {
					ver01[13] = "●";
				} else if (verBlack == 14) {
					ver01[14] = "●";
				} else if (verBlack == 15) {
					ver01[15] = "●";
				} else if (verBlack == 16) {
					ver01[16] = "●";
				} else if (verBlack == 17) {
					ver01[17] = "●";
				} else if (verBlack == 18) {
					ver01[18] = "●";
				} else if (verBlack == 19) {
					ver01[19] = "●";
				}

			} else if (horBlack == 2) {
				if (verBlack == 1) {
					ver02[1] = "●";
				} else if (verBlack == 2) {
					ver02[2] = "●";
				} else if (verBlack == 3) {
					ver02[3] = "●";
				} else if (verBlack == 4) {
					ver02[4] = "●";
				} else if (verBlack == 5) {
					ver02[5] = "●";
				} else if (verBlack == 6) {
					ver02[6] = "●";
				} else if (verBlack == 7) {
					ver02[7] = "●";
				} else if (verBlack == 8) {
					ver02[8] = "●";
				} else if (verBlack == 9) {
					ver02[9] = "●";
				} else if (verBlack == 10) {
					ver02[10] = "●";
				} else if (verBlack == 11) {
					ver02[11] = "●";
				} else if (verBlack == 12) {
					ver02[12] = "●";
				} else if (verBlack == 13) {
					ver02[13] = "●";
				} else if (verBlack == 14) {
					ver02[14] = "●";
				} else if (verBlack == 15) {
					ver02[15] = "●";
				} else if (verBlack == 16) {
					ver02[16] = "●";
				} else if (verBlack == 17) {
					ver02[17] = "●";
				} else if (verBlack == 18) {
					ver02[18] = "●";
				} else if (verBlack == 19) {
					ver02[19] = "●";
				}
			} else if (horBlack == 3) {
				if (verBlack == 1) {
					ver03[1] = "●";
				} else if (verBlack == 2) {
					ver03[2] = "●";
				} else if (verBlack == 3) {
					ver03[3] = "●";
				} else if (verBlack == 4) {
					ver03[4] = "●";
				} else if (verBlack == 5) {
					ver03[5] = "●";
				} else if (verBlack == 6) {
					ver03[6] = "●";
				} else if (verBlack == 7) {
					ver03[7] = "●";
				} else if (verBlack == 8) {
					ver03[8] = "●";
				} else if (verBlack == 9) {
					ver03[9] = "●";
				} else if (verBlack == 10) {
					ver03[10] = "●";
				} else if (verBlack == 11) {
					ver03[11] = "●";
				} else if (verBlack == 12) {
					ver03[12] = "●";
				} else if (verBlack == 13) {
					ver03[13] = "●";
				} else if (verBlack == 14) {
					ver03[14] = "●";
				} else if (verBlack == 15) {
					ver03[15] = "●";
				} else if (verBlack == 16) {
					ver03[16] = "●";
				} else if (verBlack == 17) {
					ver03[17] = "●";
				} else if (verBlack == 18) {
					ver03[18] = "●";
				} else if (verBlack == 19) {
					ver03[19] = "●";
				}
			} else if (horBlack == 4) {
				if (verBlack == 1) {
					ver04[1] = "●";
				} else if (verBlack == 2) {
					ver04[2] = "●";
				} else if (verBlack == 3) {
					ver04[3] = "●";
				} else if (verBlack == 4) {
					ver04[4] = "●";
				} else if (verBlack == 5) {
					ver04[5] = "●";
				} else if (verBlack == 6) {
					ver04[6] = "●";
				} else if (verBlack == 7) {
					ver04[7] = "●";
				} else if (verBlack == 8) {
					ver04[8] = "●";
				} else if (verBlack == 9) {
					ver04[9] = "●";
				} else if (verBlack == 10) {
					ver04[10] = "●";
				} else if (verBlack == 11) {
					ver04[11] = "●";
				} else if (verBlack == 12) {
					ver04[12] = "●";
				} else if (verBlack == 13) {
					ver04[13] = "●";
				} else if (verBlack == 14) {
					ver04[14] = "●";
				} else if (verBlack == 15) {
					ver04[15] = "●";
				} else if (verBlack == 16) {
					ver04[16] = "●";
				} else if (verBlack == 17) {
					ver04[17] = "●";
				} else if (verBlack == 18) {
					ver04[18] = "●";
				} else if (verBlack == 19) {
					ver04[19] = "●";
				}
			} else if (horBlack == 5) {
				if (verBlack == 1) {
					ver05[1] = "●";
				} else if (verBlack == 2) {
					ver05[2] = "●";
				} else if (verBlack == 3) {
					ver05[3] = "●";
				} else if (verBlack == 4) {
					ver05[4] = "●";
				} else if (verBlack == 5) {
					ver05[5] = "●";
				} else if (verBlack == 6) {
					ver05[6] = "●";
				} else if (verBlack == 7) {
					ver05[7] = "●";
				} else if (verBlack == 8) {
					ver05[8] = "●";
				} else if (verBlack == 9) {
					ver05[9] = "●";
				} else if (verBlack == 10) {
					ver05[10] = "●";
				} else if (verBlack == 11) {
					ver05[11] = "●";
				} else if (verBlack == 12) {
					ver05[12] = "●";
				} else if (verBlack == 13) {
					ver05[13] = "●";
				} else if (verBlack == 14) {
					ver05[14] = "●";
				} else if (verBlack == 15) {
					ver05[15] = "●";
				} else if (verBlack == 16) {
					ver05[16] = "●";
				} else if (verBlack == 17) {
					ver05[17] = "●";
				} else if (verBlack == 18) {
					ver05[18] = "●";
				} else if (verBlack == 19) {
					ver05[19] = "●";
				}
			} else if (horBlack == 6) {

			} else if (horBlack == 7) {

			} else if (horBlack == 8) {

			} else if (horBlack == 9) {

			} else if (horBlack == 10) {

			} else if (horBlack == 11) {

			} else if (horBlack == 12) {

			} else if (horBlack == 13) {

			} else if (horBlack == 14) {

			} else if (horBlack == 15) {

			} else if (horBlack == 16) {

			} else if (horBlack == 17) {

			} else if (horBlack == 18) {

			} else if (horBlack == 19) {

			}

			for (int i = 0; i < 19; i++) {
				System.out.print(ver01[i]);

			}
			System.out.println();

			for (int i = 0; i < 19; i++) {
				System.out.print(ver02[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver03[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver04[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver05[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver06[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver07[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver08[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver09[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver10[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver11[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver12[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver13[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver14[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver15[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver16[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver17[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver18[i]);
			}
			System.out.println();
			for (int i = 0; i < 19; i++) {
				System.out.print(ver19[i]);
			}
			System.out.println();

		}

	}
}
