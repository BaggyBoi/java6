package lesson6;

import java.util.Arrays; 
import java.util.Random;
public class Lesson6 {
	public static void main(String[] args) {
		System.out.println("Searching for index by value");
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(array1, 4);
		System.out.println(index);
		

		System.out.println("Sorting");
		int [] array2 = {5,456,123,36,65,123,420,71,23,437,585};
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		

		System.out.println("Setting every element to 10");
		int [] array3 = {1,2,3,4,5};
		for (int i = 0; i < array3.length; i++) {
			array3[i] = 10;
		}
		System.out.println(Arrays.toString(array3));
		


		System.out.println("Getting random numbers between 1 and 6 (1 and 6 included)");
		Random random = new Random();	
		System.out.println(random.nextInt(6)+1);
		
		
//		two dimensional array
		System.out.println("Printing out every element in a 2d array");
		int [][] array4 = new int [3][3];
		array4[0][0] = 1;
		array4[0][1] = 2;
		array4[0][2] = 3;
		array4[1][0] = 4;
		array4[1][1] = 5;
		array4[1][2] = 6;
		array4[2][0] = 7;
		array4[2][1] = 8;
		array4[2][2] = 9;
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				System.out.println(array4[i][j]);
			}
		}
//		four dimensional array
		System.out.println("Printing out every element in a 4d array");
		int [][][][] array5 = new int [2][2][2][2];
		array5[0][0][0][0] = 1;
		array5[0][0][0][1] = 2;
		array5[0][0][1][0] = 3;
		array5[0][0][1][1] = 4;
		array5[0][1][0][0] = 5;
		array5[0][1][0][1] = 6;
		array5[0][1][1][0] = 7;
		array5[0][1][1][1] = 8;
		array5[1][0][0][0] = 9;
		array5[1][0][0][1] = 10;
		array5[1][0][1][0] = 11;
		array5[1][0][1][1] = 12;
		array5[1][1][0][0] = 13;
		array5[1][1][0][1] = 14;
		array5[1][1][1][0] = 15;
		array5[1][1][1][1] = 16;
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5[i].length; j++) {
				for (int j2 = 0; j2 < array5[i][j].length; j2++) {
					for (int k = 0; k < array5[i][j2].length; k++) {
						System.out.println(array5[i][j][j2][k]);
					}
				}
			}
		}
	}
}
