package mvcdemo;
//model holds all the data
public class CalculatorModel {

 

    private int calculationValue;

     

    public void addTwoNumbers(int firstNumber, int secondNumber){

         

        calculationValue = firstNumber * secondNumber;

         

    }

     

    public int getCalculationValue(){

         

        return calculationValue;

         

    }

     

}
