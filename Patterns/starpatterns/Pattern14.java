/*
 
 	print - perfect pyramid
 	   
 	   *
 	  * *
 	 * * *
 	* * * *
	   
*/ 


package starpatterns;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//here we are considering upto 4 rows
	
		//method 1:
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= (4-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print(" *");
			
			System.out.println();
		}
		
		/*System.out.println("------------------------------------------------");
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j >= i; j--)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print(" *");			// *    * *   * * *  * * * *
		}*/
		
		System.out.println("------------------------------------------------");
		
		//method 2:
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j >= i; j--)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print(" *");	
			
			System.out.println();
		}
		
		System.out.println("------------------------------------------------");
		
		//method 3:
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j >= 1; j--)
			{
				if(j > i)
					System.out.print(" ");
				else
					System.out.print(" *");	
			}
			
			System.out.println();
		}
	}

}
