//Charles Madsen
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
    try{
      File TxtI = new File("D:/Downloads/JavaIO/src/main/java/input.txt");
      File TxtO = new File("D:/Downloads/JavaIO/src/main/java/output.txt");
      Scanner textReader = new Scanner(TxtI);
      FileWriter textW = new FileWriter(TxtO);
      
      while(textReader.hasNextLine()) {
        String txtinput = textReader.nextLine();
        String[] words = txtinput.split(" ");
        StringBuilder output = new StringBuilder();
        for(String word : words) {
         output.append(word.toUpperCase()).append(" ");
        
        }
        System.out.println("This is what will be written in output.txt: " +output);
        textW.write(output.toString());
      }
      textW.close();
      textReader.close();
    }catch(IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }}}  
