package chap3;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력.
 * [결과]
 * 금액을 입력하세요.
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원 : 0개
 * 10원 : 4개
 * 1원 : 1개
 * 
 * */
public class Exam3 {

	public static void main(String[] args) {

		
		System.out.println("금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int coin = scan.nextInt(); //키보드로 숫자를 입력받아 coin에 집어넣음.
		
		int a = coin/500;
		int b = (coin%500)/100;
		int c = ((coin%500)/100)/50;
		int d = (coin%100) / 10;
		int e = coin % 10;
		
		/* <선생님 답>
		 * System.out.println("500원 : "+ (coin/500) +"개"); //현재 돈 나누기 500
		 * System.out.println("100원 : "+ (coin%500)/100 +"개"); //500으로 나눈 돈을 다시 100으로 나눠서 몫
		 * System.out.println("50원 : "+ (coin%100)/50 +"개"); 
		 * //위에 값의 나머지에서 50으로 나눠도 되지만프로그램 상 그 값이 100으로 나눈 나머지와 같다.
		 * System.out.println("10원 : "+ (coin%50)/10 +"개");
		 * System.out.println("1원 : "+ (coin%10) +"개");
		 * 
		 * 
		 * */
		
		System.out.println("500원 : "+a+"개");
		System.out.println("100원 : "+b+"개");
		System.out.println("50원 : "+c+"개");
		System.out.println("10원 : "+d+"개");
		System.out.println("1원 : "+e+"개");
		
	}

}
