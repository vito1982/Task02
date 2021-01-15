//	В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package by.htp.tsk01;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] A = new int[10];
		int K = 4;
		
		init(A);
		printA(A);	
		krat(A, K);
	}
	
	public static void init(int[] A) {
		Random rand = new Random();
		
		for(int i = 0; i < A.length; i++) {
			A[i] = rand.nextInt(100);
		}
	}
	
	public static void printA(int[] A) {
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	public static void krat(int[] A, int K) {
		int sum = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i]%K == 0) {
				sum += A[i];
			}
		}
		System.out.println("Сумма элементов: " + sum);
	}
}
