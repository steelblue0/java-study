package day03;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int targetSales = 1000;
		int mySales, bonus;
		String result;
		
		System.out.println("������ �Է��ϼ���(����: ����): ");
		mySales = input.nextInt();
		
		if (mySales>targetSales) {
			result = "���� �޼�";
			bonus = (mySales - targetSales) / 10;
		} else {
			result = "���� �޼� ����";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "���ʽ�: " + bonus);
	}

}
