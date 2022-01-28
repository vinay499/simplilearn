package finalassignment40;

public class Arrays10 {

		public static void main(String[] args) 
	    {
			//one dimension array
			int a[]= {5,10,15,20,25};
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
			
			//Two dimensional array
	        int[][] arr = { { 5, 6 }, { 7, 8 } }; 
	  
	        for (int i = 0; i < 2; i++) 
	        {               
	            for (int j = 0; j < 2; j++) 
	            {           
	                System.out.print(arr[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	    } 

	
}
