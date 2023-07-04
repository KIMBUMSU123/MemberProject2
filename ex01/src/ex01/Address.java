package ex01;

import java.util.Scanner;

public class Address {
	public static void run() {
		Student[] students=new Student[5];
		Scanner s=new Scanner(System.in);
		boolean run=true;
		int count = 0;
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 0.종료");
			System.out.println("---------------------------");
			System.out.println("선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "3":
				System.out.print("검색할이름>");
				String search=s.nextLine();
				boolean find=false;
				for(int i=0; i<count; i++) {
					Student stu=students[i];
					if(stu.getSname().equals(search)) {
						System.out.println(stu.toString());
						find=true;
					}
				}
				if(find==false) System.out.println(search + "학생이 존재하지 않습니다");
				break;
			case "4": //수정
				System.out.print("수정할이름>");
				String update=s.nextLine();
				find=false;
				for(int i =0; i<count; i++) {
					Student stu=students[i];
					if(update.equals(stu.getSname())) {//찾았으면
						find=true;
						System.out.println("이름:"+stu.getSname());
						System.out.println("주소:"+stu.getAddress());
						System.out.println("새로운주소>");
						String newAddress=s.nextLine();
						if(newAddress!="") {
							stu.setAddress(newAddress);
							System.out.println("새로운 주소로 변경되었습니다");
						}
					}
				}
				if(find==false) System.out.println(update + "학생이 존재하지 않습니다");
				break;
			case "0":
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				Student student=new Student();
				
				student.setSno("2023" + count+1);
				System.out.println("학번>" + student.getSno());
				
				System.out.print("이름>");
				student.setSname(s.nextLine());
				
				System.out.print("주소>");
				student.setAddress(s.nextLine());
				students[count]=student;
				count++;
				break;
			case "2":
				for(int i=0; i<count; i++) {
					Student stu=students[i];
					System.out.println(stu.toString());
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}//switch
		}//while
	}

}
