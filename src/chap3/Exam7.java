package chap3;

import java.util.Scanner;

/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Էµ� ������ ũ�ų� ���� 	10�� ����� ���ϱ�
 * 10�� ������� �Էµ� ���� ������ ����ϱ�
 * [���]
 * 10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���
 * 24
 * 6	:	30 - 24
 * 
 * 10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���
 * 20
 * 0	:	20 - 20
 * 
 * */
public class Exam7 {

	public static void main(String[] args) {
		
		System.out.println("10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result = (num%10==0)?num:num/10 * 10 + 10;
		
		System.out.println(result+"-"+num+"="+ (result-num));
		
		
		/*
		 * ������ ��
		 * 
		 * int num10 = (num%10==0)?num:(num/10 +1)*10);
		 * System.out.println(num10 + "-" + num + "=" +(num10 - num));
		 * 
		 * 
		 * */
		
		
		
		
	}

}