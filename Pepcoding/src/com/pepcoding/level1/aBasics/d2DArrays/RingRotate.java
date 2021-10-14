package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class RingRotate {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] arr = new int[n][m];

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		int s = scn.nextInt();
		int r = scn.nextInt();

		ringRotate(arr,s,r);

		scn.close();
	}

	public static void ringRotate(int[][] twod, int s, int r) {

		int[] oned = getOnedShellFromTwod(twod, s);
		oned = rotate(oned, r);
		fillTwodShellFromOned(oned, twod, s);
		display(twod);
	}

	public static int[] getOnedShellFromTwod(int[][] twod, int s) {

		int rows = twod.length;
		int cols = twod[0].length;

		int minr = s-1;
		int minc = s-1;
		int maxr = rows - s;
		int maxc = cols - s;

		int size = 2 * (maxr - minr + maxc - minc);

		int[] oned = new int[size];
		int idx = 0;

		// left wall | col fix at minc, row = minr -> maxr
		for(int i=minr, j=minc; i<=maxr; i++) {
			oned[idx] = twod[i][j];
			idx++;
		}
		minc++;

		// bottom wall | row fix at maxr, col = minc -> maxc
		for(int i=maxr, j=minc; j<=maxc; j++) {
			oned[idx] = twod[i][j];
			idx++;
		}
		maxr--;

		// right wall | col fix at maxc, row = maxr -> minr
		for(int i=maxr, j=maxc; i>=minr; i--) {
			oned[idx] = twod[i][j];
			idx++;
		}
		maxc--;

		// top wall | row fix at minr, col = maxc -> minc
		for(int i=minr, j=maxc; j>=minc; j--) {
			oned[idx] = twod[i][j];
			idx++;
		}
		minr++;

		return oned;
	}

	public static int[] rotate(int[] oned, int r) {

		r %= oned.length;
		if(r<0)
			r += oned.length;

		reverse(oned, 0, oned.length-r-1);
		reverse(oned, oned.length-r, oned.length-1);
		reverse(oned, 0, oned.length-1);

		return oned;

	}

	public static void reverse(int[] oned, int left, int right) {

		while(left<right) {
			int temp = oned[left];
			oned[left] = oned[right];
			oned[right] = temp;

			left++; right--;
		}
	}

	public static void fillTwodShellFromOned(int[] oned, int[][] twod, int s) {

		int rows = twod.length;
		int cols = twod[0].length;

		int minr = s-1;
		int minc = s-1;
		int maxr = rows - s;
		int maxc = cols - s;

		//	int size = 2 * (maxr - minr + maxc - minc);

		//	int[] oned = new int[size];
		int idx = 0;

		// left wall | col fix at minc, row = minr -> maxr
		for(int i=minr, j=minc; i<=maxr; i++) {
			twod[i][j] = oned[idx];
			idx++;
		}
		minc++;

		// bottom wall | row fix at maxr, col = minc -> maxc
		for(int i=maxr, j=minc; j<=maxc; j++) {
			twod[i][j] = oned[idx];
			idx++;
		}
		maxr--;

		// right wall | col fix at maxc, row = maxr -> minr
		for(int i=maxr, j=maxc; i>=minr; i--) {
			twod[i][j] = oned[idx];
			idx++;
		}
		maxc--;

		// top wall | row fix at minr, col = maxc -> minc
		for(int i=minr, j=maxc; j>=minc; j--) {
			twod[i][j] = oned[idx];
			idx++;
		}
		minr++;
	}

	public static void display(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
