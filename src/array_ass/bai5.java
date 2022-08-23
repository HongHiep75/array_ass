package array_ass;

import java.util.Scanner;

//Nhập 2 mảng (a, n) và (b, m) và số nguyên p (0 ≤ p < n). Hãy chèn mảng b vào vị trí p của a.
public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Nhập lại n");
			n = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng:");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		// nhap bang b
		System.out.println("Nhập m");
		int m = sc.nextInt();
		while (m <= 0) {
			System.out.println("Nhập lại n");
			n = sc.nextInt();
		}
		System.out.println("Nhập phần tử mảng:");
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		System.out.println("Nhập p");
		int p = sc.nextInt();
		while (p < 0 || p > n) {
			System.out.println("Nhập lại p (p < n)");
			p = sc.nextInt();
		}
		int lenght = n + m;
		System.out.println("Mang a sau khi ghep");
		a = ganMang(a, n, b, m, p, lenght);
		for (int i = 0; i < lenght; i++) {
			System.out.print(a[i]);
		}
	}

	public static int[] ganMang(int[] a, int n, int[] b, int m, int p, int lenght) {
		int indexA = 0;
		int[] c = new int[lenght];
		for (int i = 0; i < lenght;) {
			if (i == p) {
				for (int j = 0; j < m; j++) {
					c[i] = b[j];
					i++;
				}
			} else {
				c[i] = a[indexA];
				indexA++;
				i++;
			}

		}
		return c;
	}

}
