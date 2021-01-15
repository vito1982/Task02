//	Дана последовательность чисел а1 ,а2 , ... , аn .
//	Указать наименьшую длину числовой оси, содержащую все эти числа.

package by.htp.tsk05;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		initA(a);
		printA(a);
		checkA(a);
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
	
	public static void checkA(int[] a) {
		int max = a[0], min = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		System.out.println("наименьшая длина числовой оси: " + (max - min));
	}
}
