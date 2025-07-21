package lifeisavictory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeznamPojistencu {

    /**
     * VYTVORENI SEZNAMU POJISTENCU
     */
    private final ArrayList<Pojistenec> seznamPojistencu = new ArrayList<>();


    /**
     * VYTVORENI NOVEHO POJISTENCE
     *
     * @param jmenoPojistence    zadane jmeno
     * @param prijmeniPojistence zadane prijmeni
     * @param telCisloPojistence zadane telefonni cislo
     * @param vekPojistence      zadany vek pojistence
     */
    public void zadejNovehoPojistence(String jmenoPojistence, String prijmeniPojistence, String telCisloPojistence, int vekPojistence) {
        Pojistenec pojistenec = new Pojistenec(jmenoPojistence, prijmeniPojistence, telCisloPojistence, vekPojistence);
        seznamPojistencu.add(pojistenec);
    }


    /**
     * VYPIS VSECH POJISTENCU
     *
     * @return novy nemodifikovatelný List pro vypis
     */
    public List<Pojistenec> vypisVsechnyPojistence() {
        List<Pojistenec> navratovySeznamPojistencu = Collections.unmodifiableList(seznamPojistencu);
        return navratovySeznamPojistencu;
    }


    /**
     * HLEDANI KONKRETNIHO POJISTENCE
     *
     * @param zadaneJmenoPojistence    zadane jmeno
     * @param zadanePrijmenipojistence zadane prijmeni
     * @return novy nemodifikovatelný List pro vypis
     */
    public List<Pojistenec> hledejPojistence(String zadaneJmenoPojistence, String zadanePrijmenipojistence) {
        List<Pojistenec> seznamMetody = new ArrayList<>();
        for (Pojistenec pojistenec : seznamPojistencu) {
            if (pojistenec.getJmenoPojistence().equalsIgnoreCase(zadaneJmenoPojistence)
                    && pojistenec.getPrijmeniPojistence().equalsIgnoreCase(zadanePrijmenipojistence)) {
                seznamMetody.add(pojistenec);
            }
        }
        List<Pojistenec> navratovySeznamPojistencu = Collections.unmodifiableList(seznamMetody);
        return navratovySeznamPojistencu;
    }


}