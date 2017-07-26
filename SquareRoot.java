package test;

public class SquareRoot {

	public static void main(String[] args){
		System.out.println("Square root = "+sqrt(81));
	}
	
	/**
	 * 
	 * @param num
	 * @return - square root of num.
	 */
	private static double sqrt(int num){
		double t;
		double sq = num/2;
		
		do{
			t = sq;
			sq= (t+(num/t))/2;
		}while((t-sq)!=0);
		
		return sq;
	}
}
