import  java.util.*;

public class leapyear{
public static void  main(String args[]){
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter year:");
      double year=sc.nextDouble();
if(year%400==0  || year%4==0 && year%100!=0){
System.out.println("year is  a  leap year");
return;
}
System.out.println("year is not a leap year");
}
}
