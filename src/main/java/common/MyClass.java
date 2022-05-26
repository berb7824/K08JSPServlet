package common;

public class MyClass {
	public static int myFunc(int a, int b) {
		int sum=0;
		//a부터 b까지의 합을 반환하는 메소드
		for(int i=a; i<=b; i++) {
			sum+= i;
		}
		return sum;
	}
}
