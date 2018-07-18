import java.util.*;
import java.util.ArrayList;
class subset
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		ArrayList <Integer> cpyarr=new ArrayList();
		ArrayList <Integer> ans=new ArrayList();
		cpyarr.add(0);
		for(int i=0;i<arr.length;i++)
		{
			for(int j:cpyarr)
				{ans.add(j+arr[i]);}
		cpyarr.add(arr[i]);
	}
	System.out.println(ans.contains(sum));
	}
}