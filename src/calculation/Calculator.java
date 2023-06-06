package calculation;

public class Calculator {
    public void addition(int a, int b){
        int result = a + b;
        System.out.println("Addition of " +a+ " and " +b+ " is : " +result);
    }
    public void subtraction(int a, int b){
        int result = a - b;
        System.out.println("subtraction of " +a+ " and " +b+ " is : " +result);
    }
    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println("multiplication of " +a+ " and " +b+ " is : " +result);
    }
    public void division(int a, int b){
        int result = a / b;
        System.out.println("division of " +a+ " and " +b+ " is : " +result);
    }
    public void calculateResult(int a, int b, char symbol){
        switch(symbol){
            case '+' :
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*' :
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Wrong input. Please enter correct symbol");
                break;
        }
    }
}
