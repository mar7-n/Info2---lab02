import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class histogram {
    public static void main (String [] args) throws IOException {
        histogram h = new histogram();
        //h.normalize('I');
        //h.nextCharacter(h.readFile(),0);
        h.transformToFile();
        h.characterFrequency();
    }

    private char normalize(char a) {
        int b = (int) a;
        if(((int) a <= 90) && ((int) a) >= 65){
            b = (int) a + 32;
        }
        //System.out.println((char) b);
        return (char) b;
    }

    private void transformToFile() throws IOException {
        FileWriter myWriter = new FileWriter("fileText.txt");
        myWriter.write("Hola Philipp, como te va?\n");
        myWriter.write("A mi muy bien, y a vos?\n");
        myWriter.write("Pues si.");
        myWriter.close();
    }

    private String readFile() throws FileNotFoundException {
        String s = "";
        File file1 = new File("/Users/martin/IdeaProjects/Lab01 - Info/fileText.txt");
        Scanner myReader = new Scanner(file1);
        while (myReader.hasNextLine()) {
            s = s + myReader.nextLine();
        }
        //System.out.println(s);
        return s;
    }

    private int nextCharacter(String s, int i){
        if(i < s.length()){
            System.out.print(s.charAt(i));
            return s.charAt(i);
        } else return -1;
    }

    private void characterFrequency() throws IOException {
        String s = readFile();
        int[] arrayFrequency = new int[52]; //java initializes arrays automatically with 0 as element

        for(int i=0;i<s.length();i++) { // counting frequency of characters
            int aux = nextCharacter(s,i);
            if((65<=aux) && (aux<=90)) {
                arrayFrequency[aux-65]++;
            } else if((97<=aux) && (aux<=122)) {
                arrayFrequency[aux-71]++;
            }
        }

        FileWriter myWriter = new FileWriter("frequency.txt"); // create the text with each letter and its frequency
        for(int i=0;i<52;i++){
            if(i<26) {
                myWriter.write((char) i + 65);
            } else {
                myWriter.write((char) i + 71);
            }
            myWriter.write(": ");
            String frequency = String.valueOf(arrayFrequency[i]);
            myWriter.write(frequency);
            myWriter.write("\n");
        }
        myWriter.close();
    }
}
