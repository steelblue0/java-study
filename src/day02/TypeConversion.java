package day02;

public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);	// 5/4는 피연산자가 정수이므로 정수 연산으로 계산되어서 1이 된다. 이것이 double형 변수로 대입되므로 올림 변환이 발생하여 1.0이 f에 저장된다.
		
		f = (double) 5 / 4;		// (double) 5/4에서는 먼저 형변환 연산자가 우선순위가 높기 때문에 먼저 실행되어 정수 5가 부동소수점수 5.0으로 변환된다.
		System.out.println(f);	// 5.0 / 4는 피연산자중 하나가 double형 이므로 4도 double형으로 자동 형변환되고 5.0/4.0으로 계산되어 1.25가 수식의 결과값이 된다.
		
		i = (int) 1.3 + (int) 1.8;	// 수식 (int)1.3 + (int)1.8에서는 1.3과 1.8이 모두 1로 변환되므로 변수 i에는 1 + 1하여 2가 저장된다.
		System.out.println(i);
		
	}

}
