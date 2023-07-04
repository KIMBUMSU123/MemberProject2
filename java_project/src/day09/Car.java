package day09;

public class Car {
	// 필드(인스턴스 변수)
	String name;
	String tire;
	String color = "검정";
	int speed;
	
	// 생성자
	
	// 메서드
	// 접근제한자 리턴타입 메소드명([매개변수]){
	// 		실행문구		
	// }
	public void run() {
		speed += 2;
	}
	public void speedRun(int speed) {
		this.speed += speed; // 
	}
	public String getColor() {
		return this.color;
	}
	public int getSpeed() {
		return speed;
	}
}











