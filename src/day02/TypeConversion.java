package day02;

public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);	// 5/4�� �ǿ����ڰ� �����̹Ƿ� ���� �������� ���Ǿ 1�� �ȴ�. �̰��� double�� ������ ���ԵǹǷ� �ø� ��ȯ�� �߻��Ͽ� 1.0�� f�� ����ȴ�.
		
		f = (double) 5 / 4;		// (double) 5/4������ ���� ����ȯ �����ڰ� �켱������ ���� ������ ���� ����Ǿ� ���� 5�� �ε��Ҽ����� 5.0���� ��ȯ�ȴ�.
		System.out.println(f);	// 5.0 / 4�� �ǿ������� �ϳ��� double�� �̹Ƿ� 4�� double������ �ڵ� ����ȯ�ǰ� 5.0/4.0���� ���Ǿ� 1.25�� ������ ������� �ȴ�.
		
		i = (int) 1.3 + (int) 1.8;	// ���� (int)1.3 + (int)1.8������ 1.3�� 1.8�� ��� 1�� ��ȯ�ǹǷ� ���� i���� 1 + 1�Ͽ� 2�� ����ȴ�.
		System.out.println(i);
		
	}

}
