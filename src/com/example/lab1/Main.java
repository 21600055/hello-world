package com.example.lab1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.print("�̸� �Է� : ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.print("["+name+"]�� ȯ���մϴ�~");
		s.close();
	}
}
