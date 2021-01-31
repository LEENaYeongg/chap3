package chap3;
/*
 * 이항 연산자 : 산술연산자 : +,-,*,/,%
 *  / : 나누기 정수/정수 =정수(결과값)
 *      ex) 3/2=1
 *  % : 나머지 정수/정수=정수(결과값) 1 =3%2
 * 		나머지 연산 후의 결과는 피젯수의 부호를 따른다.
 * 
 * */
public class OpEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10/8); //1
		System.out.println(10/-8); //-1
		System.out.println(-10/8); //-1
		System.out.println(-10/-8);//1
		System.out.println(10%8); //2 
		System.out.println(10%-8);//2 //
		System.out.println(-10%8);//-2 // 잿수와 상관없이 피잿수가 음수면 값은 음수
		System.out.println(-10%-8);//-2 // 
		
	}

}
