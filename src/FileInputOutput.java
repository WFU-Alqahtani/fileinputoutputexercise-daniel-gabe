import java.io.FileInputStream;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {
//
        FileInputStream file = null;            //this inputStream is for printing all  line
        FileInputStream Jimmy = null;           //this inputStream is for printing the movie names

        try{
            file = new FileInputStream("src/moviesDataset.csv");
        }
        catch(java.io.FileNotFoundException x){
            System.out.println("Sorry, no matching file found. Please restart the program");
            System.exit(1);
        }
        Scanner readFile = new Scanner(file);
        while(readFile.hasNextLine()){
            String data = readFile.nextLine();
            System.out.println(data);
        }

        try{
            Jimmy = new FileInputStream("src/moviesDataset.csv");
        }
        catch(java.io.FileNotFoundException x){
            System.out.println("Sorry, no matching file found. Please restart the program");
            System.exit(1);
        }

        Scanner readFile1 = new Scanner(Jimmy);
        while(readFile1.hasNextLine()){
            String data1 = readFile1.nextLine();
            String[] Array = data1.split(",");
            System.out.println(Array[2]);
        }

        readFile.close();
    }

}