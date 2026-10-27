package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 20;
        int result = Search(arr, target);
        System.out.println(result);
    }
    static int Search(int[] arr, int target){
        int start = arr[0];
        int end = arr.length;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid]< target){
                start = mid+1;
            }
            else if(arr[mid]> target){
                end = mid-1;
            }
            else if(arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
