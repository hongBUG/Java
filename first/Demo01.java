package com.first;
import java.util.Scanner;
/*
 * 练习使用scanner类
 * 1.导入java.util.Scanner
 * 2.创建Scanner对象
 * 3.接受并保存用户输入的值
 */
public class Demo01 {
	public static void main(String[] args){
		int score,count=0;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入考试成绩:");
		score=input.nextInt();//获取用户成绩幷保存在变量中
		System.out.println(score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分后成绩："+score);
		System.out.println("共加了"+count+"次！");
		
	}
}
