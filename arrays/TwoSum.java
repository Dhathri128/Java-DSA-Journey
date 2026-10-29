package arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(sum(arr, target));
    }
    static int[] sum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int required = target - arr[i];
            if(map.containsKey(required)){
                return new int[]{map.het(required),i};
            }

            map.put(arr[i],i);
        }
        return new int[]{};
    }
    
}
