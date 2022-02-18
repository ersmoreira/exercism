import java.util.Locale;

class Scrabble {

    private static String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int soma = 0;
        char ch;

        if (word != null) {
            for (int pos = 0; pos < word.length(); pos++) {
                ch = word.charAt(pos);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'L' || ch == 'N' || ch == 'R' || ch == 'S' || ch == 'T') {
                    soma += 1;
                } else if (ch == 'D' || ch == 'G') {
                    soma += 2;
                } else if (ch == 'B' || ch == 'C' || ch == 'M' || ch == 'P') {
                    soma += 3;
                } else if (ch == 'F' || ch == 'H' || ch == 'V' || ch == 'W' || ch == 'Y') {
                    soma += 4;
                } else if (ch == 'K') {
                    soma += 5;
                } else if (ch == 'J' || ch == 'X') {
                    soma += 8;
                } else if (ch == 'Q' || ch == 'Z') {
                    soma += 10;
                }

            }
        }
        return soma;
    }

}
