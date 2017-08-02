package exercises;

/* Assignment:
ArrayList: Write a static method to find the sum of all the even numbers in a list. Within main,
create a list with at least 10 integers and call your method on the list.
 */

public class EvenNumbers {
    public static void main(String[] args) {

    int[] numbers = {3, 5, 8, 4, 55, 9, 0, 23, 56, 20, 78, 22, 10, 2 };

    int sum = sumOfEven(numbers);

    System.out.println("Sum of all evens is: " + sum);

    }


    private static int sumOfEven(int[] list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }


}
