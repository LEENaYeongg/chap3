package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ���� "���", ������ ��� "����", 0�� ��� "��"�� ����ϱ�
 * 
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {

	System.out.println("���ڸ� �Է��ϼ���.");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	String result = (num>0)?"���":(num<0)?"����":"��";
	System.out.println(result);

	//¦������ Ȧ�� ����ϱ�
	
	String ga = (num%2==0)?"¦��":"Ȧ��";
	System.out.println(ga);
	
	
	}

}
