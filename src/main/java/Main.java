import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        HashMap<String,String> haszhasz = new HashMap<>();
//        haszhasz.put("A","1");
//        haszhasz.put("B","2");
//        haszhasz.put("C","3");
//        haszhasz.put("D","4");
//        haszhasz.put("E","5");
//        haszhasz.put("F","6");
//
//        haszhasz.remove("A");
//
//        boolean hasAKey = haszhasz.containsKey("A");
//        boolean hasBKey = haszhasz.containsKey("B");
//        boolean hasCKey = haszhasz.containsValue("6");
//        System.out.println("I have A:" + hasAKey);
//        System.out.println("I have B:" + hasBKey);
//        System.out.println("I have C:" + hasCKey);
//
//        for (Map.Entry<String, String> next: haszhasz.entrySet()){
//            System.out.println("I have " + next.getKey() + " number " + next.getValue());
//
//        }
//        MathCountingMaster object = new MathCountingMaster();
//        object.doMathOperation("+",5);
//        double newNumberAfterOperation = object.getCurrentNumber();
//        System.out.println(newNumberAfterOperation);
//
//        Shape[] shapes = new Shape[2];
//        shapes[0] = new Rectangle(5,5);
//        shapes[1] = new Triangle(3,1);
//        float sumOfFields = 0;
//        for (int i = 0; i < 2; i++) {
//            sumOfFields += shapes[i].calculatedField();
//        }
//        System.out.println(sumOfFields);

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its Even or Odd: ");
        num = sc.nextInt();
        System.out.println((num % 2) == 0 ? "even number" : "odd number");
    }

}
