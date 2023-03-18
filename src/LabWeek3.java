public class LabWeek3 {
    public static void main(String[] args) {
        //create an array with the following values: 1, 5, 2, 8, 13, 6
        int[] array = {1, 5, 2, 8, 13, 6};

        //print out the first element in the array
        System.out.println(array[0]);

        //print out the last element in the array without using the number 5

        System.out.println(array[array.length - 1]);

        //print out the element in the array at position 6. What happens?

        //System.out.println(array[6]);

        //print out the element in the array at position -1. What happens?

        // System.out.println(array[-1]);

        //write a traditional for loop that prints out each element in the array

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //write an enhanced for loop that prints out each element in the arrray

        System.out.println(" ");//Peace of Mind

        for (int element : array) {
            System.out.println(element);
        }

        //create a new variable called sum, write a loop that adds each element in the array to the sum

        System.out.println(" ");//Peace of Mind

        int sum = 0;

        for (int number : array) {
            sum += number;
            System.out.println(sum);
        }




    }
}
