package day01;
/* CHQPTER 02 자바 프로그래밍 기초
 * 03 변수와 자료형 p71
 * 마일을 킬로미터로 변환하는 프로그램
 */
public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile ;
		
		System.out.println("60마일은 " + km + "킬로미터입니다.");
	}

}
