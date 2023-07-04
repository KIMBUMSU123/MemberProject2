package day09;

public class FruitMain {
	
	public static void main(String[] args) {
		
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color="빨강";
		apple.isseed = true;
		apple.print();
		Fruit banana = new Fruit("바나나","노랑",false);
		banana.print();
		
		// 두번째 생성자 사용하여 melon객체 생성후 print메서드 호출
		Fruit melon = new Fruit("멜론");
		melon.color = "초록색";
		melon.isseed = true;
		melon.print();
		
		// 세번째 생성자 사용하여 orange객체 생성후 print메서드 호출
		Fruit orange = new Fruit("orange", "오렌지색");
		orange.isseed=true;
		orange.print(); //끝
		
		
		
		
		
		
//		Fruit melon = new Fruit();
//		if(melon.name.equals("멜론")) {
//			System.out.println("멜론객체입니다");
//		}else {
//			System.out.println("멜론이 아니비다");
	}

}
