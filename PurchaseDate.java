package com.assignement.section3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PurchaseDate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the purchase Date:");
		String Date = scanner.nextLine();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate pdate = LocalDate.parse(Date, dateTimeFormatter);
		System.out.println("Enter the Warrenty month:");
		int month=scanner.nextInt();
		System.out.println("Enter the Warrenty year:");
		int year=scanner.nextInt();
		LocalDate p1=pdate.plusMonths(month);
		LocalDate p2=p1.plusYears(year);
		System.out.println(p2);
		
		
		

	}

}
