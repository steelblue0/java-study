package day04;
import java.util.*;

public class StudyCafeReserve {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	final int size = 10;
	int[] seats1 = new int[size];
	int[] seats2 = new int[size];
	int[] seats3 = new int[size];
	
	while(true) {
		System.out.println("-----���͵��� �¼� ����ý���-----");
		System.out.print("\n �Խ��� �� ��ȣ�� �Է��ϼ���(1, 2, 3)(����:0):");
		int s1 = scan.nextInt();
		if (s1 == 0)
			break;
		if (s1 == 1) {
			System.out.println("1���� �¼����� ��Ȳ�Դϴ�.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats1[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("�¼� ��ȣ�� �Է����ּ���");
			int a = scan.nextInt();
			if (seats1[a-1]==0) {
				seats1[a-1]=1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
		if (s1 == 2) {
			System.out.println("2���� �¼����� ��Ȳ�Դϴ�.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats2[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("�¼� ��ȣ�� �Է����ּ���");
			int a = scan.nextInt();
			if (seats2[a-1]==0) {
				seats2[a-1]=1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
		if (s1 == 3) {
			System.out.println("3���� �¼����� ��Ȳ�Դϴ�.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats3[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("�¼� ��ȣ�� �Է����ּ���");
			int a = scan.nextInt();
			if (seats3[a-1]==0) {
				seats3[a-1]=1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
			

		
		
	}
}
}
