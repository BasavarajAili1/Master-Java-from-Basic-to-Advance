package com.propel.practice;

public class BitmapHoles1 {

	public static void main(String[] args) {
		String[] input1 = {"10111", "10101", "11101", "11111"};
		String[] input2 = {"01111", "01101", "00011", "11110"};
		String[] input3 = {"1011", "0010"};

		int out1 = bitmapHoles(input1);
		int out2 = bitmapHoles(input2);
		int out3 = bitmapHoles(input3);
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
	}

	private static int bitmapHoles(String[] strArr) {
		int rows = strArr.length;
		int cols = strArr[0].length();
		int[][] bitmap = new int[rows][cols];
		
		// convert char to int
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				bitmap[i][j] = Integer.parseInt(""+strArr[i].charAt(j));
			}
		}
		
		int holeCount = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(bitmap[i][j] == 0) {
					holeCount++;
					fillHole(bitmap, i, j);
				}
			}
		}
		
		
		
		return holeCount;
	}
	
	public static void fillHole(int[][] bitmap, int row, int col) {
		if(row < 0 || row >= bitmap.length || col<0 || col >= bitmap[0].length || bitmap[row][col] != 0) {
			return;
		}
		
		bitmap[row][col] = 1;
		fillHole(bitmap, row-1, col);
		fillHole(bitmap, row+1, col);
		fillHole(bitmap, row, col-1);
		fillHole(bitmap, row, col+1);
	}

}