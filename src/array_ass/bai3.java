package array_ass;

import java.util.Scanner;

//Nhập mảng (a, n) và đếm số lần xuất hiện của từng phần tử trong mảng, đồng thời cho biết phần tử có số
//lần xuất hiện nhiều nhất trong a.
public class bai3 {
	
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
		int max = sc.nextInt();
		a[0] = max;
		int so;
		for (int i = 1; i < n; i++) {
			so = sc.nextInt();
			if (so > max) {
				max = so;
			}
			a[i] = so;
		}
		int[] mangDem = new int[max + 1];
		mangDem = demSolap(a, n, mangDem);
		int soLanXuatHienMax = 0;

		for (int i = 0; i <= max; i++) {
			if (mangDem[i] != 0) {
				if(soLanXuatHienMax < mangDem[i]) {
				soLanXuatHienMax = mangDem[i];
				}
				System.out.println("Phần tử:" + i + " xuất hiện " + mangDem[i]);
			}
		}
		System.out.println("Phần tử xuất hiện nhiều nhất");
		for (int i = 0; i <= max; i++) {
			if (mangDem[i] == soLanXuatHienMax) {
				System.out.print( i + " ");
			}
		}
		System.out.print("xuất hiện " + soLanXuatHienMax + " lần");

	}

	public static int[] demSolap(int[] a, int n, int[] mangDem) {
		for (int i = 0; i < n; i++) {
			int index = a[i];
			mangDem[index]++;
		}
		return mangDem;

	}

}
