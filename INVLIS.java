package practice;
import java.util.*;
class INVLIS{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i =0; i<T;i++)
        {
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	
            	int[] ans = new int[n];
            	int[] indices = new int[k];
            	//storing the indices in an array
            	for (int j = 0;j<k;j++)
            	{
            		indices[j] = sc.nextInt()-1;
            	}
            	int l = n;
            	//inserting the biggest numbers in decreasing order in starting
            	for (int j = 0; j<indices[0];j++)
            	{
            		ans[j] = l--;
            	}
            	l = 1;
            	//inserting the smallest numbers in increasing order at starting
            	for (int j = n-1; j>indices[k-1];j--)
            	{
            		ans[j] = l++;
            	}
            	for (int j =0; j<k;j++)
            	{
            		ans[indices[j]] = l++;
            	}
            	int m = k-1;
            	for (int j = indices[k-1];j>indices[0];j--)
            	{
            		if (j==indices[m])
            		{
            			m--;
            		}
            		else
            		{
            			ans[j] = l++;
            		}
            	}
            	if (k==1 && n!=1)
            	{
            		System.out.println("NO");
            	}
            	else if (k == 2 && indices[1] - indices[0] != 1)
            	{
//            		if (indices[0] == 0 && indices[1] != 1)
            		System.out.println("NO");
//            		else 
//                	{
//                    	System.out.println("YES");
//                    	String xyz = "" + ans[0];
//                    	for (int j = 1;j<n;j++)
//                    	{
//                    		xyz = xyz + " " + ans[j];
//                    	}
//                    	System.out.println(xyz);
//                    	}	
            	}
            	else
            	{
            	System.out.println("YES");
            	String xyz = "" + ans[0];
            	for (int j = 1;j<n;j++)
            	{
            		xyz = xyz + " " + ans[j];
            	}
            	System.out.println(xyz);
            	}	
        	
        }
        sc.close();

    }
}
