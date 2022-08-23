package array_ass;

import java.util.Scanner;

//Nhập mảng (a, n). Xác định đường chạy dài nhất, xuất lên màn hình vị trí phần tử đầu tiên và độ dài của
//đường chạy đó. Đường chạy là một dãy liên tiếp các phần tử không giảm của dãy ban đầu.
public class bai7 {
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
		timDuongChayDai(a, n);
	}
	public static void timDuongChayDai(int[]a, int n) {
		int max = 1;
		int min = 1;
		int viTri = 0;
		for(int i = 0; i < n; i++) {
			min = 1;
			for (int j = i; j < n -1; j++) {
				if(a[j] < a[j+1]) {
					min++;	
				}else {
					break;
				}
			}
			if(min > max) {
				max = min;
				viTri = i;	
			}
		}
		System.out.println("Đường chạy dài nhất ở vị trí  " + viTri  + " với độ dài là " + max);
	}
}
