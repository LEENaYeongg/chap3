package chap3;

import java.util.Scanner;

/* 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하기. (소문자 대문자를 어떻게 표현해야 할까?)
 * 단 소문자가 아닌 경우 " 소문자아님" 출력하기
 * Scanner 클래스의 next() 메서드 이용
 * String 클래스의 charAt(0) 메서드 이용
 * [결과]
 * 한개의 문자를 입력하세요
 * a
 * A
 * 
 * 한개의 문자를 입력하세요
 * A
 * 소문자 아님
 * 
 * 
 * */
public class Exam5 {

	public static void main(String[] args) {
		
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0); // 입력받은 문자열
		// char ch = scan.next().charAt(0); ==> 이렇게 많이 씀.
	
		String result = (ch>='a' && ch<='z')?(char)(ch-32)+"":"소문자 아님";
		System.out.println(result);
		System.out.println((ch>='a' && ch<='z')?(char)(ch-32):"소문자 아님"); //==> 바로 처리가능.
		
	}

}
