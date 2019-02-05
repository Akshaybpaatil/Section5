package com.section8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFile {

	public static void main(String[] args) throws IOException {

		String file1 = "C:\\Users\\akshay.patil1\\Desktop\\Java Programs\\input1.txt";
		String file2 = "C:\\Users\\akshay.patil1\\Desktop\\Java Programs\\output2.txt";
		
		FileReader fileReader = new FileReader(file1);
		FileWriter fileWriter = new FileWriter(file2,true);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String data;
		while((data = bufferedReader.readLine()) !=null) {
			
			String[] words = data.split(" ");
			for (String str : words) {
				StringBuilder builder = new StringBuilder(str);
				String temp = builder.reverse().toString();
				System.out.println(temp);
				bufferedWriter.write(temp);
				
			}
			
		}
		bufferedWriter.close();
		fileWriter.close();

	}

}
