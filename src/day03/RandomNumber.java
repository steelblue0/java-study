package day03;
import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수: ");
		int count = scan.nextInt();
		int sum = 0;
		
		for (int i = 0; i<count; i++) {
			int number = generator.nextInt(100);
			sum += number;
		}
		
		System.out.print("난수"+count+"개의 합은"+ sum);
	}

}
