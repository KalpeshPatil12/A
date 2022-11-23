package New;

public class SumOfRowsAndColumns {

	public static void main(String[] args) {
		
		int rows, columns, sumRows, sumColumns;
		
		int a[][] = {{1,2,3,},
		             {4,5,6}};
		
		rows=a.length;
		
		columns=a[0].length;
		
		for(int i = 0; i < rows; i++)
		{    
			sumRows = 0;    
			
            for(int j = 0; j < columns; j++)
            {    
            	sumRows = sumRows + a[i][j];    
            } 
            
            System.out.println("Sum of " + (i+1) +" row: " + sumRows);    
        }
		
		for(int i = 0; i < columns; i++)
		{    
			sumColumns = 0; 
			
            for(int j = 0; j < rows; j++)
            {    
            	sumColumns = sumColumns + a[j][i];    
            }    
            
            System.out.println("Sum of " + (i+1) +" column: " + sumColumns);    
        }  

	}

}
