package pattern;

public class Pattern2 
{
	public static void main(String args[])
	{
		char ch='A';
		int row=5;
		for(int i=row;i>0; i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print(ch);
					ch++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
