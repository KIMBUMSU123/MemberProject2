package day05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a = {12, 4, 6, 7, 8};
//		int b =0;
//		
//		for(int i=0; i<a.length; i++) {
//			b += a[i];
//			}
//		System.out.println(b);

		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a배열의" + i + "번째");
			a[i] = sc.nextInt();
		}

//		for(int j=0; j<a.length; j++) {
//			if(a[j] % 2==0) {
//			System.out.println(a[j]);
//			}
//		}
//		int sum = 0;
//		
//		for(int j=0; j<a.length; j++) {
//			if(a[j] % 2==1) {
//			sum+=a[j];
//			}
//		}System.out.println(sum);

		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;

		for (int j = 0; j < a.length; j++) {
			if (a[j] % 3 == 0) {
				sum += a[j];
				sum2 += a[j];
			} else if (a[j] % 5 == 0) {
				sum1 += a[j];
				sum2 += a[j];
			} else if (a[j] % 3 == 0 && a[j] % 5 == 0) {
				sum2 += a[j];
			} else {
				sum3 += a[j];
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}
}