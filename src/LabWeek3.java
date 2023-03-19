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

        //create a new variable called average and assign it the average value of the array to it

        System.out.println(" ");//Peace of Mind

        double average = (double) sum / array.length;
        System.out.println(average);

        // write an enhanced loop that prints out each number in the array that is odd

        System.out.println(" ");//Peace of Mind

        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println(" ");

        //create an array that contains the values "Sam, Sally, Thomas and Robert

        String[] firstNames = new String[]{"Sam", "Sally", "Thomas", "Robert"};
        System.out.println(firstNames[0]);

        System.out.println(" ");//Peace of mind

        //calculate the sum of all the letters in the last array

        int totalLetters = 0;
        for (String names : firstNames)  {
            totalLetters += names.length();
            System.out.println(totalLetters);
        }



        System.out.println(" ");//Peace of mind

        //write and test a method that takes a String name and prints out a greeting, this method returns nothing
        // See Method "Greet"

        //greet("Tom");

        System.out.println(" ");//Peace of mind

        //write and test a method that takes a String name and returns a greeting do not print in the method
        System.out.println(greet2("Bobby"));

        //write and test a method that takes a string and an fint and returns true if the numbers of letters in the string is greater than the int
        System.out.println(stringGreaterInt("dandyascandy", 5));

    }
    public static void greet(String name) {
        System.out.println("Hello " + name);//Greet Method
    }
    public static String greet2(String name) {
        return "Hi " + name;
    }
    public static boolean stringGreaterInt(String letters, int number) {
        if (letters.length() > number) {
            return true;
        } else {
            return false;
        }
    }
}
