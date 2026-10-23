import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        Random losuj = new Random();

        int[] liczby1 = {10, 20, 30, 40, 50, 60};
        String[] slowa1 = {"kot", "pies", "ryba", "ptak", "chomik"};

        System.out.println("Co drugi element tablicy liczb:");
        for (int i = 0; i < liczby1.length; i = i + 2) {
            System.out.println(liczby1[i]);
        }

        System.out.println("Co drugi element tablicy slow:");
        for (int i = 0; i < slowa1.length; i = i + 2) {
            System.out.println(slowa1[i]);
        }

        int[] tablica2 = {5, 12, -3, 47, 8, 33, 0, 46};

        int najwieksza = tablica2[0];
        for (int i = 1; i < tablica2.length; i++) {
            if (tablica2[i] > najwieksza) {
                najwieksza = tablica2[i];
            }
        }
        System.out.println("Najwieksza liczba w tablicy to: " + najwieksza);

        String[] tablica3 = {"java", "Programowanie", "tablica", "Komputer", "szkola"};

        System.out.println("Slowa wielkimi literami:");
        for (String slowo : tablica3) {
            System.out.println(slowo.toUpperCase());
        }

        String[] slowa4 = new String[5];
        for (int i = 0; i < slowa4.length; i++) {
            System.out.print("Podaj slowo numer " + (i + 1) + ": ");
            slowa4[i] = skaner.next();
        }

        for (int i = slowa4.length - 1; i >= 0; i--) {
            String slowo = slowa4[i];
            String odwrocone = "";
            for (int j = slowo.length() - 1; j >= 0; j--) {
                odwrocone = odwrocone + slowo.charAt(j);
            }
            System.out.println(odwrocone);
        }

        int[] liczby5 = new int[8];
        for (int i = 0; i < liczby5.length; i++) {
            System.out.print("Podaj liczbe numer " + (i + 1) + ": ");
            liczby5[i] = skaner.nextInt();
        }

        // sortowanie babelkowe
        for (int i = 0; i < liczby5.length - 1; i++) {
            for (int j = 0; j < liczby5.length - 1 - i; j++) {
                if (liczby5[j] > liczby5[j + 1]) {
                    int pomocnicza = liczby5[j];
                    liczby5[j] = liczby5[j + 1];
                    liczby5[j + 1] = pomocnicza;
                }
            }
        }

        System.out.println("Liczby posortowane rosnaco:");
        for (int i = 0; i < liczby5.length; i++) {
            if (i == liczby5.length - 1) {
                System.out.println(liczby5[i]);
            } else {
                System.out.print(liczby5[i] + ", ");
            }
        }

        int[] liczby6 = new int[5];
        for (int i = 0; i < liczby6.length; i++) {
            System.out.print("Podaj liczbe numer " + (i + 1) + ": ");
            liczby6[i] = skaner.nextInt();
        }

        for (int i = 0; i < liczby6.length; i++) {
            int n = liczby6[i];
            if (n < 0) {
                System.out.println("Silnia z liczby " + n + " nie istnieje");
            } else {
                long silnia = 1;
                for (int j = 2; j <= n; j++) {
                    silnia = silnia * j;
                }
                System.out.println("Silnia z " + n + " = " + silnia);
            }
        }

        String[] pierwsza = {"ala", "ma", "kota", "i", "psa"};
        String[] druga = {"ala", "ma", "kota", "i", "psa"};

        boolean takieSame = true;
        if (pierwsza.length == druga.length) {
            for (int i = 0; i < pierwsza.length; i++) {
                if (pierwsza[i].equals(druga[i]) == false) {
                    takieSame = false;
                }
            }
        } else {
            takieSame = false;
        }

        if (takieSame) {
            System.out.println("Tablice sa takie same");
        } else {
            System.out.println("Tablice sa rozne");
        }

        int[] tablica8 = new int[10];
        for (int i = 0; i < tablica8.length; i++) {
            tablica8[i] = losuj.nextInt(21) - 10;
        }

        System.out.println("Zawartosc tablicy:");
        for (int i = 0; i < tablica8.length; i++) {
            System.out.print(tablica8[i] + " ");
        }
        System.out.println();

        int min = tablica8[0];
        int max = tablica8[0];
        int suma = 0;
        for (int i = 0; i < tablica8.length; i++) {
            if (tablica8[i] < min) {
                min = tablica8[i];
            }
            if (tablica8[i] > max) {
                max = tablica8[i];
            }
            suma = suma + tablica8[i];
        }
        System.out.println("Najmniejszy element: " + min);
        System.out.println("Najwiekszy element: " + max);

        double srednia = (double) suma / tablica8.length;
        System.out.println("Srednia arytmetyczna: " + srednia);

        int mniejsze = 0;
        int wieksze = 0;
        for (int i = 0; i < tablica8.length; i++) {
            if (tablica8[i] < srednia) {
                mniejsze++;
            }
            if (tablica8[i] > srednia) {
                wieksze++;
            }
        }
        System.out.println("Elementow mniejszych od sredniej: " + mniejsze);
        System.out.println("Elementow wiekszych od sredniej: " + wieksze);

        System.out.println("Tablica w odwrotnej kolejnosci:");
        for (int i = tablica8.length - 1; i >= 0; i--) {
            System.out.print(tablica8[i] + " ");
        }
        System.out.println();

        int[] tablica9 = new int[20];
        for (int i = 0; i < tablica9.length; i++) {
            tablica9[i] = losuj.nextInt(10) + 1;
        }

        System.out.println("Zawartosc tablicy:");
        for (int i = 0; i < tablica9.length; i++) {
            System.out.print(tablica9[i] + " ");
        }
        System.out.println();

        // licznik[k] to ile razy wystapila liczba k
        int[] licznik = new int[11];
        for (int i = 0; i < tablica9.length; i++) {
            licznik[tablica9[i]]++;
        }

        for (int k = 1; k <= 10; k++) {
            System.out.println("Liczba " + k + " wystepuje " + licznik[k] + " razy");
        }
    }
}
