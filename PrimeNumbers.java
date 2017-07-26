package test;

public class PrimeNumbers {

	/**
	 * Prints out all prime numbers from 1-n.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		
		for(int i = 1; i<=100; i++){
			if(i<=3){
				System.out.println(i);
			}
			else{
				if(i % 2 !=0){//all odd numbers
					int sqrt = (int)Math.sqrt(i)+1;
					if(isPrime(sqrt,i)){
						System.out.println(i);
					}
				}
			}			
		}
	}
	
	/**
	 * 
	 * @param sqrt
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int sqrt,int num){
		for(int i = 2; i <= sqrt; i++){
			if(num % i == 0){
				return false;
			}
		}
		
		return true;
	}

}
