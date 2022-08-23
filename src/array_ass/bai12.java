package array_ass;

import java.util.Scanner;

//Nhập ma trận A là ma trận vuông cấp n. Thực hiện xoay ma trận một góc 90 độ ngược chiều kim đồng
//hồ. 
public class bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("Nhập lại n");
			n = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng:");
		int[][] a = new int[n][n];
		for(int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		a = nghichDao(a, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}	
			System.out.println();
		}
	}
	
	public static int[][] nghichDao(int[][] a,int n){
		int[][] b = new int[n][n];
		int[] mangDon;
		int index = n-1;
		for (int i = 0; i < n; i++) {
			mangDon = tachMaTran(a, i, n);
			for (int j = 0; j <n; j++) {
				b[j][i] = mangDon[index];
				index--;
			}
			index = n -1;
		}
	
		return b;
		
	}
	public static int[] tachMaTran(int a[][], int i, int n) {
		int[] b = new int[n];
		for (int j = 0; j < n; j++) {
			b[j] = a[i][j];
			
		}
		return b;
		
	}
	

}
