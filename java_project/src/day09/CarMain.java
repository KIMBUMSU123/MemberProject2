package day09;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.getColor());
		
		c.name = "그랜져";
		c.tire = "한국";
		c.color = "빨강";
		c.speed = 1;
		c.run();
		c.speedRun(10);
		String a = c.getColor();
		System.out.println(c.getColor());
		int b = c.getSpeed();
		System.out.println(b);
		
		
		System.out.println(c.name +"\t"+c.tire+"\t"+c.color+"\t"+c.speed);
	}

}
