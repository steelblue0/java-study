package day03;
import java.util.*;
public class DaysInMoth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month, day;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�: ");
		month = scan.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 31;
			break;
		}
		
		System.out.println("���� ������ "+ day);
	}

}
