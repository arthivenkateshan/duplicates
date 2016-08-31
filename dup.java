import java.util.*;
import java.io.*;
  class dup
{
    public static void main(String args[])
    {    Scanner sc=new Scanner(System.in);
         Set<Character> set=new HashSet<Character>();
        String  str =sc.next(); 
        String out="";
        for(int i=0;i<str.length();i++)
         {
           set.add(str.charAt(i));
         }
         Iterator itr= set.iterator();
        while(itr.hasNext())
          {
             //out+=String.valueOf();
              System.out.print(itr.next());
          } 
        
    }
}