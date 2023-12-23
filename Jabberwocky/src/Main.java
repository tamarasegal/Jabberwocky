import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        File f = new File("Jabberwocky.txt");
        try {
            Scanner scan = new Scanner(f);
            int [] letterCounts = new int [256];
            while (scan.hasNextLine()) {
                String s = scan.nextLine().toLowerCase() ;
                for (int i = 0; i < s.length(); i ++) {
                    char someChar = s.charAt(i);
                    ++letterCounts[someChar];
                }
            }
            for (char i = 'a'; i < 'z'; i++) {
                System.out.println( i + ":" + letterCounts[i]);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File cannot be found");
        }



    }
}