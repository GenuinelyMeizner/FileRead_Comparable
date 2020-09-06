package Excercise_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Read read = new Read();

        Write write = new Write();

        read.readFile();

        System.out.println();

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Write to file: ");
        String input = scanInput.nextLine();

        write.writeFile(input);

        read.readFile();
    }
}
