package test;

public class BinarySearch {

	public static void main(String[] args){
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		
		System.out.println(bSearch(nums,13));
	}
	
	private static int bSearch(int[] nums, int key){
		int low = 0;
		int high= nums.length-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			
			if(mid<key){
				low=mid+1;
			}
			else if(mid>key){
				high=mid-1;
			}
			else
				return mid;
		}
		
		return -1;
	}
}
