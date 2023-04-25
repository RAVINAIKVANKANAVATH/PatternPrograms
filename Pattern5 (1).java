 /*
   *
  * *
 * * *
* * * *
Can use to modify the it by removing spaces
      *
    * * 
  * * *
* * * *
 but here we use print statement before * give the space. i.e sop(" *")
*/

public class Pattern5
{
	public static void main(String[] args) {
	    for(int i=1;i<=4;i++)
	    {
	        for(int j=3;j>=i;j--)
	        {
	          System.out.print(" ");   
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print(" *");
	        }
	         System.out.println();
	    }
	}
}
