package com.EPAM.maven.singletone;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
class MyClass {
    private static MyClass instance = null;
    Scanner sc=new Scanner(System.in);
    MyClass()
    {
    	System.out.println("Enter two numbers: ");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	System.out.println("result: "+(a*b));
    }
    public static MyClass getInstance() 
    {
        if (instance == null) 
        {
            instance = new MyClass();
        }
        return instance;
    }
}
public class App 
{
    public static void main( String[] args )
    {
    	MyClass global = MyClass.getInstance();
    }
}
