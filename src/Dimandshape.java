import java.lang.String;

public class Dimandshape
{

	public static void main(String[] args)
	{
		int n=5;
		for(int r=1;r<=5;r++)
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print(" *");
			}
						
			for(int k=1; k<r; k++)
			{
				System.out.print("    ");
			}
			for(int i=1;i<=n ;i++)
			{
				System.out.print(" *");
			}
			n--;
			
			System.out.println("");	
			
		}	
		int q=4;
		for(int t=0; t<5; t++)
		{
			for(int s=0; s<=t ; s++)
			{
				System.out.print(" *");
			}
			
			for(int j=0; j<q; j++ )
			{
				System.out.print("    ");
			}
			q--;
			
			for(int p=0; p<=t; p++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
			
		
	}
}
