import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//       Calculator cal = new Calculator(12,3);
//       System.out.println("Addition is :" +  cal.add());
//        System.out.println("Multiply is :" +  cal.mul());
//        System.out.println("Subtraction is :" +  cal.sub());
//        System.out.println("Divide is :" +  cal.div());

        Calculator cal = new Calculator();
        while (true) {
            System.out.println("1. Please enter 1 for Addition");
            System.out.println("2. Please enter 2 for Subtraction");
            System.out.println("3. Please enter 3 for Multiply");
            System.out.println("4. Please enter 4 for Divide");
            System.out.println("5. Please enter 5 for Terminate");

            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            int options = sc.nextInt();


            switch(options){
                case 1:{
                    System.out.print("please enter 1st num for addition:");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("please enter 2nd num for addition:");
                    double num2=sc.nextDouble();
                    double ans = cal.add(num1, num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: " + ans);

                    break;
                }
                case 2:{
                    System.out.print("please enter 1st num for subtraction:");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("please enter 2nd num for subtraction:");
                    double num2=sc.nextDouble();
                    double ans = cal.sub(num1,num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: " + ans);
                    break;
                }
                case 3:{
                    System.out.print("please enter 1st num for Multiply:");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("please enter 2nd num for Multiply:");
                    double num2=sc.nextDouble();
                    double ans = cal.mul(num1,num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: " + ans);
                    break;
                }
                case 4:{
                    System.out.print("please enter 1st num for divide:");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("please enter 2nd num for divide:");
                    double num2=sc.nextDouble();
                    double ans = cal.div(num1,num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: " + ans);
                    break;
                }
                default :{
                    System.out.println("Error : Please Enter valid input");
                }

            }

        }

    }
}