package finalassignment40;


	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class filehandling18 
	{
		public static void main(String[] args) 
		{
			//Create a file
			 File file = new File("F:\\java 1\\phase 1\\src\\finalassignment40");
			  try 
			  {  
		            if (file.createNewFile()) 
		            {  
		                System.out.println("New File is created!");  
		            } 
		            else 
		            {                   
		               if(file.exists())
		               {
		                    System.out.println("File already exists.");	
		                    System.out.println("File path:" + file.getAbsolutePath());
		                    System.out.println("File name:  " + file.getName());
		                    System.out.println("File class:  " + file.getClass());
		                    System.out.println("File parent:  " + file.getParent());
		                    System.out.println("File space allocated:  " + file.getUsableSpace());
		                    System.out.println("File length: " + file.length());
		                    System.out.println("File list:   " + file.list());
		                    
		               }
		            }  
		        } catch (IOException e) {  
		            e.printStackTrace();  
		        }
		        
			   
			   //Write operation
			   String data = "This is the data in the output file";
			    
			    try {
			      
			      FileWriter output = new FileWriter("F:\\java 1\\phase 1\\src\\finalassignment40");

			     		     
			      output.write(data);
			      System.out.println("Data is written to the file.");

			      
			      output.close();
			    }
			    catch (Exception ex) {
			      ex.getStackTrace();
			    }
			    
			    //Read operation
			    char[] array = new char[60];
			    
			    try {
			      
			      FileReader input = new FileReader("F:\\java 1\\phase 1\\src\\finalassignment40");
			      
			      input.read(array);
			      
			      System.out.println("Data in the file:");
			      System.out.println(array);

			      
			      input.close();
			    }
			    catch(Exception exc) {
			      exc.getStackTrace();
			    }
			    //Delete a file
			    boolean b = file.delete();
	            if(b==true)
	            {
	            	System.out.println("File deleted !!");
	            }
	            else
	            {
	            	System.out.println("File not deleted");
	            }
			   
	        }  
	    
	    	  
	}
