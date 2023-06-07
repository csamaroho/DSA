//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public boolean isPrime(int num)
    {
        if(num==1) return false;
        if(num==2) return true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%j==0&&isPrime(j))
                {
                    ans[i]=j;
                    break;
                }
                ans[i]=i;
            }
        }
        return ans;
    }
}
