package day02;
import java.util.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("���簢���� ���θ� �Է��ϼ���: ");
		double w = input.nextInt();
		System.out.print("���簢���� ���θ� �Է��ϼ���: ");
		double h = input.nextInt();
		
		double area = w * h;
		double perimeter = ( w + h ) *2;
		
		System.out.println("���簢���� ������ " + area );
		System.out.println("���簢���� �ѷ��� " + perimeter);
		
	}

}
