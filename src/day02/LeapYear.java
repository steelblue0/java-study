package day02;
/* CHAPTER 02 �ڹ� ���α׷��� ����
 * 04 ���İ� ������ p.76
 */
public class LeapYear {

	public static void main(String[] args) {

		int year = 2012;
		boolean isLeapYear;		//boolean�� ����. ���� ������ �Ǻ�.
		
		isLeapYear = (year % 4 == 0); 	//4�� �������� ������ ���� �ĺ��̴�.
		System.out.println(isLeapYear);
	}

}
