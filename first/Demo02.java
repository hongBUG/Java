package com.first;
import java.util.Scanner;
/*
 * 实现接受三个班级 各四名学生的成绩信息，然后计算各个班级的平均分
 * 知识点：二重循环，外层循环控制班级数量，内存循环控制每个班级的学员数量
 */
public class Demo02 {
	public static void main(String[] args) {
		int classNum=3;//班级数量
		int stuNum=4;//学生数量
		double avg=0;//成绩平均分
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++){
			double sum=0;//成绩总和
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int j=1;j<=stuNum;j++){
				System.out.println("请输入第"+j+"个学生的成绩:");
				int score=input.nextInt();
				sum+=score;
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级的平均分为"+avg);
		}
	}
}
 