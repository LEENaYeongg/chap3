package chap3;

import java.util.Scanner;



/*
 * 12345 �ʰ� ��ð� ��� �������� ����ϱ�
 * [���]
 * xx�ð� xx�� xx��
 * 
 * ex)
 * 3600��
 * 1�ð� 0�� 0��
 * 
 * 12345�� = 205.75�� = 3.4291...�ð�
 * 3�ð�=10800��
 * 12345-10800=1545
 * 1545/60=25.75  ==> 25*60 =1500��
 * 1545-1500=45��
 * 
 */

public class Exam1 {

	public static void main(String[] args) {
/*	int second = 12345;
	
 �� ��: System.out.println(second/3600+ "�ð� " + (second%3600)/60+"�� " +(second%3600)%60+"��");

	int h = second/3600;
	int m = (second%3600)/60;
	int s = second % 60;
	
	System.out.println(h+"�ð�"+m+"��"+s+"��"); // 3�ð� 25�� 45��
*/
		
		//Ű���忡�� �Է� �޾� �ð� ���ϱ�
		System.out.println("����� �ʸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		// system.in : ǥ�� �Է�. Ű���� �Է�.
	
		int second=scan.nextInt();
		// �Է� ���� ���� second�� �ʱ�ȭ.
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second % 60;
		
		System.out.println(h+"�ð�"+m+"��"+s+"��");
		
	}

}
