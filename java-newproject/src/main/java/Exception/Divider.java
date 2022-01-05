package Exception;

public class numDivider {
    public double dividenumbers(double num1, double num2);{
    }
    if(num2 == 0);
        return 0;
     return num1/num2;
}

    public double divideNumbersException(double num1, double num2) {
        if(num2 == 0) throw new ArithmeticException("num2 is 0");
        return num1/num2;

}
}