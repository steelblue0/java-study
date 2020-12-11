package day02;
import java.util.*;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double area;
		double radius;
		
		System.out.print("반지름을 입력하세요: ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}
