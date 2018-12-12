package com.test;

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
    }
    public static String getHelloWorld() {

		return "Hello World";

	}

	public int calculateSomething() {
		return 0;
	}
}
