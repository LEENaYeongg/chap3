package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է¹޾� 100 �ڸ� �̸��� ������ ����ϱ�
 * [���]
 * ���ڸ� ������ �Է��ϼ���
 * 321
 * 300
 * 
 * 1. Ű����� �Է¹޴´�.
 * 2. 
 * 
 * */

public class Exam2 {

	public static void main(String[] args) {

		System.out.println("���ڸ� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println(a-a%100); // ���1
		System.out.println(a/100 * 100); // ���2

		
	}

}
