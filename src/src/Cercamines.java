import java.util.Scanner;
public class Cercamines {
    public static void main(String[] args) {
        int linia = 8; // nombre de files
        int columna = 8; // nombre de columnes
        int numMines = 10; // nombre de mines

        char[][] taulell = new char[linia][columna];
        boolean[][] revelat = new boolean[linia][columna];

        // Inicialitza el taulell
        mostrartauler(taulell);

        Scanner scanner = new Scanner(System.in);

        // Mostra el taulell completament revelat
        pintatauler(taulell, revelat);
    }
    // Inicialitza el taulell amb caselles ocultes
    public static void mostrartauler(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    // Mostra el taulell amb les caselles revelades
    public static void pintatauler(char[][] tauler, boolean[][] revelat) {
        System.out.println("Taulell:");
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (revelat[i][j]) {
                    System.out.print(tauler[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void colocarmines(){




    }

}







