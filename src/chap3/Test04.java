package chap3;
/*
 * �غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ���Ͻÿ�
 * */
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		System.out.println("�غ��� ������ ���̸� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //Ű����� ���ڸ� �Է¹޾� �غ��� ���̿� �������.
		Scanner scanb = new Scanner(System.in);
		int b = scanb.nextInt(); //Ű����� ���ڸ� �Է¹޾� ������ ���̿� �������.
		float c = (float)(a*b)/2;
		//float d = (float)(a*b/2);�� 17.0�� �����°�?
		//���� �߷��� �̹� a*b/2�� ����ó�� ������ ����ȯ�� �ؼ� �������� ���� ������ �׷� �� ����.
		
		
		System.out.println("�غ��� ���� : "+a);
		System.out.println("������ ���� : "+b);
		System.out.println("���� : "+ c);
		
	}

}
