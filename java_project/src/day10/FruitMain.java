package day10;

public class FruitMain {

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		
		// 두번째 생성자를 사용하여 banana 객체생성
		Fruit banana = new Fruit();
		banana.name = "바나나";
		banana.color = "노랑";
		banana.isSeed = true;
		// 세번째 생성자를 사용하여 melon 객체생성
		Fruit melon = new Fruit();
		melon.name = "멜론";
		melon.color = "연두";
		melon.isSeed = true;
		// 네번째 생성자를 사용하여 orange 객체생성
		Fruit orange = new Fruit();
		orange.name = "오렌지";
		orange.color = "주황";
		orange.isSeed = true;
		
		apple.print();
		banana.print();
		melon.print();
		orange.print();
	}

}
