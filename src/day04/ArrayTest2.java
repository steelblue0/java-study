package day04;
import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하시오:");
		int STUDENTS = scan.nextInt();
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}
		
		for (int i = 0; i < scores.length; i++)
			total += scores[i];
			
		System.out.println("평균 성적은" + total/STUDENTS + "입니다");
	
	}

}
