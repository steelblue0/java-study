package day03;
import java.util.*;

public class LoopExample2 {

	public static void main(String[] args) {
		int n;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
		n = scan.nextInt();
		while(i<=9) {
			System.out.println(n + " x " + i + "=" + n * i);
			i++;
		}
	}

}
