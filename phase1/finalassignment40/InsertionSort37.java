package finalassignment40;

public class InsertionSort37 

	{
		public static  void main(String[] args){

	        int[] arr = {20,12,23,36,56,5,1,59,25};
	        insertionSort(arr);
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]);
	        }
	     }
	    
	    public static void insertionSort(int[] arr){

	    int len = arr.length;
	    for(int j=1;j<len;j++){
	    int key = arr[j];
	    int i=j-1;
	    while ((i>-1) && (arr[i]>key)){

	        arr[i+1]=arr[i];
	        i--;
	    }
	    arr[i+1]=key;
	         }
	    }
	}

