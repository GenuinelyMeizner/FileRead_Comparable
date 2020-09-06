package Excercise_2;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public void writeFile(String input) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\frede\\IdeaProjects\\FileRead_Comparable\\Resources\\Resources.txt", true);
            myWriter.write("\n" + input);
            myWriter.close();
            System.out.println("Succesfully wrote to file");
        }
        catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
