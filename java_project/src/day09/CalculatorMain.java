package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성 후 모든 메서드 사용하여 각각의 값 출력
		String a = "홍길동";
		String b = new String("홍길동");
		
		Calculator c = new Calculator();
		c.num1 = 5;
		c.num2 = 9;
		
		c.sum();
		c.sub(70, 10);
		System.out.println(c.mul());
		System.out.println(c.div(7, 9));
		
		Calculator c1 = new Calculator();
		c1.sum();
		System.out.println(c1.num1);
		
	}

}






