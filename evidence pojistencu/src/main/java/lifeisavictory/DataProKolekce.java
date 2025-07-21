package lifeisavictory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProKolekce {

    Random random = new Random();

    /**
     * Generuje nahodne jmeno z kolekce
     *
     * @return jmeno jako String
     */
    public String generujJmeno() {
        int nahodnyIndex = random.nextInt(jmenaPojistencu.size());
        String jmeno = jmenaPojistencu.get(nahodnyIndex);
        return jmeno;
    }

    /**
     * Generuje nahodne prijmeni z kolekce
     *
     * @return prijmeni jako String
     */
    public String generujPrijmeni() {
        int nahodnyIndex = random.nextInt(prijmeniPojistencu.size());
        String prijmeni = prijmeniPojistencu.get(nahodnyIndex);
        return prijmeni;
    }

    /**
     * Generuje nahodne telefonni cislo z kolekce
     *
     * @return telefonni cislo jako String
     */
    public String generujTelefonniCislo() {
        int nahodnyIndex = random.nextInt(telefonniCislaPojistencu.size());
        String telefonniCislo = telefonniCislaPojistencu.get(nahodnyIndex);
        return telefonniCislo;
    }

    /**
     * Generuje nahodne vek z kolekce
     *
     * @return cislo od 18 do 75 jako Integer
     */
    public Integer generujVek() {
        int nahodnyIndex = random.nextInt(stariPojistencu.size());
        Integer vek = stariPojistencu.get(nahodnyIndex);
        return vek;
    }


    /**
     * Seznam ceskych jmen
     */
    List<String> jmenaPojistencu = new ArrayList<>(Arrays.asList(
            // Mužská jména
            "Jan", "Petr", "Josef", "Martin", "Tomáš",
            "Jakub", "David", "Marek", "Pavel", "Václav",
            "Michal", "Radek", "Daniel", "Filip", "Karel",
            "Lukáš", "Jirka", "Aleš", "Roman", "Matěj",
            "Richard", "Šimon", "Vladimír", "Dominik", "Vladislav",
            "Jindřich", "Milan", "Svatopluk", "František", "Ladislav",
            "Jaroslav", "Štěpán", "Zdeněk", "Martin", "Radim",
            "Kryštof", "Vít", "Matyáš", "Erik", "Dalibor",
            // Ženská jména
            "Marie", "Anna", "Eva", "Jana", "Petra",
            "Lucie", "Kateřina", "Hana", "Monika", "Tereza",
            "Barbora", "Martina", "Veronika", "Kristýna", "Zuzana",
            "Alena", "Simona", "Ivana", "Dagmar", "Michaela",
            "Eliška", "Jitka", "Gabriela", "Věra", "Růžena",
            "Sofia", "Nela", "Kristina", "Bohdana", "Ludmila",
            "Barbora", "Liana", "Marta", "Natálie", "Viktorie",
            "Sabrina", "Tamara", "Olga", "Adéla", "Karla",
            "Nina", "Diana", "Miriam", "Rita", "Tereza",
            "Michaela", "Berenika", "Květa", "Sněžana", "Valentina"
    ));


    /**
     * Seznam ceskych prijmeni
     */
    List<String> prijmeniPojistencu = new ArrayList<>(Arrays.asList(
            "Novák", "Svoboda", "Novotný", "Dvořák", "Černý",
            "Procházka", "Horák", "Růžička", "Krátký", "Beneš",
            "Šimek", "Kučera", "Kovář", "Šťastný", "Hruška",
            "Pospíšil", "Krejčí", "Kříž", "Mašek", "Čech",
            "Fiala", "Krajčír", "Konečný", "Štěpánek", "Křížek",
            "Vacek", "Bartoš", "Kovařík", "Tichý", "Janda",
            "Holub", "Čermák", "Vondráček", "Školník", "Příhoda",
            "Konečný", "Kováček", "Zelený", "Krajča", "Vlasák",
            "Březina", "Krajčír", "Pěkný", "Štěpán", "Zeman",
            "Klement", "Varga", "Černý", "Štípek", "Vojtěch",
            "Šebesta", "Koutný", "Kovář", "Hnětka", "Varga",
            "Zábranský", "Kanál", "Kovařík", "Hladík", "Krajča",
            "Šebek", "Pospíšil", "Čechura", "Varga", "Krajčík",
            "Šrámek", "Bělohlávek", "Šťastný", "Vondrášek", "Konečný",
            "Šimek", "Šebesta", "Holý", "Mach", "Nosek",
            "Vondráček", "Hnědokočka", "Ledecký", "Presley", "Pažout",
            "Kropáček", "Zeman", "Hnízdil", "Gott", "Farný",
            "Ostrouhal"
    ));

    /**
     * Pevne definovana kolekce telefonnich cisel
     */
    List<String> telefonniCislaPojistencu = new ArrayList<>(Arrays.asList(
            "+420123456789", "+420987654321", "+420234567890", "+420876543210",
            "+420345678901", "+420765432109", "+420456789012", "+420654321098",
            "+420567890123", "+420543210987", "+420678901234", "+420432109876",
            "+420789012345", "+420321098765", "+420890123456", "+420210987654",
            "+420901234567", "+420109876543", "+420012345678", "+420098765432",
            "+420135792468", "+420246813579", "+420357924680", "+420468135792",
            "+420579246813", "+420680357924", "+420791468135", "+420802579246",
            "+420913680357", "+420024791468", "+420135802579", "+420246913680",
            "+420357024791", "+420468135802", "+420579246913", "+420680357024",
            "+420791468135", "+420802579246", "+420913680357", "+420024791468",
            "+420135802579", "+420246913680", "+420357024791", "+420468135802",
            "+420579246913", "+420680357024", "+420791468135", "+420802579246",
            "+420913680357", "+420024791468", "+420135802579", "+420246913680",
            "+420357024791", "+420468135802", "+420579246913", "+420680357024",
            "+420791468135", "+420802579246", "+420913680357", "+420024791468",
            "+420135802579", "+420246913680", "+420357024791", "+420468135802",
            "+420579246913", "+420680357024", "+420791468135", "+420802579246",
            "+420913680357", "+420024791468", "+420135802579", "+420246913680",
            "+420357024791", "+420468135802", "+420579246913", "+420680357024",
            "+420791468135", "+420802579246", "+420913680357", "+420024791468",
            "+420135802579", "+420246913680", "+420357024791", "+420468135802"
    ));

    /**
     * Pevne definovana kolekce veku pojistencu
     */
    List<Integer> stariPojistencu = Arrays.asList(
            18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
            28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
            38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
            58, 59, 60, 61, 62, 63, 64, 65, 66, 67,
            68, 69, 70, 71, 72, 73, 74, 75
    );


}