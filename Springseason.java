import java.util.*;

class Springseason{
public static void  main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter month (1-12)") ;
int month =sc.nextInt();

System.out.print("enter day(1-30");
int day=sc.nextInt();

if(month==2 && day>=12 || month==3 || month==4 && day<=11){
System.out.print("true");
}else{

System.out.println("false");
}
}

}
