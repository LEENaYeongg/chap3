package chap3;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수보다 크거나 같은 	10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀값을 출력하기
 * [결과]
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 24
 * 6	:	30 - 24
 * 
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 20
 * 0	:	20 - 20
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result = (num%10==0)?num:num/10 * 10 + 10;
		
		System.out.println(result+"-"+num+"="+ (result-num));
		
		
		/*
		 * 선생님 답
		 * 
		 * int num10 = (num%10==0)?num:(num/10 +1)*10);
		 * System.out.println(num10 + "-" + num + "=" +(num10 - num));
		 * 
		 * 
		 * */
		
		
		
		
	}

}
