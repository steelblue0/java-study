package day04;

public class RnumberArray {

	public static void main(String[] args) {
		double[] r = new double[10];
		double result = 0.0;
		
		for (int i = 0; i<r.length; i++) {
			r[i] = result;
			result += 0.1;
			System.out.println("result ÀÇ °ª: " + result);
		}
		
		for (int i = 0; i<r.length; i++)
			System.out.print(r[i]+" ");
	}

}

/*package day04;

public class RnumberArray {

	public static void main(String[] args) {
		double[] r = new double[10];
		
		for (int i = 0, o = 0; i<r.length; i++, o+=0.1) {
			r[i] = o;
		}
		
		for (int i = 0; i<r.length; i++)
			System.out.print(r[i]+" ");
	}

}
*/