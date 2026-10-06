package sc2002.Tutorial4;
import java.util.Scanner;

public class calculator {
    private double result;

    public calculator(){
    }
    //return result
    public double resultValue(){
        return result;
    }
    // doing the calculation, where the exception part will be
    public void doCalculation(){
        result = 0.0;
        System.out.println("Calculator is on");
        System.out.println("result = " + result);
        Scanner sc = new Scanner(System.in);
        while(true){
            char op = sc.next().charAt(0);
            double n2 = sc.nextDouble();
            if(op == 'q' || op == 'Q'){
                break;
            }
            try{
                double value = evaluate(op, result, n2);
                System.out.println("result " + op + " " + n2 + " = " + value);
                result = value;
            }catch(UnknownOperatorException e){
                System.out.println(e.getMessage());
                result = handleUnknownOpException();
            }
        }

        System.out.println("final result = " + result);
        System.out.println("End of Program");
        

    }
    //evaluate the computation
    public double evaluate(char op, double n1, double n2) throws UnknownOperatorException{
        switch(op){
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if(n2 == 0){
                    throw new UnknownOperatorException("cannot divide by zero!");
                }
                return n1/n2;
            default:
                throw new UnknownOperatorException();
        }
    }
    // handle exceptions, give user another try to put correct
    public double handleUnknownOpException(){
        System.out.println("Please re-enter");
        return result;
    }

    //main function
    public static void main(String[] args){
        calculator calc = new calculator();
        calc.doCalculation();
    }
}

