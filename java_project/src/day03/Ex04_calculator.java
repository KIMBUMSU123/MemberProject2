package day03;

import java.util.Scanner;

public class Ex04_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean con = true;
		int result = 0;
		int num1 = 0;
		
		while(run) {
			System.out.println("=====계산기=====");

			if(con) {
				System.out.print("첫번째 숫자입력> ");
				num1 = sc.nextInt();
			}
			
			
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			
			switch(menu) {
			case 1:
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n",num1,num2,result);
				break;
			case 2:
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n",num1,num2,result);
				break;
			case 3:
				result = num1 * num2;
				System.out.printf("%d * %d = %d\n",num1,num2,result);
				break;
			case 4:
				result = num1 / num2;
				System.out.printf("%d / %d = %d\n",num1,num2,result);
				break;
			case 5:
				result = num1 % num2;
				System.out.printf("%d %% %d = %d\n",num1,num2,result);
				break;
				default:
					System.out.println("1~5까지 입력가능");
			}

			while(true) {
				System.out.print("1.종료 2.새로하기 3.이어하기> ");
				int end = sc.nextInt();
				if(end == 1) {
					run = false;
					break;
				}else if(end == 2) {
					con = true;
					num1 = 0;
					break;
				}else if(end == 3) {
					num1 = result;
					con = false;
					break;
				}else {
					System.out.println("1~3까지 입력해주세요");
				}
			}
			
			System.out.println();
		}
		System.out.println("계산기 종료");
	}

}

















