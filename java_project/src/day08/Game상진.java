package day08;

import java.util.Scanner;

public class Game상진 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	
	int life = 100;
	
	System.out.println("범위 x값을입력해주세요");
	int x=sc.nextInt();
	System.out.println("범위 y값을입력해주세요");
	int y=sc.nextInt();
	int[][] seat = new int[x][y];

	int num = (int)(Math.random()*x)+1;
	int num2 = (int)(Math.random()*y)+1;
	boolean find = false;
	
	for(int i=0; i<life; i++) {
		System.out.println("x값에 보물위치를 입력해주세요");
		int x2=sc.nextInt();
		if(num==x2) {
		System.out.println("y값의 보물위치를 입력해주세요");
		int y2=sc.nextInt();
		if(num2==y2) {
			find = true;
			System.out.println("보물찾았음");
			break;
		}else{
			System.out.println("해당위치엔 없음");
		}
	}else{
		System.out.println("해당위치엔 없음");
	}
		
	}
	if(!find) {
		System.out.println("목숨이없다");
	}
	
	seat[num][num2] = 7;
	
	for(int i=0; i<x; i++) {
		for(int j=0; j<y; j++) {
			System.out.print(seat[i][j] + " ");
		}
		System.out.println();
	}
	}
	}