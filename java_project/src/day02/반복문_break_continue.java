package day02;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<10; i++) {
//			System.out.println(i);
//			if(i == 4) {
//				break;
//			}
//		}
		
//		for(int i=1; i<=10; i++) {
//			if(i == 4) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// 
		int dan = 7;
		for(int i=1; i<10; i++) {
			if(i == 5) {
				System.out.println();
				continue;
			}else if(i == 9) {
				break;
			}
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		// 출력예시)
//		7 * 1 = 7
//		7 * 2 = 14
//		7 * 3 = 21
//		7 * 4 = 28
		
//		7 * 6 = 42
//		7 * 7 = 49
//		7 * 8 = 56
	}

}
