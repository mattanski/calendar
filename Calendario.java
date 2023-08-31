package it.apuliadigitalmaker.esercitazioni;

import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        final int NUMERO_MESI = 12;
        int[] numeroGiorniPerMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] giorno = {"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato", "Domenica"};

        // Riempimento del calendario
        String[][] calendario = new String[NUMERO_MESI][];
        int giornoCorrente = 4; // Venerdì
        for (int mese = 0; mese < NUMERO_MESI; mese++) {
            int numGiorni = numeroGiorniPerMese[mese];
            calendario[mese] = new String[numGiorni];
            for (int giornoMese = 0; giornoMese < numGiorni; giornoMese++) {
                calendario[mese][giornoMese] = giorno[giornoCorrente];
                giornoCorrente = (giornoCorrente + 1) % 7;
            }
        }

        // Lettura dell'input dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero del giorno: ");
        int numeroGiorno = scanner.nextInt();
        System.out.print("Inserisci il numero del mese: ");
        int numeroMese = scanner.nextInt();

        // Recupero del giorno corrispondente
        String giornoCercato = calendario[numeroMese - 1][numeroGiorno - 1];
        System.out.println("Il giorno corrispondente è: " + giornoCercato);
    }
}
