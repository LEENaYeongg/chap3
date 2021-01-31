package chap3;
/*
 * ��Ʈ ������ : &, |, ^, ~
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
		 * ~  : 11110101  => ����, 2�� ���� ǥ��
		 * 1110101  : ? �� 2�� ����, ?�� 1110101 2�� ������ ġȯ.
		 * 2�� ���� : 1�� ���� +1
		 * 
		 * 11110101 1�� ����
		 * 00001010
		 * +      1
		 * 00001011 : 11
		 *
		 * 
		 * ������? 3�� ���� 10�� ������ 7
		 *       7�� ���� 10�� ������ 3
		 * */
		System.out.println("true & false =" + (true & false));
		System.out.println("true | false =" + (true | false));
		System.out.println("true ^ true =" + (true ^ true));
		System.out.println("true ^ flase =" + (true ^ false));
		System.out.println("!true =" + (!true));
		

	}

}
