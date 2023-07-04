package day09;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
//		dog.name = "뽀삐";
		dog.setName("뽀삐");
//		dog.sound = "멍멍";
		dog.setSound("멍멍");
//		dog.leg = 4;
		dog.setLeg(4);
//		System.out.println(dog.getName()+"\t"+dog.getSound()+"\t"+dog.getLeg());
		
		// 객체이름 cat, 이름은 야옹이, 울음소리 야옹, 다리갯수 4
		Animal cat = new Animal();
		cat.setName("야옹이");
		cat.setSound("야옹");
		cat.setLeg(4);
//		System.out.println(cat.getName()+"\t"+cat.getSound()+"\t"+cat.getLeg());
		// 닭
		Animal chicken = new Animal();
		chicken.setName("양념이");
		chicken.setSound("꼬끼오");
		chicken.setLeg(2);
//		System.out.println(chicken.getName()+"\t"+chicken.getSound()+"\t"+chicken.getLeg());
		// 뱀
		Animal snake = new Animal();
		snake.setName("방울이");
		snake.setSound("스스");
		snake.setLeg(0);
//		System.out.println(snake.getName()+"\t"+snake.getSound()+"\t"+snake.getLeg());
		
		System.out.println(dog.getLeg()+cat.getLeg()+chicken.getLeg());
		
	}

}
