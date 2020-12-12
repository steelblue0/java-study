package day03;
import java.util.*;


public class Dice {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주사위를 굴립니다.");
		int num = generator.nextInt(6)+1;
		System.out.println(num);
		
	}

}
