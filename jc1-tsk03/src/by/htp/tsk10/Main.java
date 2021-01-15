//	Даны действительные числа a1 , a2 , ..., a2n . Найти
//	max(a1 + a2n, a2 + a2n-1, ..., an + an+1);


package by.htp.tsk10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length/2];
		
		initA(a);
		printA(a);
		checkA(a,b);
		printA(b);
	}
	
	public static void initA(int[] a) {
		Random rand = new Random();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
		}
	}
	
	public static void printA(int[] a) {
		for(int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	public static void checkA(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i] + a[a.length-i-1];
		}
	}
}
