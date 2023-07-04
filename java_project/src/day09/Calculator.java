package day09;

public class Calculator {
	// 필드(인스턴스 변수)
	int num1 = 1;  
	int num2; 
	
	// 메서드
	// 메서드명: sum, 리턴타입: x, 매개변수: x, 실행문구: 필드 num1+num2 출력
	public void sum() {
		System.out.println(num1 + num2);
	}
	// 메서드명: sub, 리턴타입: x, 매개변수: 정수두개, 실행문구: 매개변수로 받은 두개 값의 차 출력
	public void sub(int a, int b) {
		if(b > a) {
			System.out.println("b가 큰경우 : "+(b - a));
		}else {
			System.out.println("a가 큰경우 : "+(a - b));
		}
	}
	// 메서드명: mul, 리턴타입: o, 매개변수: x, 실행문구: 필드 num1*num2 리턴
	public int mul() {
		return num1 * num2;
	}
	// 메서드명: div, 리턴타입: o, 매개변수: 정수두개, 실행문구: 매개변수로 받은 두개의 나눈값 리턴
	public double div(int a, int b) {
		return a / (double)b;
	}
}










