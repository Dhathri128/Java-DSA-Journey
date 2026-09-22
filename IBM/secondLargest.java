public class secondLargest{
    public static void main(String[] args) {
       	// your code goes here
        int[] arr = {23,34,12,45,39};
        int max = Integer.MIN_VALUE;
        int sec_max =  Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                sec_max = max;
                max = arr[i];
            } 
            if(arr[i] <max && arr[i] >sec_max){
                sec_max = arr[i];
            }
        }
        System.out.println(sec_max);

    }
}
