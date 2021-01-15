//	ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем отрицательных,
//	положительных и нулевых элементов.

package by.htp.tsk09;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int N = 20;
		int[] a = new int[N];
		
		initA(a);
		checkA(a);
		
	}
	
	public static void initA(int[] a) {
		Random rand = new Random();
		int t, x;
		
		for(int i = 0; i < a.length; i++) {
			t = rand.nextInt(2);
			x = rand.nextInt(10);
			if(t == 0) {
				a[i] = -x;
			} else {
				a[i] = x;
			}
		}
	}
	
	public static void checkA(int[] a) {
		int p = 0, o = 0, z = 0;
		
		for(int i : a) {
			if(i > 0) {
				p++;
			} else if(i < 0) {
				o++;
			} else {
				z++;
			}
		}
		
		System.out.println(" оличество положительных чисел = " + p);
		System.out.println(" оличество отрицательных чисел = " + o);
		System.out.println(" оличество чисел равных нулю = " + z);
	}

}
