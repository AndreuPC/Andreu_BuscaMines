import java.util.Scanner;
public class Cercamines {
    public static void main(String[] args) {
        int linia = 8; // nombre de files
        int columna = 8; // nombre de columnes
        int numMines = 10; // nombre de mines

        char[][] taulell = new char[linia][columna];

        // Inicialitza el taulell
        mostrartauler(taulell);

        Scanner scanner = new Scanner(System.in);

    }
    // Inicialitza el taulell amb caselles ocultes
    public static void mostrartauler(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }



}







