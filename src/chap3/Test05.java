package chap3;

import java.util.Scanner;

/*
 * �������� �Է¹޾� ���� �ѷ��� ������ ���Ͻÿ�.
 * 
 * 
 * */
public class Test05 {

	public static void main(String[] args) {

		System.out.println("�������� ���̸� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //Ű����� ���ڸ� �Է¹޾� ������ ���̿� �������.
		
		System.out.println("������ : "+a);
		System.out.println("���� : "+3.141592*a*a);
		System.out.println("�ѷ� : "+2*3.141592*a);
		
		/* ������ ���
		 * 
		 * double pi = 3.141592
		 * System.out.println("�������� ���̸� �Է��ϼ���.");
		 * Scanner scan = new Scanner(System.in);
		 * int r = scan.nextInt();
		 * 
		 * ==> ���̰��� ������ ���� �� ����� ���.
		 * 
		 * */
	}

}
