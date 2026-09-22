package IBM;

public class MaxSubarray {
    public static void main(String[] args){
        int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
		int best = arr[0];
		int curr_sum = arr[0];
		for(int i =1;i<arr.length;i++){
		    curr_sum = Math.max(arr[i], arr[i]+curr_sum);
		    best = Math.max(curr_sum, best);
		}
		System.out.println(best);
    }
}
