package day04;
import java.util.*;

public class StudyCafeReserve {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	final int size = 10;
	int[] seats1 = new int[size];
	int[] seats2 = new int[size];
	int[] seats3 = new int[size];
	
	while(true) {
		System.out.println("-----스터디센터 좌석 예약시스템-----");
		System.out.print("\n 입실할 방 번호를 입력하세요(1, 2, 3)(종료:0):");
		int s1 = scan.nextInt();
		if (s1 == 0)
			break;
		if (s1 == 1) {
			System.out.println("1번방 좌석예약 현황입니다.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats1[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("좌석 번호를 입력해주세요");
			int a = scan.nextInt();
			if (seats1[a-1]==0) {
				seats1[a-1]=1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
		if (s1 == 2) {
			System.out.println("2번방 좌석예약 현황입니다.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats2[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("좌석 번호를 입력해주세요");
			int a = scan.nextInt();
			if (seats2[a-1]==0) {
				seats2[a-1]=1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
		if (s1 == 3) {
			System.out.println("3번방 좌석예약 현황입니다.");
			for(int i = 0; i<size; i++)
				System.out.print(i+1 + " ");
			System.out.println("----------------------");
			for(int i = 0; i<size; i++)
				System.out.print(seats3[i] + " ");
			System.out.println("----------------------");
			
			System.out.print("좌석 번호를 입력해주세요");
			int a = scan.nextInt();
			if (seats3[a-1]==0) {
				seats3[a-1]=1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
			

		
		
	}
}
}
