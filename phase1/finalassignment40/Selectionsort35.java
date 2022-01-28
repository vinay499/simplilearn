package finalassignment40;

public class Selectionsort35 {
	
	
		public static void main(String[] args) {

		    int[] arr = {10,45,20,14,56,36,5};
		    selectionSort(arr);
		    System.out.println("The sorted elements are:");
		    for(int i:arr){
		        System.out.println(i);
		         }
		     }

		    public static void selectionSort(int[] arr){

		        for(int i=0;i<arr.length;i++){

		            int index =i;
		            for(int j=i+1;j<arr.length;j++){
		                if(arr[j]<arr[index]){

		                    index =j;
		                }
		            }
		            int smallNumber = arr[index]; 
		            arr[index]= arr[i];
		            arr[i]= smallNumber;
		        }
		    }
		}


