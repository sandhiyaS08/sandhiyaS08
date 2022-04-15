package fundamentals;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int spaces=1;
	         
	         while(spaces<=n-i){
	             
	             System.out.print(" ");
	             spaces=spaces+1;
	         }
	         int no=1;
	         while(no<=i){
	             System.out.print(no+i-1);
	             no=no+1;
	         }
	         int dec=2*i-2;
	         while(dec>=i)
	         {
	        	 System.out.print(dec);
	        	 dec=dec-1;
	         }
	        	 
	         System.out.println();
	         i=i+1;
	     }
	    }
	}

	


