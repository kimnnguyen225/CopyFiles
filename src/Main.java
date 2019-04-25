import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "Files/DifferentWaysToReadTextFiles.txt";
        String targetFile = "Files/Target.txt";

        /*
        * syntax style try-with-resources
        * Whenever you declare objects within the parentheses after the try keyword, that means
        * that these objects implement a method close(), means they implement an interface named
        *  AutoCloseable. All of these objects need to be closed before you finish what you are
        * up to. By instantiating the objects here, I'll allow the Java runtime to call the close
        *  methods for me.
        * */
        try(
                //create 3 closable objects
                FileReader fReader = new FileReader(sourceFile); //create instance of
                // the FileReader class and assign it to a variable/object named fReader,
                // instantiate FileReader by call the constructor method and pass in file name
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile) //create the target file

        ) {
            while (true) { //create infinite loop
                String line = bReader.readLine(); //read one line at a time, if readLine
                // successfully finds text, it'll return that value as a string, otherwise it
                // will return null (unknown)
                if (line ==  null) { //conditional code to find out whether I got a string I can
                    // work with. line matches with value of null, then break out of while loop
                    break;
                } else { //take the string that I read and write it to the target file with
                    // writer method of FileWriter class
                    writer.write(line + "\n"); //pass in line and line feed, when you call
                    // readLine(), you're only getting text of the line itself, the line feed
                    // that separates the lines is ignored.
                }
            }
            System.out.println("File copied!");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
