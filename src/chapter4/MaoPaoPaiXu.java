package chapter4;

import java.util.Random;
import java.util.Scanner;

public class MaoPaoPaiXu {
    /**
     * 冒泡排序
     */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要排序的数据的个数：");
		int num = in.nextInt();
		int[] a = new int[num];
		Random r = new Random(47);
		for(int i = 0; i < num; i++) {
			a[i] = r.nextInt();
			System.out.println(a[i]);
		}
		int temp = 0;
		for(int i = 0; i < num - 1; i++) {
			for(int j = 0; j < num - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for( int b: a) {
			System.out.println(b);
		}
	}
}
