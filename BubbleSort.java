package test;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {3,5,2,12,65,33,99,22,38,11,1,9,52,4};

		bubbleSort(nums);
		
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	
	/**
	 * loop 0-array length-1
	 * loop 1-array length-i
	 * if j-1 > j
	 * swap
	 * 
	 */
	 public static void bubbleSort(int[] unsorted){  
       for(int i = 0; i < unsorted.length-1; i++){
    	   for(int j = 1; j < unsorted.length - i; j++){
    		   if(unsorted[j-1] > unsorted[j]){
    			   int t = unsorted[j-1];
    			   unsorted[j-1] = unsorted[j];
    			   unsorted[j]   = t;
    		   }
    	   }
       }
    }
	 
	 


}
