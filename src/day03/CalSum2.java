package day03;
import java.util.*;

public class CalSum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, o;
		int sum = 0;
		System.out.print("어디부터 더할까요?: ");
		i = scan.nextInt();
		System.out.print("어디까지 더할까요?: ");
		o = scan.nextInt();
		
		while(i<=o) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("합계= " + sum);
	}

}
