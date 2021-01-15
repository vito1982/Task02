//	Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых а i > i.

package by.htp.tsk08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[20];
		
		initA(a);
		printA(a);
		checkA(a);

	}
	
	public static void initA(int[] a) {
		Random rand = new Random();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(20);
		}
	}
	
	public static void printA(int[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void checkA(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] > i+1) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
