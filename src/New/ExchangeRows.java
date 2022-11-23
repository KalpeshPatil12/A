package New;

import java.io.IOException;

public class ExchangeRows {
		
		//public static class Row {
		     
		    static void swap_First_last(int mat[][])
		    {
		        int rws = mat.length;
		 
		        for (int j = 0; j < mat[0].length; j++) {
		 
		            int temp = mat[0][j];
		            mat[0][j] = mat[rws - 1][j];
		            mat[rws - 1][j] = temp;
		        }
		    }
		 
		    public static void main(String args[])
		        throws IOException
		    {
		        
		        int mat[][] = { { 2, 3, 4, 5 },
		                        { 8, 9, 6, 15 },
		                        { 13, 22, 11, 18 },
		                        { 19, 1, 2, 0 } };
		 
		        
		        System.out.println("Input matrix is as follows : ");
		         
		        for (int j = 0; j < mat.length; j++) {
		            for (int k = 0; k < mat[0].length; k++)
		 
		                System.out.print(mat[j][k] + " ");
		            
		            System.out.println();
		        }
		 
		        System.out.println(
		            "Swapped matrix is as follows : ");
		   
		        swap_First_last(mat);
		   
		        for (int j = 0; j < mat.length; j++) {
		            for (int k = 0; k < mat[0].length; k++)
		  
		                System.out.print(mat[j][k] + " ");
		 
		  
		            System.out.println();
		        }
		    }

}
