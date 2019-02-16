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
class rev
{
    String s;
    int n,d,i;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        s = in.nextLine();
        d = s.length();
        char a[] = new char[d];
        a = s.toCharArray();
        for(i=d-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        
    }
}
public class reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rev r = new rev();
        r.fun();
        // TODO code application logic here
    }
    
}
