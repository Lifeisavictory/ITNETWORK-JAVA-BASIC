package lifeisavictory;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        SeznamPojistencuService seznamPojistencuService = new SeznamPojistencuService();

        /*
         * ÚVODNÍ OBRAZOVKA
         */
        boolean pokracovaniCyklu = true;
        int volba;
        do {
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("------- Evidence pojištěnců-----------");
            System.out.println("--------------------------------------");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Vypsat všechny pojištěnce");
            System.out.println("3 - Vyhledat pojištěnce");
            System.out.println("4 - Vložení náhodných testovacích dat");
            System.out.println("5 - Konec");
            System.out.print("Vyber si akci: ");
            try {
                volba = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("CATCH - NEPLATNÁ VOLBA, OPAKUJTE ZADÁNÍ.");
                continue;
            }
            if (volba < 1 || volba > 5) {
                System.out.println("IF - NEPLATNÁ VOLBA, OPAKUJTE ZADÁNÍ.");
                continue;
            }
            switch (volba) {
                case 1:
                    seznamPojistencuService.zadejNovehoPojistence();
                    break;
                case 2:
                    seznamPojistencuService.vypisVsechnyPojistence();
                    break;
                case 3:
                    seznamPojistencuService.hledejPojistence();
                    break;
                case 4:
                    seznamPojistencuService.vlozeniTestovacichDat();
                    break;
                case 5:
                    pokracovaniCyklu = false;
                    break;
                default:
                    System.out.println("DEFAULT - NEPLATNÁ VOLBA, OPAKUJ ZADÁNÍ.");
            }
        } while (pokracovaniCyklu);
        System.out.println();
        System.out.println("Děkuji za použití mého prvního projektu.");
    }


}