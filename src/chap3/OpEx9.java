package chap3;
/*
 * ���� ������ : =, +=, -=, *= ...
 * 
 * lvalue = rvalue
 * lvalue�� �ݵ�� ������ ����
 * rvalue�� ����, ���, ���ͳ�, ����
 * rvalue�� ����� lvalue�� ������ ����.
 * 
 * */
public class OpEx9 {

	public static void main(String[] args) {
		int num = 100;
		
		System.out.println(num);
		
		num += 10; //num = num+10 ==> ���� �� �ؼ��� �Ϻ��ϰ� ���� ���� �ƴϰ� �뷫������ ������ Ǯ�̵ȴٴ� �ǹ�.
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
		// b = b * 2; ==> �������� ���� : int���� ���� ������ ������ �ϸ� int��.
		// ������ �ȳ��� �Ϸ��� ����Ʈ�� ����ȯ.
		
		
		System.out.println(b);
		
	}

}
