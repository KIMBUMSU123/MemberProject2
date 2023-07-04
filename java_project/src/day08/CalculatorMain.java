package day08;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 객체만들고
		// 모든메서드 호출하여 더하기 빼기 곱하기 나누기 값 출력
		Calculator c = new Calculator();
		c.num1 = 5;
		c.num2 = 3;
		c.sum();
		c.sub(7, 6);
		System.out.println(c.mul());
		System.out.println(c.div(7, 3.4));
	}

}
