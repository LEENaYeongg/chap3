package chap3;
/*
 * String 클래스의 + 연산
 * String 클래스 :
 *   + 연산자 사용 가능한 유일한 유일한 클래스
 *   대입연산자(=)를 이용해서 객체 생성이 가능한 유일한 클래스
 *   String = String + 기본자료형
 *   
 * 
 * */
public class OpEx5 {

	public static void main(String[] args) {
		String str = "번호";
		String str2 = new String("번호"); //객체 생성

		System.out.println(str + 1 + 2 +3);
		//연산자는 왼쪽에서 오른쪽으로 연산방향이 이루어진다.
		//str "번호"라는 문자열에 1이 붙어 "번호1"이라는 문자열이 생성
		//계속해서 더해져 str123dl는 문자열이 만들어진다.
		System.out.println(1 + 2 +3 + str);
		//1이라는 정수 +2 +3 =6이라는 결과값이 나온다.
		//기본적인 정수값인 6과 문자열이 붙는다.
		System.out.println(str + (1 + 2 +3));
		//연산순서를 이용하여 괄호를 더해 괄호 안의 정수들을 먼저 다 더하고 문자열을 붙여 번호6을 출력한다.
		
		
	}

}
