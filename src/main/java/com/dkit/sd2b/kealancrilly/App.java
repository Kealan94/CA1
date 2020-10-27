//D00224427 Kealan Crilly
package com.dkit.sd2b.kealancrilly;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws IOException {
        //selectFiveGrades();
        //calculateAverage();
        readLineByLine("JC_Results.txt");
    }

    public static void readLineByLine(String file) {
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

    public int selectFiveGrades(int codes[], int grades[]) {
        codes = new int[1];
        codes[0] = 891234;
        codes[1] = 783461;

        grades = new int[8];
        grades[0] = 65;
        grades[1] = 58;
        grades[2] = 45;
        grades[3] = 60;
        grades[4] = 50;
        grades[5] = 48;
        grades[6] = 42;
        grades[7] = 42;
        {
            for (int i = 0; i < codes.length; i++) {
                {
                    System.out.println("codes" + "");
                }
            }
            for (int i = 0; i < grades.length - 3; i++) {
                while (grades[i] == codes[1]) {
                    System.out.println(codes);
                }
                {
                    if (grades[i] != codes[1]) {
                        {
                            System.out.println("grades" + grades);
                        }
                    }
                }
            }

            //private double calculateAverage(int[] selectedGrades){
            int sum = 0;
            int total = 0;
        }

                 return 0;
    }
}




