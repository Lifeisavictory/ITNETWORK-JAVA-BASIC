package lifeisavictory;

public class Pojistenec {

    private final int id; // unikátní id pojištěnce
    private static int posledniId; //pro navysovani idPojistence o 1
    private final String jmeno; // jméno pojištěnce
    private final String prijmeni; // příjmení pojištěnce
    private final String telCislo; // telefonní číslo pojištěnce
    private final int vek; // věk pojištěnce

    /**
     * KONSTRUKTOR
     *
     * @param jmenoPojistence    jmeno pojistence
     * @param prijmeniPojistence prijmeni pojistence
     * @param telCisloPojistence telefonni cislo
     * @param vekPojistence      vek pojistence
     */
    public Pojistenec(String jmenoPojistence, String prijmeniPojistence, String telCisloPojistence, int vekPojistence) {
        jmeno = jmenoPojistence;
        prijmeni = prijmeniPojistence;
        telCislo = telCisloPojistence;
        vek = vekPojistence;
        id = ++posledniId; // zvedá unikátní ID o 1
    }

    /*
     * GETTERY A SETTERY
     */

    /**
     * Vracime jmeno pojistence
     *
     * @return jmeno pojistence
     */
    public String getJmenoPojistence() {
        return jmeno;
    }

    /**
     * Vracime prijmeni pojistence
     *
     * @return prijmeni pojistence
     */
    public String getPrijmeniPojistence() {
        return prijmeni;
    }

    /**
     * Prepsani metody na vypis instance
     *
     * @return String.format
     */
    @Override
    public String toString() {
        return String.format("%-4d %-14s %-16s %-6d %-16s", id, jmeno, prijmeni, vek, telCislo);
    }


    }