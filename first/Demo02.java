package com.first;
import java.util.Scanner;
/*
 * ʵ�ֽ��������༶ ������ѧ���ĳɼ���Ϣ��Ȼ���������༶��ƽ����
 * ֪ʶ�㣺����ѭ�������ѭ�����ư༶�������ڴ�ѭ������ÿ���༶��ѧԱ����
 */
public class Demo02 {
	public static void main(String[] args) {
		int classNum=3;//�༶����
		int stuNum=4;//ѧ������
		double avg=0;//�ɼ�ƽ����
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++){
			double sum=0;//�ɼ��ܺ�
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int j=1;j<=stuNum;j++){
				System.out.println("�������"+j+"��ѧ���ĳɼ�:");
				int score=input.nextInt();
				sum+=score;
			}
			avg=sum/stuNum;
			System.out.println("��"+i+"���༶��ƽ����Ϊ"+avg);
		}
	}
}
 