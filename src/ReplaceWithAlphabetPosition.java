import java.util.Arrays;

public class ReplaceWithAlphabetPosition {
    public static void main(String[] args) {
        System.out.println(alphabetPosition("Hello"));
    }
    static String alphabetPosition(String text) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] eachChar = text.toLowerCase().split("");
        String output = "";

        for (String s : eachChar) {
            if(s.matches("[a-z]")){
                output+= " "+Arrays.asList(alphabets.split("")).indexOf(s);
            }
        }

        return output.trim();
    }
}