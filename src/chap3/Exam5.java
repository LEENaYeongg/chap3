package chap3;

import java.util.Scanner;

/* �Ѱ��� ���ڸ� �Է¹޾Ƽ� �ҹ����� ���� �빮�ڷ� �����ϱ�. (�ҹ��� �빮�ڸ� ��� ǥ���ؾ� �ұ�?)
 * �� �ҹ��ڰ� �ƴ� ��� " �ҹ��ھƴ�" ����ϱ�
 * Scanner Ŭ������ next() �޼��� �̿�
 * String Ŭ������ charAt(0) �޼��� �̿�
 * [���]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * a
 * A
 * 
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * A
 * �ҹ��� �ƴ�
 * 
 * 
 * */
public class Exam5 {

	public static void main(String[] args) {
		
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String in = scan.next(); // 
		char ch = in.charAt(0); // �Է¹��� ���ڿ�
		// char ch = scan.next().charAt(0); ==> �̷��� ���� ��.
	
		String result = (ch>='a' && ch<='z')?(char)(ch-32)+"":"�ҹ��� �ƴ�";
		System.out.println(result);
		System.out.println((ch>='a' && ch<='z')?(char)(ch-32):"�ҹ��� �ƴ�"); //==> �ٷ� ó������.
		
	}

}
