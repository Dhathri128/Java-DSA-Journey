package arrays;

public class kandanesAlgorithm {
    public static void main(String[] args) {
        int[] arr =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};//{90,34,12,69,78,56}
        System.out.println(maxSubArr(arr));
    }
    static int maxSubArr(int[] arr){
        int curr_max = arr[0];
        int result = arr[0];
        for(int i=1;i<arr.length;i++){
            curr_max= Math.max(arr[i], curr_max+arr[i]);
            result = Math.max(curr_max, result);
        }
        return result;
    }
}
