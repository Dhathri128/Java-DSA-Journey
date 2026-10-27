package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        
    
    int[] arr = {23,45,21,12,60};
    int target = 21;
    for(int i =0;i<arr.length;i++){
        if(arr[i] == target){
            System.out.println("Element Found at index i");
            break;
        }
        else{
            System.out.println("Element not Found");
        }
    }

}
}
