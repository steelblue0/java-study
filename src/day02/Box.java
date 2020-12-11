package day02;
import java.util.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("직사각형의 세로를 입력하세요: ");
		double w = input.nextInt();
		System.out.print("직사각형의 가로를 입력하세요: ");
		double h = input.nextInt();
		
		double area = w * h;
		double perimeter = ( w + h ) *2;
		
		System.out.println("직사각형의 면적은 " + area );
		System.out.println("직사각형의 둘레는 " + perimeter);
		
	}

}
