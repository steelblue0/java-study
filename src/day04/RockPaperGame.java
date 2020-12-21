package day04;
import java.util.*;

public class RockPaperGame {

	public static void main(String[] args) {
		Random generater = new Random();
		Scanner scan = new Scanner(System.in);
		int draw = 0; //무승부
		int win = 0; //승리
		int lose = 0; //패배
		int sum = 0;
		
		while(true) {
			int com = generater.nextInt(3)+1;
			System.out.print("가위, 바위, 보! 당신의 선택은? (가위:1 / 바위:2 / 보:3 / 끝내기:4)");
			int me = scan.nextInt();
			if (me == 4)
				break;
			if (com == 1) {
				if (me == 1) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("무승부!");
					draw += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("승리!");
					win += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("패배!");
					lose += 1;
					sum += 1;
				}
			}
			if (com == 2) {
				if (me == 1) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("패배");
					lose += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("무승부!");
					draw += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("승리!");
					win += 1;
					sum += 1;
				}
			}
			if (com == 3) {
				if (me == 1) {
					System.out.println("컴퓨터 : 보");
					System.out.println("승리!");
					win += 1;
					sum += 1;
				}
				if (me == 2) {
					System.out.println("컴퓨터 : 보");
					System.out.println("패배!");
					lose += 1;
					sum += 1;
				}
				if (me == 3) {
					System.out.println("컴퓨터 : 보");
					System.out.println("무승부!");
					draw += 1;
					sum += 1;
				}
			}
				
			
			
			
		}
		System.out.println("총 게임 횟수: " + sum);
		System.out.println("총 승리 횟수: " + win);
		System.out.println("총 패배 횟수: " + lose);
		System.out.println("총 무승부 횟수: " + draw);
		System.out.println("당신의 승률: " + ( (double) win/(double)sum)*100);
		
		
		
		
	}

}
