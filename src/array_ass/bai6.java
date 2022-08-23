package array_ass;

import java.util.Scanner;

//Nhập mảng (a, n) và một giá trị thực x. Sắp xếp mảng a theo thứ tự tăng dần. Sau đó chèn giá trị x vào
//dãy a sao cho vẫn giữ được tính sắp xếp của mảng.
public class bai6 {
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
		System.out.println("Nhập X");
		int x = sc.nextInt();
		int m = n+1;
		System.out.println("Mang sau khi them:");
		int[] b = themGiaTri(a, n, x, m);
		for (int i = 0; i < m; i++) {
			System.out.print(b[i] + " ");
		}
	}
	
	public static int[] themGiaTri(int[]a, int n, int x, int m) {
		int[] b = new int[m];
		 a = sort(a,n);
		 for(int i = 0; i< n; i++) {
			 b[i] = a[i];
		 }
		 b[m-1] = x;
	
		 b = sort(b,m);
		return b;
		
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
