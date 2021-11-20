package Task_5;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner reader = new Scanner(System.in);
             InputStream inputStream = new FileInputStream(reader.nextLine()))
        {
            Scanner buf = new Scanner(inputStream);
            while (buf.hasNextLine()){
                System.out.println(buf.nextLine());
            }
        }
    }
}