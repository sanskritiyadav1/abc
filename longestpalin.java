import java.util.*;
class longestpalin
{
	public static String LPS(String s)
	{
		int n=s.length();
		int begin=0;
		int max=1;
		boolean palin[][]=new boolean[n][n];
		for(int i=0;i<n;i++)
		{
			palin[i][i]=true;
		}
		for(int i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				palin[i][i+1]=true;
		}
		for(int current=3;current<=n;current++)
		{
			for(int i=0;i<n-current+1;i++)
			{
				int j=i+current-1;
				if(s.charAt(i)==s.charAt(j) && palin[i+1][j-1])
				{
					palin[i][j]=true;
					begin=i;
					max=current;
				}
			}
		}
		return (s.substring(begin,max+begin));
	}
	public static void main(String[] args) {
		System.out.println(LPS("banana"));
	}
}