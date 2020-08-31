import java.util.Random;

public class CaesarChiffre {
    public static void main(String[] args) {
        Random zufall = new Random();

        //das braucht sicher noch feinschliff, aber soweit meine Lösung zu der Aufgabe:

        int pos = 0;
        String txt = "Ein Charakter namens Caesar!";
        int rotation = zufall.nextInt(25) +1;
        System.out.println(rotation);

        for (int i = 1; i <= txt.length(); i++) {

            char letter = txt.charAt(pos);

            if (letter < 65) {
            } else if (letter < 91) {
                int alphabetStart = 'A';
                letter -= alphabetStart;
                letter += rotation;
                letter %= 26;
                letter += alphabetStart;
            } else {
                int alphabetStart = 'a';
                letter -= alphabetStart;
                letter += rotation;
                letter %= 26;
                letter += alphabetStart;
            }
            System.out.print(letter);
            pos++;
        }


    }
}
