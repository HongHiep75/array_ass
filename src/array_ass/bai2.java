package array_ass;

import java.lang.reflect.Array;
import java.util.Scanner;

//2. Nhập mảng (a, n) và sắp xếp theo thứ tự tăng dần.
public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("Nhập lại n");
			n = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng:");
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
	  a = sort(a, n);
	  System.out.println("Mảng đã sắp xếp");
	  for(int i = 0; i < n; i++) {
		  System.out.print(a[i] + " ");
	  }
	}
	
	public static int[] sort(int[] a,int n) {
		boolean check;
		for(int i = 0; i < n -1; i++) {
			check = true;
			for(int j = 1; j < n -i; j++) {
				if(a[j - 1] > a[j]) {
					int b = a[j];
					a[j] = a[j-1];
					a[j-1] = b;
					check = false;
				}
			}
			if(check) {
				return a;
			}
		}		
		return a;	
	}
}
