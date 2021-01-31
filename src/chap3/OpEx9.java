package chap3;
/*
 * 대입 연산자 : =, +=, -=, *= ...
 * 
 * lvalue = rvalue
 * lvalue는 반드시 변수만 가능
 * rvalue는 변수, 상수, 리터널, 수식
 * rvalue의 결과를 lvalue의 값으로 대입.
 * 
 * */
public class OpEx9 {

	public static void main(String[] args) {
		int num = 100;
		
		System.out.println(num);
		
		num += 10; //num = num+10 ==> 옆에 쓴 해설이 완벽하게 같은 것은 아니고 대략적으로 저렇게 풀이된다는 의미.
		System.out.println(num);
		
		num /= 10; //num = num/10 
		System.out.println(num);
		
		num *= 2 + 3; //num = num * (2+3)
		System.out.println(num);
		
		num -= 2 + 3; //num = num - (2+3)
		System.out.println(num);
		
		byte b =1;
		b *=2;
		b = (byte)(b * 2);
		// b = b * 2; ==> 에러나는 이유 : int보다 작은 단위의 연산을 하면 int다.
		// 에러를 안나게 하려면 바이트로 형변환.
		
		
		System.out.println(b);
		
	}

}
