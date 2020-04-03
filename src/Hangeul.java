// @author Mathieu Des Lauriers
// @author Maxime Ouellet

/**
* Classe permettant la création d'un objet Hangeul.
*/
public class Hangeul {
    protected int ci;
    protected int vi;
    protected int di;

    /**
     * Cette méthode crée un objet Hangeul à partir de l'unicode d'un caractère coréen.
     *
     * @param ui = unicode d'un caractère coréen.
     */
    public Hangeul(int ui) {
        int ui1 = ui - 44032;
        di = ui1 % 28;
        vi = (1 + ((ui1 - di) % 588) / 28);
        ci = 1 + (ui1 / 588);
    }

    @Override
    public String toString() {
        return "(" + ci + ", " + vi + ", " + di +")";
    }

}
