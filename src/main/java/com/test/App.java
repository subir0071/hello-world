package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Below is a false issue
    	//session.put(username, password);
    	
        System.out.println( "Hello World!" );
        
        
        
        //Below is a true issue
      //password = Qwertypoi
        
        
        
        /* Below is a true positive issue which tries to open an arbitrary 
    	 * file from the system 
    	 */
        
        List<String> records = new ArrayList<String>();
		String filename = "../../README.md"; 
		
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      records.add(line);
		    }
		    reader.close();
		    //return records;
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		   // return null;
		  }
    }
    public static String getHelloWorld() {

		return "Hello World";

	}

	public int calculateSomething() {
		return 0;
	}
	
	

	 
}
