package day03;
import java.util.*;
public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int n = scan.nextInt();
		
		System.out.println(n + "�� ����� ������ �����ϴ�.");
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) 
				System.out.print(" "+i);
			
		}
	}

}
