package chap3;

import java.util.Scanner;

/*
 * ���׿����� : ���ǿ����� => ���ǹ����� ���� ����.
 * (���ǽ�)?��:����
 * 
 * ���ǽ� : ����� �ݵ�� boolean
 * 
 * 
 * */
public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); // nextInt() : ������ �Է¹ޱ�.
									// next() : ���ڿ� �Է¹ޱ�.
									// nextdouble() : �Ǽ��� �Է¹ޱ�.
		System.out.println(((score>=60)?"�հ�":"���հ�")+"�Դϴ�."); //�հ�,���հ� ���
		
		//70�� �̻��� ��� �հݰ������� ���
		// 60�� ���� ��� ����� ���
		//60�� �̸��� ��� ���հ�
		
		String result = (score>=70)?"�հݰ���":(score>=60)?"�������":"���հ�";
		System.out.println(score + "����" +result + "�Դϴ�.");
	}

}
