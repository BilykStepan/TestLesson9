import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mrArray = {1, 12, 5555, 2, 3, 24, 117, -12, -223, 0};
        int sum = 0;
        ArraySum.sumOfElements(mrArray);
        System.out.println(ArraySum.sumOfElementsRecursive(mrArray, mrArray.length-1,sum));
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int number = input.nextInt();
//        for (int i = 1; i <= number; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println("\nEnter your number(recursive): ");
//        number = input.nextInt();
//        recursiveOut(number);
//    }
//
//        public static int recursiveOut(int in_number) {
//            if (in_number <= 1) {
//                System.out.print("1");
//                return 1;
//            } else {
//                System.out.print(in_number + "\t");
//                return in_number = in_number - recursiveOut(in_number - 1);
//            }
//
//        }
}