        // Let us create different types of arrays and
        // print their contents using Arrays.toString()

package arraytostring;

import java.util.Arrays;

public class ArraytoStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] boolArr = new boolean[] {true,false,false,true};
		
		char[] charArr = new char[] {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
		
		Object[] objArr = new Object[] {1, 2, 3, 4}; 
		
		System.out.println("boolean array: " + Arrays.toString(boolArr));
		System.out.println("character array: " + Arrays.toString(charArr));
		System.out.println("object array: " + Arrays.toString(objArr));
	}

}
