package day04;
import java.util.*;

public class RockPaperGame {

	public static void main(String[] args) {
		Random generater = new Random();
		Scanner scan = new Scanner(System.in);
		int draw = 0; //���º�
		int win = 0; //�¸�
		int lose = 0; //�й�
		int sum = 0;
		
		while(true) {
			int com = generater.nextInt(3)+1;
			System.out.print("����, ����, ��! ����� ������? (����:1 / ����:2 / ��:3 / ������:4)");
			int me = scan.nextInt();
			if (me == 4)
				break;
			if (com == 1) {
				if (me == 1) {
					System.out.println("��ǻ�� : ����");
					System.out.println("���º�!");
					draw += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("��ǻ�� : ����");
					System.out.println("�¸�!");
					win += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("��ǻ�� : ����");
					System.out.println("�й�!");
					lose += 1;
					sum += 1;
				}
			}
			if (com == 2) {
				if (me == 1) {
					System.out.println("��ǻ�� : ����");
					System.out.println("�й�");
					lose += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("��ǻ�� : ����");
					System.out.println("���º�!");
					draw += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("��ǻ�� : ����");
					System.out.println("�¸�!");
					win += 1;
					sum += 1;
				}
			}
			if (com == 3) {
				if (me == 1) {
					System.out.println("��ǻ�� : ��");
					System.out.println("�¸�!");
					win += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("��ǻ�� : ��");
					System.out.println("�й�!");
					lose += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("��ǻ�� : ��");
					System.out.println("���º�!");
					draw += 1;
					sum += 1;
				}
			}
				
			
			
			
		}
		System.out.println("�� ���� Ƚ��: " + sum);
		System.out.println("�� �¸� Ƚ��: " + win);
		System.out.println("�� �й� Ƚ��: " + lose);
		System.out.println("�� ���º� Ƚ��: " + draw);
		System.out.println("����� �·�: " + ( (double) win/(double)sum)*100);
		
		
		
		
	}

}
