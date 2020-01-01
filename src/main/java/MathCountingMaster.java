public class MathCountingMaster {

    private double currentNumber = 0;


    public void doMathOperation(String operation, double number) {
        switch (operation) {
            case "+":
                currentNumber += number;
                break;
            case "-":
                currentNumber -= number;
                break;
            case "*":
                currentNumber *= number;
                break;
            case "/":
                if (number == 0) {
                    System.out.println("You can't divide by zero!");
                    return;
                }
                currentNumber /= number;
                break;
            default:
                System.out.println("Don't recognize math operation");
                break;
        }

    }

    public double getCurrentNumber() {
        return currentNumber;
    }
}
