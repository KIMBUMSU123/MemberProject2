package day05;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
//		int[] a = {23,14,15,16,4};
//		
//		for(int i=0; i<a.length; i++) {
//			if(i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+",");
//		}
		
		// a배열의 전체합 출력
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		int[] b = new int[10]; //10칸짜리 int배열 만들기
//		
//		for(int i=0; i<b.length; i++) {
//			System.out.print("b배열의 "+i+"번째 인덱스> ");
//			b[i] = sc.nextInt();
//		}
		
		// b배열의 짝수번째 인덱스값만 출력
//		for(int i=0; i<b.length; i++) {
//			if(i % 2 == 0) {
//				System.out.println(b[i]);
//			}
//		}
		
		// b배열의 값들중에 짝수값만 출력
//		for(int i=0; i<b.length; i++) {
//			if(b[i] % 2 == 0) {
//				System.out.println(b[i]);
//			}
//		}
//		int sum = 0;
//		for(int i=0; i<b.length; i++) {
//			if(b[i] % 2 != 0) {
//				sum += b[i];
//			}
//		}
//		System.out.println(sum);
		
		// b배열의 값들중에 3의배수의 합, 5의배수의 합, 3과5의배수의 합, 둘다아닌값의 합
//		int sum3 = 0; // 3의배수의 합
//		int sum5 = 0; // 5의배수의 합
//		int sum35 = 0; // 3과5의배수의 합
//		int sum = 0; // 둘다아닌값의 합
//		
//		for(int i=0; i<b.length; i++) {
//			if(b[i] % 3 == 0 && b[i] % 5 == 0) {
//				sum35 += b[i];
//			}
//			if(b[i] % 3 == 0) {
//				sum3 += b[i];
//			}
//			if(b[i] % 5 == 0) {
//				sum5 += b[i];
//			}
//			if(b[i] % 3 != 0 && b[i] % 5 != 0) {
//				sum += b[i];
//			}
//		}
		
//		for(int i=0; i<b.length; i++) {
//			if(b[i] % 3 == 0 && b[i] % 5 == 0) {
//				sum35 += b[i];
//				sum3 += b[i];
//				sum5 += b[i];
//			}else if(b[i] % 3 == 0) {
//				sum3 += b[i];
//			}else if(b[i] % 5 == 0) {
//				sum5 += b[i];
//			}else {
//				sum += b[i];
//			}
//		}
		
		int[] c = {2, 3, 24, 1, 8};
		
		// 배열 0번째 인덱스에 모든 값 누적
//		for(int i=1; i<c.length; i++) {
//			c[0] += c[i];
//		System.out.println(c[0]);
		
		// 배열의 값을 한칸씩 앞당기기
		// c = {3, 24, 1, 8, 2}
		
		int t = c[0];
		for(int i=0; i<c.length; i++) {
			if(i == c.length-1) {
				c[i] = t;
				break;
			}
			c[i] = c[i+1];
		}
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		
//		int t = c[0];
//		c[0] = c[1];
//		c[1] = c[2];
//		c[2] = c[3];
//		c[3] = c[4];
//		c[4] = t;
		
		
	}

}
 











