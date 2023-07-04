package day09;

public class PeopleMain {

	public static void main(String[] args) {
		People a = new People();
		a.setName("이수정");
		a.setage(27);
		a.print();
		
		People b = new People();
		b.setName("dong");
		b.setage(65);
		b.ageUp();
		b.print();
		
		People c = new People();
		c.setName("보고싶다");
		c.setage(52);
		c.ageUp1(540);
		c.print();
		
		People d = new People();
		d.setage(26);
		d.setName("김범슈");
		d.ageUp1(666);
		d.print();
		
		System.out.println(a.getname()+"만 나이:"+a.koreanAge());
		System.out.println(b.getname());
		
		
	}

}
