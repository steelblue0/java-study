package day02;
/* CHAPTER 02 자바 프로그래밍 기초
 * 04 수식과 연산자 p.76
 */
public class LeapYear {

	public static void main(String[] args) {

		int year = 2012;
		boolean isLeapYear;		//boolean은 논리형. 참과 거짓을 판별.
		
		isLeapYear = (year % 4 == 0); 	//4로 나눠지는 연도는 윤년 후보이다.
		System.out.println(isLeapYear);
	}

}
