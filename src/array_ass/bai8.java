package array_ass;

import java.util.Scanner;

//Viết chương trình tính tích 2 ma trận các số nguyên A cấp m*n và B cấp n*k.
public class bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập m");
		int m = sc.nextInt();
		while (m <= 0) {
			System.out.println("Nhập lại m");
			m = sc.nextInt();
		}
		System.out.println("Nhập n");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Nhập lại m");
			n = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng MxN:");
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Nhập k");
		int k = sc.nextInt();
		while (k <= 0) {
			System.out.println("Nhập lại k");
			m = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng Nxk:");
		int[][] b = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int[][] aNhanB = tichHaiMaTran(a, m,n, b,k);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(aNhanB[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static int[][] tichHaiMaTran(int[][] a, int m, int n, int[][] b, int k) {
		int[][] aNhanB = new int[m][k];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				aNhanB[i][j] = tongHangVaCot(a,n,b,i, j);
			}
		}
		return aNhanB;
	}

	private static int tongHangVaCot(int[][] a, int n, int[][] b, int i, int j) {
		  int tong = 0;
    	   for (int f = 0; f < n; f++) {
			tong+= a[i][f]*b[f][j];
		}
		return tong;
	}
}
//2
//3
//4
//1
//0
//0

//0
//1000
//1
//100
//0
//10
