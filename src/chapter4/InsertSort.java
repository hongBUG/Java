package chapter4;

import java.util.Random;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要排序的数据的个数：");
		int num = in.nextInt();
		int[] a = new int[num];
		Random r = new Random(47);
		for(int i = 0; i < num; i++) {
			a[i] = r.nextInt();
			System.out.println(a[i]);
		}
		int j =0;
		for(int i = 1; i < num; i++) {
			int k=a[i];
			for( j = i - 1; j >= 0 && k < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j+1] = k;
		}
		for( int b: a) {
			System.out.println(b);
		}
	}

}
