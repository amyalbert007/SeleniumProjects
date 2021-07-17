package com.cg.project;


public class App 
{
    public static void main( String[] args )
    {
        int n1=100,n2=200;
        int expectedAns = 300;
        
        int actualAns = add(n1,n2);
        assert(expectedAns==actualAns);
    }
    
    public static int add(int n1,int n2) {
    	return n1+n2;
    	//return 0;
    }
}
