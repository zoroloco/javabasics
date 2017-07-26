package test;

public class Fib {

	public static void main(String[] args){
		fib(10);
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	private static void fib(int num){
		int[] fib = new int[num];
		
		fib[0] = 1;
		fib[1] = 2;
		
		for(int i = 2; i< num; i++){
			fib[i] = fib[i-1]+fib[i-2]; 
		}				
		
		for(int i = 0; i < num; i++){
			System.out.println(fib[i]);
		}
	}
}
