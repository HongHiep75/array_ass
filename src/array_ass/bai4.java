package array_ass;

import java.util.Scanner;

// Nhập mảng (a, n) và nhập số X. Xác định vị trí của số nguyên tố trên a có giá trị gần với X nhất.
public class bai4 {
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
		int X = sc.nextInt(); 
		xacdinhViTriGanX(a, n, X);
	}
	
	public static void xacdinhViTriGanX(int[] a, int n, int x) {
		int min = -1;
		String soGanNhat = null ;
		for(int i = 0; i < n; i++) {
			if(kiemTraSoNguyenTo(a[i])) {
				int hieuHaiSo = Math.abs(x - a[i]);
				if(min == -1) {
					soGanNhat = a[i] +"";
					min = hieuHaiSo;
				}
				if(hieuHaiSo < min) {
					soGanNhat = a[i] +"";
					min = hieuHaiSo;
				}
			}	
		}
		
		if(min < 0) {
			System.out.println("Không có số nguyên tố");
		}else {
			System.out.println("Giá trị gần nhất " + soGanNhat);
		}
		

		
	}
	
	
	
	
	
	public static boolean kiemTraSoNguyenTo(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
