package chap3;

import java.util.Scanner;

/*
 * ����� ��� ���� ������� ���� ���ϱ�
 * 1���� ���ڿ� 10���� ����� ���� �� �ִٰ� �� �� �ʿ��� ������ ������ ����ϱ�
 * 
 * [���]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ����: 3��
 * 
 * ����� ������ �Է��ϼ���
 * 30
 * �ʿ��� ������ ���� : 3��
 * 
 * ===> �� ����
 * 		�Է¹��� ����� ���� 10���� ������ �������� 0�̸� �����/10�� ���� �ڽ��� ������ �ʿ��ϰ�
 * 		�������� 0�� �ƴϸ� ��+1 �� ������ �ʿ�.
 * 		�׷���.. ��� �� ������� ǥ���ؾ��ϳ�..
 * 
 * */
public class Exam6 {

	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();

		int mo= apple/10;
		int ma = apple/10+1;
		
		int box = (apple%10==0)?mo:ma;
		System.out.println("�ʿ��� ������ ����: " + box + "��");
		
		/*
		 * ������ ���
		 * 
		 * 1. System.out.println("�ʿ��� ������ ����: " + ((apple%10==0)?apple/10:apple/10 + 1) + "��");
		 * 2. System.out.println("�ʿ��� ������ ����: " + (apple/10 + ((apple%10==0)?0:1) + "��");
		 * 
		 * 
		 * */
	}

}
