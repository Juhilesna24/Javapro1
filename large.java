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
class lar
{
    int a[] = new int[20];
    int i,n,c=0,j;
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
        System.out.println("Ans");
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(a[i]<a[j])
                {
                    System.out.println(a[j]);
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("-1");
            }
            c=0;
        }
        
    }
}
public class large {
    public static void main(String args[])
    {
    lar l = new lar();
    l.fun();
    }
}
