package day03;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.printf("������ �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i=1; i<=n; i++)
			fact = fact * i;
		
		System.out.printf("%d!�� %d�Դϴ�.", n, fact);
	}

}
