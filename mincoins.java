import java.util.*;

class mincoins
{
	public static int getMinCoins(int val[],int sum)
	{
		if(sum==0)
			return 0;
		int min=Integer.MAX_VALUE;
		int n=val.length;
		for(int i=0;i<n;i++)
		{
			if(sum>=val[i])
			{
				min=Math.min(min,getMinCoins(val,sum-val[i]));
			}

		}
		return min+1;
	}
	public static int getMinCoinsDp(int val[],int sum)
	{
		int min=0;
		int mincoins[]=new int[sum+1];
		mincoins[0]=0;
		for(int i=1;i<=sum;i++)
		{
			min=Integer.MAX_VALUE;
			for(int j=0;j<val.length;j++)
			{
				if(i>=val[j])
				{
					min=Math.min(min,mincoins[i-val[j]]);
				}
				if(min!=Integer.MAX_VALUE)
					mincoins[i]=min+1;
				else
					mincoins[i]=Integer.MAX_VALUE;
			}}
			return mincoins[sum];
			}
			public static void main(String[] args) {
				int val[]={2,5,3};
				int sum=7;
				System.out.println(getMinCoinsDp(val,sum));
			}
		}
	
