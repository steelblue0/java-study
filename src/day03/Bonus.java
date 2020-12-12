package day03;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int targetSales = 1000;
		int mySales, bonus;
		String result;
		
		System.out.println("실적을 입력하세요(단위: 만원): ");
		mySales = input.nextInt();
		
		if (mySales>targetSales) {
			result = "실적 달성";
			bonus = (mySales - targetSales) / 10;
		} else {
			result = "실적 달성 못함";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "보너스: " + bonus);
	}

}
