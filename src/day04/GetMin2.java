package day04;

public class GetMin2 {

	public static void main(String[] args) {
		int s[] = { 12,3, 19, 6, 18, 8, 12, 4, 1, 19};
		int maximum = s[0];
		
		for (int i = 1; i<s.length; i++) {
			if (s[i]>maximum)
			maximum = s[i];
		}
		
		System.out.print("최대값은 "+maximum);
	}

}
