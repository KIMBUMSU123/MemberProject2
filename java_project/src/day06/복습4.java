package day06;

public class 복습4 {
	
	public static void main(String[] args) {
//		int[] a = {12, 3, 4, 5,34};
//		// a배열의 0번째값을 출력할땐 a[0]
//		
//		for(int i=0; i<a.length; i++) {
//			if(i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+",");
//		}
		
//		int[] b = new int[10];
//		// b[0] = 8;
//		// b배열에 1~10까지 값을 넣으세요
//		for(int i=0; i<b.length; i++) {
//			b[i] = i+1;
//		}
//		
//		for(int i=0; i<b.length; i++) {
//			System.out.println(b[i]);
//		}
		
//		int[] c = {12, 3, 5, 2, 15};
//		// c배열의 총합 출력
//		int sum = 0;
//		for(int i=0; i<c.length; i++) {
//			sum += c[i];
//		}
//		System.out.println(sum);
		
//		int[] d = {12, 3, 2, 24, 42};
//		// d[0] 째에 모든 값 누적
//		
//		for(int i=1; i<d.length; i++) {
//			d[0] += d[i];
//		}
//		
//		System.out.println(d[0]);
		
		int[] e = {12, 3, 2, 24, 42};
		// 한칸씩 앞당기기
		// 결과 : e = {3, 2, 24, 42, 12}
		int t = e[0];
		for(int i=1; i<e.length; i++) {
			e[i-1] = e[i];
			if(i == e.length-1) {
				e[i] = t;
			}
		}
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println(e[3]);
		System.out.println(e[4]);
		
		
	}
	
}













