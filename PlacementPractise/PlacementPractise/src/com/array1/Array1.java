package com.array1;

public class Array1 {

	public static void main(String[] args) {
		int r[]= {10,20};
		r[1]=30;
		r[1]=60;
		for (int i : r) {
			System.out.println(i);
		}
		for(int i=0;i<=r.length-1;i++) {
			System.out.println(r[i]);
		}

	}

}
