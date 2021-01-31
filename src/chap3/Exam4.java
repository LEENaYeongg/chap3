package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 "양수", 음수인 경우 "음수", 0인 경우 "영"을 출력하기
 * 
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {

	System.out.println("숫자를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	String result = (num>0)?"양수":(num<0)?"음수":"영";
	System.out.println(result);

	//짝수인지 홀수 출력하기
	
	String ga = (num%2==0)?"짝수":"홀수";
	System.out.println(ga);
	
	
	}

}
