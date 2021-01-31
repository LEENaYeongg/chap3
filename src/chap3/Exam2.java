package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100 자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 * 
 * 1. 키보드로 입력받는다.
 * 2. 
 * 
 * */

public class Exam2 {

	public static void main(String[] args) {

		System.out.println("세자리 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println(a-a%100); // 방법1
		System.out.println(a/100 * 100); // 방법2

		
	}

}
