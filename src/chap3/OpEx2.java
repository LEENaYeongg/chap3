package chap3;
/*
 * 단항 연산자 : 논리부정 : !
 * false <= true
 * true <= false
 * 
 * 
 * */
public class OpEx2 {

	public static void main(String[] args) {

		System.out.println(true);
		System.out.println(!true);
		int x = 1000;
		
		System.out.println("(x<200) = " + (x<200)); //
		System.out.println("!(x<200)=" + !(x<200)); 
		System.out.println(" 1 != 1 =" + (1 != 1));
		System.out.println(" 1 != 2 =" + (1 != 2));
		
		
		
	}

}
