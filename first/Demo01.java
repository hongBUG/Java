package com.first;
import java.util.Scanner;
/*
 * ��ϰʹ��scanner��
 * 1.����java.util.Scanner
 * 2.����Scanner����
 * 3.���ܲ������û������ֵ
 */
public class Demo01 {
	public static void main(String[] args){
		int score,count=0;
		Scanner input=new Scanner(System.in);
		System.out.print("�����뿼�Գɼ�:");
		score=input.nextInt();//��ȡ�û��ɼ��ձ����ڱ�����
		System.out.println(score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("�ӷֺ�ɼ���"+score);
		System.out.println("������"+count+"�Σ�");
		
	}
}
