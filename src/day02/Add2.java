package day02;
// ����ڰ� �Է��� �� ���� ���ڸ� ���ؼ� ����Ѵ�.
import java.util.Scanner; //  Scanner Ŭ���� ����

public class Add2 {
	// ���� �޼ҵ忡������ ������ ���۵ȴ�.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x; // ù ��° ���� ����
		int y; // �� ��° ���� ����
		int sum; // ���� ����
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���: "); // �Է� �ȳ� ���
		x = input.nextInt(); // ����ڷκ��� ù ��° ���ڸ� �д´�.
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: "); // �Է� �ȳ� ���
		y = input.nextInt(); // ����ڷκ��� �� ��° ���ڸ� �д´�.
		
		sum = x + y; //
		System.out.println(sum); // ���� ����Ѵ�.

	}

}
