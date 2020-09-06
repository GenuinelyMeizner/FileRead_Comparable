package Excercise_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read {

    public void readFile() throws FileNotFoundException {

            int count = 0;

            File resource = new File("C:\\Users\\frede\\IdeaProjects\\FileRead_Comparable\\Resources\\Resources.txt");

            Scanner scan = new Scanner(resource);

            while (scan.hasNextLine()) {
                count++;
                String data = scan.nextLine();
                System.out.println(data);

            }
            scan.close();
            System.out.println(count);
    }
}
