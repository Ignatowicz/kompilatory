import java.io.*;
import java.net.URL;
import java.util.List;

public class FileManager {


    public static void saveFile(String lines, String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(lines);
            printWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static String readFile(String fileName){
        FileReader fileReader = null;
        URL path = FileManager.class.getResource(fileName);
        File file = new File(path.getFile());

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error while opening file");
            System.exit(1);
        }

        StringBuilder code = new StringBuilder();
        String line = "";

        BufferedReader bfr = new BufferedReader(fileReader);
        try {
            while((line = bfr.readLine()) != null){
                code.append(line);
                code.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }

        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
        return code.toString();
    }



}
