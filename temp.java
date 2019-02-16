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
class t
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
        k=n;
        for(i=n;i>0;i--)
        {
            for(j=i-1;j>0;j--)
            {
                if(a[i]>a[j])
                {
                    //System.out.println(a[j]);
                    //System.out.println("i"+a[i]);
                    e[k]=a[j];
                    k--;
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                //System.out.println(0);
                e[k]=0;
                k--;
            }
        }
        for(i=1;i<=n;i++)
        {
            System.out.println(e[i]);
        }
    }
    
}
public class temp {
    public static void main(String args[])
    {
        t o = new t();
        o.fun();
    }
}
