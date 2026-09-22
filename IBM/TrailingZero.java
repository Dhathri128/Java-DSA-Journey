package IBM;

public class TrailingZero {
    public static void main(String[] args){
        	// your code goes here
		int[] arr =  {0, 1, 0, 3, 12};
		int n = arr.length;
		int index=0;
		for(int i = 0;i<n;i++){
		    if(arr[i] != 0){
		        arr[index++] = arr[i];
		    }
		}
		for(int i = index;i<n;i++){
		    arr[i] = 0; 
		}
		for(int num: arr){
		    System.out.println(num+ " ");
		}

    }
}
