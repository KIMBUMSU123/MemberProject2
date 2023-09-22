package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {
	public static void run() {
		Scanner s=new Scanner(System.in);
		
		//샘플데이터
		List<SaleVO> array=new ArrayList<>();
		SaleVO sale=new SaleVO(100, "냉장고", 250, 10);
		array.add(sale);
		sale=new SaleVO(100, "세탁기", 220, 5);
		array.add(sale);
		sale=new SaleVO(100, "건조기", 230, 10);
		array.add(sale);
		int last=103;
		boolean find = false;
		
		boolean run=true;
		while(run) {
			System.out.println("\n\n****** 재고관리 **********************");
			System.out.println("----------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "4":
				System.out.print("수정번호>");
				String update=s.nextLine();
				for(SaleVO vo:array) {
					if(Integer.parseInt(update)==vo.getCode()) {
						System.out.print("상품이름:" + vo.getName()+">");
						String newName=s.nextLine();
						if(newName!="") vo.setName(newName);
						System.out.println("상품가격:" + vo.getPrice()+">");
						String newPrice=s.nextLine();
						if(newPrice!="") vo.setPrice(Integer.parseInt(newPrice));
						System.out.print("재고수량:" + vo.getQnt()+">");
						String newQnt=s.nextLine();
						if(newQnt!="") vo.setQnt(Integer.parseInt(newQnt));
						System.out.println("수정완료!");
					}
				}
				break;
			case "2":
				System.out.print("조회번호>");
				String search=s.nextLine();
				for(SaleVO vo:array) {
					if(Integer.parseInt(search)==vo.getCode()) {
						System.out.println("상품이름:" + vo.getName());
						System.out.println("상품가격:" + vo.getPrice());
						System.out.println("재고수량:" + vo.getQnt());
						vo.setSum(vo.getPrice()*vo.getQnt());
						System.out.println("상품금액:" + vo.getSum());
						find=true;
					}
				}
				if(!find) System.out.println(search + "번 상품이 없습니다.");
				break;
			case "1":
				sale=new SaleVO();
				sale.setCode(++last);
				System.out.println("상품코드>" + sale.getCode());
				System.out.println("상품이름>");
				sale.setName(s.nextLine());
				System.out.println("상품가격>");
				sale.setPrice(Integer.parseInt(s.nextLine()));
				System.out.println("재고수량>");
				sale.setQnt(Integer.parseInt(s.nextLine()));
				array.add(sale);
				break;
			case "3":
				for(SaleVO vo:array) {
					vo.setSum(vo.getPrice()*vo.getQnt());
					vo.print_land();
				}
				System.out.println(array.size()+ "개 상품이 등록되었습니다");
				break;
			case "0":
				run=false;
				System.out.println("프로그램이 종료되었습니다!");
				break;
			}
		}
		
		
		
		
		
		
	}
}
