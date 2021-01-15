//	В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

package by.htp.tsk02;

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
			a[i] = rand.nextInt(10);
		}
	}
	
	public static void printA(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void check(int[] a) {
		int z = 0;
		for(int i : a) {
			if(i == 0) z++; 
		}
		
		if(z > 0) {
			int[] b = new int[z];
			int t = 0;
			for(int i = 0; i < a.length; i++) {
				if(a[i] == 0) {
					b[t] = i;
					t++;
				}
			}
			printA(b);
		}
		else {
			System.out.println("Массив а создан без нулей!");
		}
	}
}
