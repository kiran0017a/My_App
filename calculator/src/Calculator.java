public class Calculator {
    public double num1;
    public double num2;

//    Calculator(double num1, double num2){
//       this.num1=num1;
//       this.num2=num2;
//    }

    double add(double num1, double num2){
        double res= num1 + num2;
        return res;
    }

    double sub(double num1, double num2){
        double res=num1 - num2;
        return res;
    }
    double mul(double num1, double num2){
        double res=num1 * num2;
        return res;
    }
    double div(double num1, double num2){
        double res=num1/num2;
          return res;
    }
}
