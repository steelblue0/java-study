package day03;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("ù��° ����: ");
		x = input.nextInt();
		
		System.out.print("�ι�° ����: ");
		y = input.nextInt();
		
		if (x>y)
			System.out.println("ū ���� "+ x);
		else
			System.out.println("ū ���� "+ y);

		
	}

}
