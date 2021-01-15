//	���� ������������������ ����������� ����� �1, �2, ... , �n .
//	������� ������ �� ������ ����� ���� ������������������.
//	���� ����� ����� ���, �� ������� ��������� �� ���� �����.

package by.htp.tsk04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		init(a);
		printA(a);
		check(a);
	}
	
	public static void init(int[] a) {
		Random rand = new Random();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
	}
	
	public static void printA(int[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void check(int[] a) {
		int k = 0;
		
		for(int i : a) {
			if(i%2 == 0) {
				k++;
			}
		}
		
		if(k > 0) {
			int[] b = new int[k];
			int t = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j]%2 == 0) {
					b[t] = a[j];
					t++;
				}
			}
			printA(b);
		} else {
			System.out.println("������ ���!");
		}
	}

}
