package day03;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("첫번째 정수: ");
		x = input.nextInt();
		
		System.out.print("두번째 정수: ");
		y = input.nextInt();
		
		if (x>y)
			System.out.println("큰 수는 "+ x);
		else
			System.out.println("큰 수는 "+ y);

		
	}

}
