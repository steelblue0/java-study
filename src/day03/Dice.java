package day03;
import java.util.*;


public class Dice {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ֻ����� �����ϴ�.");
		int num = generator.nextInt(6)+1;
		System.out.println(num);
		
	}

}
