import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        1-Write a Java program that accept three numbers from the user and print the largest number .

        int[] numbers = new int[3];
        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter first number: ");
        numbers[1] = input.nextInt();
        System.out.print("Enter first number: ");
        numbers[2] = input.nextInt();
        int largest = numbers[0];
        for (int number : numbers){
            if(number > largest){
                largest = number;
            }
        }
        System.out.println(largest);
//======================================================================================================================

//        2-Write a Java program that accept a String and a number from the user,then print the character in the given index .

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.print("Enter the index from 0 to " + (word.length() - 1) + ": ");
        int index = input.nextInt();

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt(index)) {
                System.out.println("Character (" + word.charAt(index) + ")");
                return;
            }
        }
//======================================================================================================================

//        3-Write a program to enter the numbers till the user wants and at the end it should display the sum entered .

        int sum = 0;
        String stop;
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            sum += number;
            input.nextLine();
            System.out.print("Do you want continue? (Y/N): ");
            stop = input.nextLine().toLowerCase();
        }while(stop.equals("y"));

        System.out.println("Sum of numbers: " + sum);
//======================================================================================================================

//        4-Write a Java program to find positive and negative numbers of a given array:

        int[] check = {10, -21, 30, 31, -25};

        for (int c : check){
            if(c < 0){
                System.out.println(c + " is a negative number");
            }else {
                System.out.println(c + " is a positive number");
            }
        }
//======================================================================================================================

//        5-Write a Java program to find a shortest word of a given array:

        String[] words = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        String shorest = words[0];

        for(String word : words){
            if(word.length() < shorest.length()){
                shorest = word;
            }
        }
        System.out.println(shorest);
//======================================================================================================================

    }
}