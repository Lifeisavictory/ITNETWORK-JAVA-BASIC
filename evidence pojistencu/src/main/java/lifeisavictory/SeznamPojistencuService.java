package lifeisavictory;

import java.util.Scanner;

public class SeznamPojistencuService {


    private final SeznamPojistencu seznamPojistencu = new SeznamPojistencu();


    /**
     * VLOZENI TESTOVACICH DAT
     */
    DataProKolekce dataProKolekce = new DataProKolekce();

    public void vlozeniTestovacichDat() {
        for (int i = 0; i < 200; i++) {
            seznamPojistencu.zadejNovehoPojistence(dataProKolekce.generujJmeno(), dataProKolekce.generujPrijmeni(), dataProKolekce.generujTelefonniCislo(), dataProKolekce.generujVek());
        }
    }

    /**
     * ZADANI NOVEHO POJISTENCE
     */
    public void zadejNovehoPojistence() {
        seznamPojistencu.zadejNovehoPojistence(zadejJmenoPojistence(), zadejPrijmeniPojistence(), zadejTelCisloPojistence(), zadejVekPojistence());
    }

    /**
     * VYPIS VSECH POJISTENCU
     */
    public void vypisVsechnyPojistence() {
        System.out.println("--------------------------------------");
        System.out.println("----- Vypisuji všechny pojištěnce ----");
        System.out.println("--------------------------------------");
        for (Pojistenec pojistenec : seznamPojistencu.vypisVsechnyPojistence()) {
            System.out.println(pojistenec);
        }
        System.out.println();
    }


    /**
     * HLEDANI KONKRETNIHO POJISTENCE
     */
    public void hledejPojistence() {
        System.out.println("--------------------------------------");
        System.out.println("-------- Hledání pojištěnce ----------");
        System.out.println("--------------------------------------");
        String zadaneJmenoPojistence = zadejJmenoPojistence();
        String zadanePrijmeniPojistence = zadejPrijmeniPojistence();
        System.out.println("--------------------------------------");
        System.out.println("---------- Nalezené výsledky ---------");
        System.out.println("--------------------------------------");
        for (Pojistenec pojistenec : seznamPojistencu.hledejPojistence(zadaneJmenoPojistence, zadanePrijmeniPojistence)) {
            System.out.println(pojistenec);
        }
    }


    /*
     * DALŠÍ METODY - jméno, příjmení, telefon, věk
     */

    /**
     * Zadani jmena (podoba s regularnim vyrazem)
     *
     * @return vrací jmeno
     */
    private String zadejJmenoPojistence() {
        return uzivatelskyVstup("Jméno", "^[\\p{L}]+$");
    }


    /**
     * Zadani prijmeni (podoba s regularnim vyrazem)
     *
     * @return vrací prijmeni
     */
    private String zadejPrijmeniPojistence() {
        return uzivatelskyVstup("Příjmení", "^[\\p{L}]+$");
    }


    /**
     * Zadani telefonniho cisla (podoba s regularnim vyrazem)
     *
     * @return telefonni cislo
     */
    private String zadejTelCisloPojistence() {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        boolean validniVstup;
        do {
            System.out.print("Zadej telefonní číslo pojištěnce i s předvolbou +420: ");
            vstup = scanner.nextLine().trim();
            validniVstup = ((vstup.length() == 13) && (vstup.startsWith("+420")) && (vstup.substring(4).matches("\\d+")));
            if (!validniVstup) {
                System.out.println("NEPLATNÝ VSTUP, OPAKUJTE ZADÁNÍ.");
            }
        } while (!validniVstup);
        return vstup;
    }


    /**
     * Zadani veku jako celeho cisla (podoba s regularnim vyrazem)
     *
     * @return vek
     */
    private int zadejVekPojistence() {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        boolean validniVstup;
        do {
            System.out.print("Zadej věk pojištěnce jako celé číslo (rozmezí 18 - 75 let): ");
            vstup = scanner.nextLine().trim();
            validniVstup = (((Integer.parseInt(vstup) >= 18) && (Integer.parseInt(vstup) <= 75)) && (vstup.matches("^[1-9][0-9]$")));
            if (!validniVstup) {
                System.out.println("NEPLATNÁ VSTUP, OPAKUJTE ZADÁNÍ.");
            }
        } while (!validniVstup);
        return Integer.parseInt(vstup);
    }


    /**
     * Metoda pro zadani jmena a prijmeni
     * to neni uživatelkýVstup, ale uživatelskyVstup - :)
     *
     * @param coZadavam      jmeno nebo prijmeni
     * @param regularniVyraz regex
     * @return podle pouziti parametru jmeno nebo prijmeni
     */
    private String uzivatelskyVstup(String coZadavam, String regularniVyraz) {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        boolean validniVstup;
        do { //smycka pro opakovani v pripade spatneho zadani
            System.out.print("Zadejte " + coZadavam + " Pojištěnce: ");
            vstup = scanner.nextLine().trim();
            validniVstup = vstup.matches(regularniVyraz);
            if (!validniVstup) {
                System.out.println("NEPLATNÝ VSTUP, OPAKUJTE ZADÁNÍ.");
            }
        } while (!validniVstup);
        return vstup;
    }


}