package day03;
import java.util.*;

public class CalSum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, o;
		int sum = 0;
		System.out.print("������ ���ұ��?: ");
		i = scan.nextInt();
		System.out.print("������ ���ұ��?: ");
		o = scan.nextInt();
		
		while(i<=o) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("�հ�= " + sum);
	}

}
