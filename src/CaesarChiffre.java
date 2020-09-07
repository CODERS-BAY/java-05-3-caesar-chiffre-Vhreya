import java.util.Random;

public class CaesarChiffre {
    public static void main(String[] args) {
        Random zufall = new Random();

        //ja das macht Sinn

        String txt = "Ein Charakter namens Caesar!";
        int rotation = zufall.nextInt(25) + 1;
        System.out.println(rotation);

        for (int i = 1; i <= txt.length(); i++) {

            char letter = txt.charAt(i-1);

            // das mit den Modifikationszuweisungen hatte ich so aus dem Buch übernommen, so sieht das natürlich schöner aus xD

            if (letter < 65) {
            } else if (letter < 91) {
                char newLetter = (char) ('A' + (letter - 'A' + rotation) % 26);
            } else {
                char newLetter = (char) ('a' + (letter - 'a' + rotation) % 26);
            }
            System.out.print(letter);
        }


    }
}
