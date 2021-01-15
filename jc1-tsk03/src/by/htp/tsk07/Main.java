//	 Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

package by.htp.tsk07;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		initA(a);
		printA(a);
		checkA(a);
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
	
	public static void checkA(int[] a) {
		int max = a[0], min = a[0], nmax = 0, nmin = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				nmax = i;
			}
			if(min > a[i]) {
				min = a[i];
				nmin = i;
			}
		}
		
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		
		a[nmax] = min;
		a[nmin] = max;
	}
}
