public class CaesarCipherDecoder {
    public static void main(String[] args) {
        String encoded = "khoor zruog";
        String[] words = encoded.split(" ");
        String decodedWords = "";
        for (String word : words) {
            String decoded = "";
            for (int i = 0; i < word.length(); i++) {
                decoded += (char) (word.charAt(i) - 3);
            }
            decodedWords += decoded + " ";

        }

        System.out.println("Decoded: " + decodedWords.trim());
    }
}
