//	Дана последовательность действительных чисел а1 ,а2, ..., аn.
//	Заменить все ее члены, большие данного Z, этим числом.
//	Подсчитать количество замен.

package by.htp.tsk06;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		int Z = 50;
		
		initA(a);
		printA(a);
		ckeckA(a, Z);
		printA(a);
	}
	
	public static void initA(int[] a) {
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
	
	public static void ckeckA(int[] a, int Z) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] > Z) {
				a[i] = Z;
			}
		}
	}
}
