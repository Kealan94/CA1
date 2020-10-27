package com.dkit.sd2b.kealancrilly;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws IOException {
        int selectFiveGrades;
        double calculateAverage;
        readWordsAndNumbers("JC_Results.txt");
    }

    public static void readWordsAndNumbers(String File) {

        System.out.println("Reading in the student codes and marks");

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Kealan\\IdeaProjects\\CA1\\src\\main\\java\\JC_Results.txt"));

            while (sc.hasNext()) {
                String Student_Number = sc.nextLine();
                String Subject_Code = sc.nextLine();
                System.out.println(Student_Number);
                System.out.println(Subject_Code);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occurred, the file could not be found.");
        }
    }


    public int[] selectFiveGrades(int[] codes, int[] grades) {
        for (int i = 0; i<codes.length; i++){
            if(codes[i]==English)
        }
        {
            System.out.println("codes" + codes);
        codes = new int[10];
        grades = new int[10];

    }

    private double calculateAverage(int[] selectedGrades) {
        selectedGrades = new int[5];
    }
}
        return  selectedGrades;

}