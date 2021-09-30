import java.util.Scanner;

public class TheCodeBreaker {

    //Encoder methode
    public static String numberCypherEncoder(String Word) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String encodedString = "";

        for (int i = 0; i < Word.length(); i++) {
            char stringToIndex = Word.charAt(i);

            int charToIndex = alphabet.indexOf(stringToIndex + 1);

            encodedString = encodedString + charToIndex + ";";
        }

        return encodedString;
    }

    public static String numberCypherDecoder(int)


    public static void main(String[] args) {

        //Encoder
        String BrammingEncoded = numberCypherEncoder("bramming");
        System.out.println(BrammingEncoded);

        String ElevatorEncoded = numberCypherEncoder("elevator");
        System.out.println(ElevatorEncoded);


        //Decode



    }
}


