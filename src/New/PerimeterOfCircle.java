package New;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		
//		Scanner s= new Scanner(System.in);
//        
//      System.out.println("Enter the radius:");
//        
//	    double r= s.nextDouble();
//        
//	    double  c=(22*2*r)/7 ;
//     
//	    System.out.println("Perimeter of Circle is: " +c);
//		
		
		
		
		
//		Scanner s= new Scanner(System.in);
//        
//      System.out.println("Enter the radius:");
//        
//      double r=s.nextDouble();
//        
//      System.out.println("Enter the height:");
//        
//      double h=s.nextDouble();
//
//      double  volume=((22*r*r*h)/7);
//
//      System.out.println("volume of Cylinder is: " +volume);
		
		
		
		
		Scanner s= new Scanner(System.in);
        
     	System.out.println("Enter the radius:");
     	
  		double r=s.nextDouble();
     	
	    System.out.println("Enter the height:");
     	
	    double h=s.nextDouble();

        double  tsa=((2*22*r)/7)*(r+h);

        System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
      

	}

}
