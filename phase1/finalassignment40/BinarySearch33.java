package finalassignment40;

public class BinarySearch33 {
	
		 public static  void main(String[] args){

		        int[] arr = {8,16,24,32,40,48,56,64,72,80,88,96};
		        int key = 64;
		        int arrlength = (arr.length-1); 
		        binarySearch(arr,0,key,arrlength);
		    }

		 	public static void binarySearch(int[] arr, int start, int key, int length){

		        int midValue = (start+length)/2;       
		        while(start<=length){

		            if(arr[midValue]<key){
		                start = midValue + 1;
		            } else if(arr[midValue]==key){
		                System.out.println("Element is found at index :"+midValue);
		                break;
		            }else {

		                length=midValue-1;
		            }
		            midValue = (start+length)/2;
		        }
		            if(start>length){

		                System.out.println("Element is not found");
		            }      
		    }
		}


