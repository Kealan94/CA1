package com.dkit.sd2b.kealancrilly;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws IOException {
        //int selectFiveGrades();

        double calculateAverage;
        //readStudentFile("JC_Results.txt");
        readLineByLine ("JC_Results.txt");
    }
    public static void readLineByLine(String file)
    {
        System.out.println("Read and output text file line-by-line");

        try {
            Scanner scan = new Scanner(new File("C:\\Users\\Kealan\\IdeaProjects\\CA1\\src\\main\\java\\JC_Results.txt"));

            while (scan.hasNext()) {
                String str = scan.nextLine();
                System.out.println(str);
            }
            scan.close();
        } catch (IOException e) {
        }
    }
    /*public static void readStudentFile(String File) {

        System.out.println("Reading in the student numbers and marks");

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Kealan\\IdeaProjects\\CA1\\src\\main\\java\\JC_Results.txt"));
            //sc.useDelimiter("[,\r\n]+");
            while (sc.hasNext()) {

                String Student_Number = sc.nextLine();
                String Subject_Code = sc.nextLine();
                Integer Mark = sc.nextInt();
                System.out.println(Student_Number);
                System.out.println(Subject_Code);
                System.out.println(Mark);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occurred, the file could not be found.");
        }
    }*/

    private double calculateAverage(int[] selectedGrades) {
        {

        }
        return 3.5;
    }



    public int selectFiveGrades(int codes[], int grades[]) {
        codes = new int[1];
        codes[0] = 6788;
        codes[1] = 6799;

        grades = new int[8];
        grades[0] = 54;
        grades[1] = 43;
        grades[2] = 83;
        grades[3] = 27;
        grades[4] = 39;
        grades[5] = 50;
        grades[6] = 61;
        {
            for (int i = 0; i < codes.length; i++) {
                {
                    System.out.println("codes" + "");
                }
            }
            return 4657;
        }

    }
}