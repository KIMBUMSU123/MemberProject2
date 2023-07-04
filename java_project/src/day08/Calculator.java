package day08;

public class Calculator {
	int num1;
	int num2;
	
	// 메서드명: sum 리턴타입: x 매개변수: x 실행문구: 필드num1+num2출력
	public void sum() {
		System.out.println(num1 + num2);
	}
	// 메서드명: sub 리턴타입: x 매개변수: int 2개 실행문구: 매개변수 두개의 합 출력
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	// 메서드명: mul 리턴타입: o 매개변수: x 실행문구: 필드num1*num2리턴
	public int mul(){
		return num1 * num2;
	}
	// 메서드명: div 리턴타입: o 매개변수: int 2개 실행문구: 매개변수 두개의 나눈값 리턴
	public double div(int a, double b) {
		return a / b;
	}
}
