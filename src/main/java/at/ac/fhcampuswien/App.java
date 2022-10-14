package at.ac.fhcampuswien;

import java.util.Scanner;
public class App {

    //todo Task 1
    public void largestNumber(){
        int count = 1;
        int i, large, num;
        float num;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number " + count++ + ": ");
            num = sc.nextInt();
        }
        while (num !=0);
            System.out.println("The largest number is " + num);
        }

        for(i=0; i<10; i++)
        arr[i] = scan.nextInt();

        large = arr[0];
        for(i=1; i<10; i++){
            if(large<arr[i])
            large = arr[i];
        }
        System.out.println("The largest number is " +large);
    }

    //todo Task 2
    public void stairs(){
        // initialising starting number
        int i, j, num=1;

        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {

            // without re assigning num
            // num = 1;
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                // incrementing num at each column
                num = num + 1;
            }

            // ending line after each row
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        int rows = 6, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        //char c = "H";

        //System.out.println();
        //System.out.println((int)c);

    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        int n = 4;
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}