package chap3;

import java.util.Scanner;

/*
 * 사과를 담기 위한 사과상자 갯수 구하기
 * 1개의 상자에 10개의 사과를 담을 수 있다고 할 때 필요한 상자의 갯수를 출력하기
 * 
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수: 3개
 * 
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3개
 * 
 * ===> 내 생각
 * 		입력받은 사과의 수를 10으로 나눠서 나머지가 0이면 사과수/10의 몫이 박스의 갯수로 필요하고
 * 		나머지가 0이 아니면 몫+1 의 갯수가 필요.
 * 		그러면.. 어디에 저 결과값을 표현해야하나..
 * 
 * */
public class Exam6 {

	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();

		int mo= apple/10;
		int ma = apple/10+1;
		
		int box = (apple%10==0)?mo:ma;
		System.out.println("필요한 상자의 갯수: " + box + "개");
		
		/*
		 * 선생님 방법
		 * 
		 * 1. System.out.println("필요한 상자의 갯수: " + ((apple%10==0)?apple/10:apple/10 + 1) + "개");
		 * 2. System.out.println("필요한 상자의 갯수: " + (apple/10 + ((apple%10==0)?0:1) + "개");
		 * 
		 * 
		 * */
	}

}
