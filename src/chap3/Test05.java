package chap3;

import java.util.Scanner;

/*
 * 반지름을 입력받아 원의 둘레와 면적을 구하시오.
 * 
 * 
 * */
public class Test05 {

	public static void main(String[] args) {

		System.out.println("반지름의 길이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //키보드로 숫자를 입력받아 반지름 길이에 집어넣음.
		
		System.out.println("반지름 : "+a);
		System.out.println("넓이 : "+3.141592*a*a);
		System.out.println("둘레 : "+2*3.141592*a);
		
		/* 선생님 방법
		 * 
		 * double pi = 3.141592
		 * System.out.println("반지름의 길이를 입력하세요.");
		 * Scanner scan = new Scanner(System.in);
		 * int r = scan.nextInt();
		 * 
		 * ==> 파이값을 변수로 만든 후 결과값 출력.
		 * 
		 * */
	}

}
