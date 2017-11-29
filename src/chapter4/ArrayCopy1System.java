package chapter4;

import java.util.Arrays;

public class ArrayCopy1System {
    /**
     * 使用System类所提供的arraycopy()方法实现数组复制
     */
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		System.out.println("复制开始之前arr2中元素为：");
		for(int i: arr2) {
			System.out.println(i);
		}
		//参数意义：原数组，原数组初始位置，目的数组，目的数组初始位置，复制总长度
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println();
		System.out.println("复制之后arr2中元素为：");
		for(int i: arr2) {
			System.out.println(i);
		}
		//Arrays.copyOf();
	}
}
