
public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(fibonacci(n));

	}

	private static long fibonacci(int n) {
		if(n<=1)
			return n;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
// 0 1 1 2 3 5 8 13 21 34 55
//Starting from 0th fibonacci, 1st fibonacci, ...