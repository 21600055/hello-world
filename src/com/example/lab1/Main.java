package com.example.lab1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.print("이름 입력 : ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.print("["+name+"]");
		s.close();
	}
}
