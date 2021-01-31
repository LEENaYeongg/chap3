package chap3;

import java.util.Scanner;

/*
 * 삼항연산자 : 조건연산자 => 조건문으로 변경 가능.
 * (조건식)?참:거짓
 * 
 * 조건식 : 결과가 반드시 boolean
 * 
 * 
 * */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); // nextInt() : 정수값 입력받기.
									// next() : 문자열 입력받기.
									// nextdouble() : 실수값 입력받기.
		System.out.println(((score>=60)?"합격":"불합격")+"입니다."); //합격,불합격 출력
		
		//70점 이상인 경우 합격결정으로 출력
		// 60점 대인 경우 재시험 대상
		//60점 미만인 경우 불합격
		
		String result = (score>=70)?"합격결정":(score>=60)?"재시험대상":"불합격";
		System.out.println(score + "점은" +result + "입니다.");
	}

}
