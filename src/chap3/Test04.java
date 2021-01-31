package chap3;
/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 구하시오
 * */
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		System.out.println("밑변과 높이의 길이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //키보드로 숫자를 입력받아 밑변의 길이에 집어넣음.
		Scanner scanb = new Scanner(System.in);
		int b = scanb.nextInt(); //키보드로 숫자를 입력받아 높이의 길이에 집어넣음.
		float c = (float)(a*b)/2;
		//float d = (float)(a*b/2);는 17.0이 나오는가?
		//나의 추론은 이미 a*b/2를 정수처리 끝내고 형변환을 해서 나머지가 없기 때문에 그런 것 같다.
		
		
		System.out.println("밑변의 길이 : "+a);
		System.out.println("높이의 길이 : "+b);
		System.out.println("넓이 : "+ c);
		
	}

}
