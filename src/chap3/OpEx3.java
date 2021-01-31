package chap3;
/* 
 * 단항 연산자 : 부호연산자 : +,-
 *  + : 현재 부호를 유지.
 *  - : 현재 부호를 변경.
 * 
 * */
public class OpEx3 {
	public static void main(String[] args) {
	
	int x = -10;
	System.out.println("+x = " + +x); //+x = -10 // 음수 그대로 유지.
	System.out.println("-x =" + -x); // -x =10 // - 했더니 양수로 바뀜.
	
	x=10;
	System.out.println("+x =" + +x); // +x = 10
	System.out.println("-x =" + -x);  // -x = -10
	
		
		
	}
}
