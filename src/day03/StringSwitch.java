package day03;
import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month;
		int monthNumber;
		
		System.out.print("���� �̸��� �Է��Ͻÿ�: ");
		month = scan.next();
		
		switch (month) {
		case "january":
			monthNumber = 1;
			break;
		case "February":
			monthNumber = 2;
			break;
		case "March":
			monthNumber = 3;
			break;
		case "April":
			monthNumber = 4;
			break;
		case "May":
			monthNumber = 5;
			break;
		case "June":
			monthNumber = 6;
			break;
		case "July":
			monthNumber = 7;
			break;
		case "August":
			monthNumber = 8;
			break;
		case "September":
			monthNumber = 9;
			break;
		case "October":
			monthNumber = 10;
			break;
		case "November":
			monthNumber = 11;
			break;
		case "December":
			monthNumber = 12;
			break;
		default:
			monthNumber = 0;
			break;
		}
		
		System.out.println(monthNumber);
			
	}

}