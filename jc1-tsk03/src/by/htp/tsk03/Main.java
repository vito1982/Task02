//	���� ������������������ �������������� ����� � 1 � 2 ,..., � n . ��������, ����� �� ��� ������������.

package by.htp.tsk03;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,7,6};
		int c = 0;
		
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] < a[i+1]) {
				c = 1;
			}else {
				c = 0;
				break;
			}
		}
		
		if(c == 1) {
			System.out.println("������ ������������!");
		}else {
			System.out.println("������ �� ������������!");
		}
	}

}
