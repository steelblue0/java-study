package day04;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] s = new int[10];
		
		for (int i = 0, o = 10; i<s.length; i++, o+=10) {
			s[i] = o;
		}
		
		for (int i = 0; i<s.length; i++)
			System.out.print(s[i]+" ");
	}

}
