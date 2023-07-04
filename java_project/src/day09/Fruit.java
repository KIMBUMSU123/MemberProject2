package day09;

public class Fruit {
	// 필드(인스턴스 변수)
	String name;
	String color;
	boolean isseed;
	
	// 생성자 - 객체를 생성할때 사용하는 것
	// 특징 1. 클래스이름과 동일
	//	   2. 리턴타입 없다.
	public Fruit() { //기본생성자
		
		
	}
	
	// 생성자 오버로딩 - 매개변수를 다르게 해서 동일한 이름을 가질 수 있는 것
	public Fruit(String name) { // 네임
		this.name = name;
		

	}
	public Fruit(String name, String color) { //네임과 칼라
		this.name = name;
		this.color= color;

	}//isSeed는 씨앗
	public Fruit(String name, String color, boolean isSeed) { // 네임과 칼라와 이즈시드
		this.name = name;
		this.color = color;
		this.isseed = isSeed;
	}
	
	// 메서드
	public void print() {
		System.out.println(name+"\t"+color+"\t"+isseed);
	}
	

}
