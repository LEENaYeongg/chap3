package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ݾ��Է¹޾Ƽ� 500,100,50,10,1�� �������� �ٲٱ�.
 * �ʿ��� ������ ���� ���.
 * [���]
 * �ݾ��� �Է��ϼ���.
 * 5641
 * 500�� : 11��
 * 100�� : 1��
 * 50�� : 0��
 * 10�� : 4��
 * 1�� : 1��
 * 
 * */
public class Exam3 {

	public static void main(String[] args) {

		
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int coin = scan.nextInt(); //Ű����� ���ڸ� �Է¹޾� coin�� �������.
		
		int a = coin/500;
		int b = (coin%500)/100;
		int c = ((coin%500)/100)/50;
		int d = (coin%100) / 10;
		int e = coin % 10;
		
		/* <������ ��>
		 * System.out.println("500�� : "+ (coin/500) +"��"); //���� �� ������ 500
		 * System.out.println("100�� : "+ (coin%500)/100 +"��"); //500���� ���� ���� �ٽ� 100���� ������ ��
		 * System.out.println("50�� : "+ (coin%100)/50 +"��"); 
		 * //���� ���� ���������� 50���� ������ ���������α׷� �� �� ���� 100���� ���� �������� ����.
		 * System.out.println("10�� : "+ (coin%50)/10 +"��");
		 * System.out.println("1�� : "+ (coin%10) +"��");
		 * 
		 * 
		 * */
		
		System.out.println("500�� : "+a+"��");
		System.out.println("100�� : "+b+"��");
		System.out.println("50�� : "+c+"��");
		System.out.println("10�� : "+d+"��");
		System.out.println("1�� : "+e+"��");
		
	}

}
