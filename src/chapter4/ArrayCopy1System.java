package chapter4;

import java.util.Arrays;

public class ArrayCopy1System {
    /**
     * ʹ��System�����ṩ��arraycopy()����ʵ�����鸴��
     */
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		System.out.println("���ƿ�ʼ֮ǰarr2��Ԫ��Ϊ��");
		for(int i: arr2) {
			System.out.println(i);
		}
		//�������壺ԭ���飬ԭ�����ʼλ�ã�Ŀ�����飬Ŀ�������ʼλ�ã������ܳ���
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println();
		System.out.println("����֮��arr2��Ԫ��Ϊ��");
		for(int i: arr2) {
			System.out.println(i);
		}
		//Arrays.copyOf();
	}
}
