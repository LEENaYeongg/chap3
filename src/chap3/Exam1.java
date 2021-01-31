package chap3;

import java.util.Scanner;



/*
 * 12345 초가 몇시간 몇분 몇초인지 출력하기
 * [결과]
 * xx시간 xx분 xx초
 * 
 * ex)
 * 3600초
 * 1시간 0분 0초
 * 
 * 12345초 = 205.75분 = 3.4291...시간
 * 3시간=10800초
 * 12345-10800=1545
 * 1545/60=25.75  ==> 25*60 =1500초
 * 1545-1500=45초
 * 
 */

public class Exam1 {

	public static void main(String[] args) {
/*	int second = 12345;
	
 내 답: System.out.println(second/3600+ "시간 " + (second%3600)/60+"분 " +(second%3600)%60+"초");

	int h = second/3600;
	int m = (second%3600)/60;
	int s = second % 60;
	
	System.out.println(h+"시간"+m+"분"+s+"초"); // 3시간 25분 45초
*/
		
		//키보드에서 입력 받아 시간 구하기
		System.out.println("계산할 초를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		// system.in : 표준 입력. 키보드 입력.
	
		int second=scan.nextInt();
		// 입력 받은 값을 second에 초기화.
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second % 60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");
		
	}

}
