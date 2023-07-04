package day09;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Board객체 하나 만들기
		// cntUp메서드 사용하기
		// print메서드 사용하기
		Board a = new Board("자바는 즐거워",0,true);
		a.cntUp();
		a.print();
		
		// Board객체 하나 만들기
		// cntUp1메서드 사용하고 리턴값 출력하기
		// print메서드 사용하기
		Board b = new Board("자바는 어려워",10,false);
		System.out.println(b.cntUp1(5));
		b.print();
		
	}

}