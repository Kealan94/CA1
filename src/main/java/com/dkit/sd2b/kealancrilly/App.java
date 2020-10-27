package com.dkit.sd2b.kealancrilly;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class App {

    public static void main(String[] args) {

        readWordsAndNumbers("JC_Results.txt");
    }
    public static void readWordsAndNumbers(String File) {

        System.out.println("Reading mixture of words, and numbers from text file");

        try {

            Scanner sc = new Scanner(new File("C:\\Users\\Kealan\\IdeaProjects\\CA1\\src\\main\\java\\JC_Results.txt"));

            while (sc.hasNext()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

/*public class App {

    public static void main(String[] args) {
        int selectFiveGrades;
        double calculateAverage;
    }

    ;

    public void selectFiveGrades(int[] codes, int[] grades) {
        codes = new int[10];
        grades = new int[10];

    }

    private double calculateAverage(int[] selectedGrades) {
        selectedGrades = new int[5];
    }
}
 */
