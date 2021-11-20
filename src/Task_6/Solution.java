package Task_6;

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine())))
        {
            String text = null;
            while (!(text = reader.readLine()).equals("exit")) {
                bufferedWriter.write(text + '\n');
                bufferedWriter.flush();
            }
            bufferedWriter.write("exit");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
