package com.section8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Question8_2 {

	public static void main(String[] args) throws FileNotFoundException {

		String file1 = "C:\\Users\\akshay.patil1\\Desktop\\Java Programs\\Java Project\\src\\even.txt";
		FileReader fileReader = new FileReader(file1);
		Scanner scanner = new Scanner(fileReader);
		while (scanner.hasNext()) {
			String str = scanner.next();
			int[] ar = new int[str.length()];
			for(int i=0;i<ar.length;i++) {
				ar[i] = (int)str.charAt(i);
				if(ar[i]%2==0) {
					System.out.println((char)ar[i]+"");
				}
			}

		}
		scanner.close();

	}

}
