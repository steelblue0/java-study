package day04;
import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��Ͻÿ�:");
		int STUDENTS = scan.nextInt();
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			scores[i] = scan.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++)
			total += scores[i];
			
		System.out.println("��� ������" + total/STUDENTS + "�Դϴ�");
	
	}

}
