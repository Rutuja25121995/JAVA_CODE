package com.company.operators;

public class primeNo {

	public static void main(String[] args) {
		int i;
		int j;
		int temp;
		
		for(i=2;i<=100;i++)
		{
			temp=0;
			for(j=2;j<i;j++)
			{
		     if(i%j==0) 
		      {
			   temp=temp+1;
			   break;
		      }
		    }
		  
		if(temp==0)
		{
			System.out.println(i);
		}
		
	   }
	}
}
  
	


