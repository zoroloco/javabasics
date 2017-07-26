package test;

public class PowerOfTwo {

	public static void main(String[] args){
		int num = 128;
		
		System.out.println(isPowerOfTwo(num));		
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	private static boolean isPowerOfTwo(int num){
		return (num & (num-1)) == 0;		
	}
}
