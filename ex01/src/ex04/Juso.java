package ex04;
import java.util.*;

public class Juso {
	public static void run() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		//샘플데이타
		List<Student> array=new ArrayList<Student>();
		Student stu=new Student(10, "홍길동", "인천", "010-1010-1010");
		array.add(stu);
		Student stu2=new Student(11, "심청이", "서울", "010-1010-2020");
		array.add(stu2);
		Student stu3=new Student(10, "강감찬", "부산", "010-1010-3030");
		array.add(stu3);
		int last=12;
		while(run) {
			System.out.println("\n----------------------------------------");
			System.out.println("1.등록 |2.목록 |3.조회 |4.수정 |5.삭제 |0.종료");
			System.out.println("------------------------------------------");
			System.out.println("메뉴선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "0":
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1"://등록
				Student newStu=new Student();
				newStu.setNo(++last);
				System.out.println("학번>"+ newStu.getNo());
				System.out.print("이름>");
				newStu.setName(s.nextLine());
				System.out.print("주소>");
				newStu.setJuso(s.nextLine());
				System.out.print("전화>");
				newStu.setPhone(s.nextLine());
				array.add(newStu);
				System.out.println("전체학생수:"+array.size());
				break;
			case "2"://목록
				for(Student vo:array) {
					System.out.printf("%d\t%s\t%s\t%s\n",
							vo.getNo(),vo.getName(),vo.getJuso(),vo.getPhone());
				}
				System.out.println(array.size()+"명이 등록되었습니다.");
				break;
			case "3"://조회
				System.out.println("조회할학번>");
				String search=s.nextLine();
				for(Student vo:array) {
					if(vo.getNo()==Integer.parseInt(search)) {
						System.out.printf("이름>" + vo.getName());
						System.out.println("주소>" + vo.getJuso());
						System.out.println("전화>" + vo.getPhone());
					}
				}
				break;
			case "4"://수정
				System.out.println("수정할학번>");
				String update=s.nextLine();
				for(Student vo:array) {
					if(vo.getNo()==Integer.parseInt(update)) {
						System.out.println("이름:"+vo.getName()+">");
						String newName=s.nextLine();
						if(newName!="") vo.setName(newName);
						System.out.println("주소:"+vo.getJuso()+">");
						String newJuso=s.nextLine();
						if(newJuso!="") vo.setJuso(newJuso);
						System.out.println("전화"+vo.getPhone()+">");
						String newPhone=s.nextLine();
						if(newPhone!="") vo.setPhone(newPhone);
						System.out.println(vo.toString());
					}
				}
				break;
			case "5"://삭제
				System.out.println("삭제할학번>");
				String delete=s.nextLine();
				for(Student vo:array) {
					if(vo.getNo()==Integer.parseInt(delete)) {
						array.remove(vo);
						System.out.println(vo.getName()+"학생 삭제완료");
						break;
					}
				}
				break;
			default:
				System.out.println("메뉴를 다시선택하세요!");
			}
		}//while
	}//run
}//juso