import java.util.*;
class lis
{
	public static void LIS(int x[])
	{
		int parent[]=new int[x.length];
		int increasingsub[]=new int[x.length+1];
		int length=0;
		for(int i=0;i<x.length;i++)
		{
			int low=1;
			int high=length;
			while(low<=high)
			{
				int mid=(int)Math.ceil((low+high)/2);
				if(x[increasingsub[mid]]<x[i])
					low=mid+1;
				else
					high=mid-1;
			}
			int pos=low;
			parent[i]=increasingsub[pos-1];
			increasingsub[pos]=i;
			if(pos>length)
				length=pos;
		}
		int lis[]=new int[length];
		int k=increasingsub[length];
		for(int j=length-1;j>=0;j--)
		{
			lis[j]=x[k];
			k=parent[k];
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(lis[i]);
		}
		}
	
	public static void main(String[] args) {
		int x[]={3,1,5,2,6,4,9};
		LIS(x);
	}
}