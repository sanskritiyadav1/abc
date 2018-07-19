import java.util.ArrayList;
import java.util.List;
class LCS
{
	public static List<String> common(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int match[][]=new int[l1][l2];
		int max=Integer.MIN_VALUE;
		ArrayList <String> result=null;
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					if(i==0||j==0)
						match[i][j]=1;
					else
						match[i][j]=match[i-1][j-1]+1;
					if(match[i][j]>max)
					{
						max=match[i][j];
						result=new ArrayList<String>();
						result.add(s1.substring(i-max+1,i+1));
					}
					else if(match[i][j]==max)
					{
						result.add(s1.substring(i-max+1,i+1));
					}
				}
				else
					match[i][j]=0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		List<String> result=common("CLCL","LCLC");
		for(String str:result)
		{
			System.out.println(str);
		}
	}
}