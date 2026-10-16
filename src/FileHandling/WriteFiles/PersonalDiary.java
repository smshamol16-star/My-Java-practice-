package FileHandling.WriteFiles;

import java.io.FileWriter;
import java.io.IOException;

public class PersonalDiary {

    public static void main (String[] args){

        try (FileWriter writer = new FileWriter("myDiary.txt")) {
            writer.write("""
                    Hello my name is MD SIAM SARKAR SHAMOL. I live in Bangladesh.
                    I can speak Bangla (mother language), English and Deutsch.
                    I love to learn Java and technical skills.
                    """);
            System.out.println("File has written...");
        }
        catch (IOException e) {
            System.out.println("Something went wrong while writing the file.");
        }
        finally {
            System.out.println("Diary writing process finished.");
        }

    }
}
