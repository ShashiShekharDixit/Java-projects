import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        String text = "Hello File\nSecond Line";
        try (FileWriter fw = new FileWriter("out.txt");
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter pw = new PrintWriter(bw)) {
                pw.println(text);
                System.out.println("Wrote to out.txt");
        } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}