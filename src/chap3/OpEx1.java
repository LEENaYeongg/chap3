package chap3;
/*
 * 단항 연산자 : 증감연산자 : ++, --
 * ++ : 숫자의 값을 1씩 증가
 * -- : 숫자의 값을 1씩 감소
 * 
 * 
 * 
 * */
public class OpEx1 {
	public static void main(String[] args) {
		int x =5, y=5;
		x++; //6 // 오른쪽에 존재하므로 후위형
		y--;
		System.out.println("x="+x+",y="+y); // x=6, y=4
		++x; //7 // 왼쪽에 존재하므로 전위형
		--y; //3
		System.out.println("x="+x+",y="+y); // x=7, y=3

		x=y=5;
		y=++x; // 대입연산자 오른쪽에서 왼쪽으로 실행 그래서 x의 값이 1 증가, 증가된 값을 y에 대입.
		System.out.println("x="+x+",y="+y); //x=6, y=6
		
		x=y=5;
		y=x++; // x의 값이 y로 들어가는게 먼저 그래서 y=5, 그런 다음 x의 값을 1 증가. 
		//++이 앞에 붙어있을 때는 가장 우선순위가 높고, 뒤에 붙어있을 때는 가장 우선순위가 낮다.
		System.out.println("x="+x+",y="+y); // x=6, y=5
		//system.out.println : 표준 출력 객체. 콘솔 출력 객체

		x=5;
		System.out.println("x=" + x++); //x=5 // 화면에는 5로 출력, 그러고 1 더해서 6으로 바뀜.
		System.out.println("x=" + ++x); //x=7 // 1 더해서 7로 만들고 그 값을 출력.
		// ++이 앞에 붙어있냐 뒤에 붙어있냐에 따라서 결과가 달라진다. 먼저 출력을 하냐! 더하냐! 
		
	}

}
