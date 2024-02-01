import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {
//
        FileInputStream myFile = null;
        FileOutputStream changeFile = null;

        try {
            myFile = new FileInputStream("moviesDataset.csv");
            changeFile = new FileOutputStream("newFile.csv",true);
        }
        catch (FileNotFoundException nfe){
            System.out.println("File not found");
            System.exit(1);
        }

        Scanner fileReader = new Scanner(myFile);
        PrintWriter change = new PrintWriter(changeFile);

        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            String[] fail = data.split(",");

            try{
                int checkNum = Integer.parseInt(fail[4]);
                change.println(fail[4]);
            }
            catch(NumberFormatException nfe){
                change.println("NA");
            }

        }


    fileReader.close();

    }

}