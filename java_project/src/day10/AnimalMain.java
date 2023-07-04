package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setleg(4);
		
		// cat, chicken, snake 객체 만들어서 값 세팅하기
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.sound = ("냐오오오옹");
		cat.setleg(4);
		
		Animal chicken = new Animal();
		chicken.setName("치킨");
		chicken.setSound("양념");
		chicken.setleg(4);
		
		Animal snake = new Animal();
		snake.setName("뱀");
		snake.setSound("샤샥");
		snake.setleg(0);
		
		System.out.println(dog.getName()+"\t"+dog.getSound()+"\t"+dog.getLeg());
		System.out.println(cat.getName()+"\t"+cat.getSound()+"\t"+cat.getLeg());
		System.out.println(chicken.getName()+"\t"+chicken.getSound()+"\t"+chicken.getLeg());
		System.out.println(snake.getName()+"\t"+snake.getSound()+"\t"+snake.getLeg());
		
		
		
		
		
		

	}

}
