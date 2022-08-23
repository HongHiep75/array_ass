package array_ass;

import java.util.Scanner;

//Nhập số liệu cho ma trận A(n*m)có các phần tử là các số nguyên. Hãy liệt kê trên màn hình tất cả các
//phần tử của ma trận nhưng theo thứ tự tăng dần từ trái qua phải, từ trên xuống dưới.
public class bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Nhập lại n");
			n = sc.nextInt();
		}
		System.out.println("Nhập m");
		int m = sc.nextInt();
		while (m <= 0) {
			System.out.println("Nhập lại m");
			m = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng:");
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sortMaTran(a, n, m);
	}

	private static void sortMaTran(int[][] a, int n, int m) {
		int[] mangNxM = mangSapXep(a, n, m);
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mangNxM[index] + " ");
				index++;
			}
			System.out.println();
		}

	}

	private static int[] mangSapXep(int[][] a, int n, int m) {
		int lenght = n * m;
		int[] b = new int[lenght];
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[index] = a[i][j];
				index++;
			}
		}
		return sort(b, lenght);
	}

	public static int[] sort(int[] a, int n) {
		boolean check;
		for (int i = 0; i < n - 1; i++) {
			check = true;
			for (int j = 1; j < n - i; j++) {
				if (a[j - 1] > a[j]) {
					int b = a[j];
					a[j] = a[j - 1];
					a[j - 1] = b;
					check = false;
				}
			}
			if (check) {
				return a;
			}
		}
		return a;
	}
}
