package chap3;
/*
 * 비트 연산자 : &, |, ^, ~
 *  AND(&)
 *  OR(|)
 *  XOR(^)
 *  NOT(~)
 *  
 * */
public class OpEx6 {

	public static void main(String[] args) {
		System.out.println("6 & 3 =" + (6 & 3));
		/* 6 : 00000110
		   3 : 00000011
		  ===============
		   & : 00000010  :2
		*/
		System.out.println("6 | 3 =" + (6 | 3));
		/* 6 : 00000110
		   3 : 00000011
		  ===============
		   | : 00000111 :7
		*/
		System.out.println("6 ^ 3 =" + (6 ^ 3));
		/* 6 : 00000110
		   3 : 00000011
		  ===============
		   ^ : 00000101  :5
		*/
		System.out.println("~10 =" + (~10)); //-11
		/*
		 * 
		 * 10 : 00001010
		 * ==============
		 * ~  : 11110101  => 음수, 2의 보수 표현
		 * 1110101  : ? 의 2의 보수, ?는 1110101 2의 보수로 치환.
		 * 2의 보수 : 1의 보수 +1
		 * 
		 * 11110101 1의 보수
		 * 00001010
		 * +      1
		 * 00001011 : 11
		 *
		 * 
		 * 보수란? 3에 대한 10의 보수는 7
		 *       7에 대한 10의 보스는 3
		 * */
		System.out.println("true & false =" + (true & false));
		System.out.println("true | false =" + (true | false));
		System.out.println("true ^ true =" + (true ^ true));
		System.out.println("true ^ flase =" + (true ^ false));
		System.out.println("!true =" + (!true));
		

	}

}
