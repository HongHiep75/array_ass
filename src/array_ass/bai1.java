package array_ass;

import java.util.Scanner;
//Nhập mảng (a, n) và kiểm tra mảng a có phải là mảng đối xứng hay không. Ví dụ: [15 2 1 2 15] là
//mảng đối xứng.

public class bai1 {
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
		if(ckeckMangDoiXung(a, n)) {
			System.out.println("mảng đối xứng");
		}else {
			System.out.println("mảng không đối xứng");
		}
		
		
	}
	
	public static boolean ckeckMangDoiXung(int a[],int n) {
		int h = 0;
		int k = n - 1;
		while (h <= k) {
		if(a[h] != a[k]) {
			return false;
		}
			h++;
			k--;
		}
		return true;
	}
	
}
