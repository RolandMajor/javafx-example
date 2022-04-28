package model;

public class BinaryCalculatorModel {

    public String binaryAdd(String a,String b){
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }
    public String binarySubtract(String a,String b){
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int subtract = number0 - number1;
        return Integer.toBinaryString(subtract);
    }
    public String binaryMultiply(String a,String b){
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int multy = number0 * number1;
        return Integer.toBinaryString(multy);
    }
    public String binaryDivide(String a,String b) throws InvalidDivisionException {
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        if(number1==0){
            throw new InvalidDivisionException("Cannot divide 0!");
        }

        int div = number0 / number1;
        return Integer.toBinaryString(div);
    }
}
