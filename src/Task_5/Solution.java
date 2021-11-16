package Task_5;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             InputStream inputStream = new FileInputStream(reader.readLine()))
        {
            BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
            while (buf.ready()){
                System.out.println(buf.readLine());
            }
        }
    }
}