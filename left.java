/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg10.pkg18;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class right
{
     int a[] = new int[20];
     int e[] = new int[20];
     int d[] = new int[20];
    int i,n,c=0,j,k;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        n = in.nextInt();
        System.out.println("enter the array");
        for(i=1;i<=n;i++)
        {
            a[i]=in.nextInt();
            
        }
        System.out.println("Right");
        k=1;
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(a[i]>a[j])
                {
                    //System.out.println(a[j]);
                    d[k]=a[j];
                    k++;
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                d[k]=0;
                k++;
                //System.out.println("0");
            }
            c=0;
        }
        for(i=1;i<=n;i++)
        {
            System.out.println(d[i]);
        }
        System.out.println("Left");
        k=n;
        for(i=n;i>0;i--)
        {
            for(j=i-1;j>0;j--)
            {
                if(a[i]>a[j])
                {
                    e[k]=a[j];
                    k--;
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                e[k]=0;
                k--;
            }
        }
        for(i=1;i<=n;i++)
        {
            System.out.println(e[i]);
        }
        int s[]=new int[20];
        for(i=1;i<=n;i++)
        {
            s[i]=e[i]-d[i];
            //System.out.println(s[i]);
        }
        for(i=1;i<=n;i++)
        {
            if(s[i]<s[i+1])
            {
                k=s[i+1];
            }
        }
        System.out.println("ans"+k);
    }
}
public class left {
    public static void main(String args[])
    {
        right r = new right();
        r.fun();
    }
    
}
