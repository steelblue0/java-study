package day01;
/* CHAPTER 02 자바 프로그래밍 기초
 * 03 변수와 자료형 65p
 * 빛이 1년 동안 진행하는 거리를 계산
 */
public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365L * 24 * 60 * 60;
		
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + " km.");

	}

}
