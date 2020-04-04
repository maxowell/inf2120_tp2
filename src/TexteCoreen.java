// @author Maxime Ouellet
// @author Mathieu Des Lauriers
import java.util.ArrayList;

/**
 * Logiciel qui traduit un texte coréen en phonétique international.
 *
 * @author Maxime Ouellet
 * @author Mathieu Des Lauriers
 * @version 1.0.0
 */

/**
* Classe permettant la manipulation et la traduction de texte Coréen.
*/
public class TexteCoreen {
    protected String texte;
    protected ArrayList<Integer> codePoints;
    protected ArrayList<Hangeul> hangeul = new ArrayList<>();
    protected ArrayList<String> traduit;

    /**
     * Cette méthode crée un objet TexteCoreen à partir d'une chaine de caractères.
     * @param texte = chaine de caractères coréen.
     */
    public TexteCoreen(String texte) {
        this.texte = texte;
        this.codePoints = setCodePoints(texte);
        for (int i = 0; i < codePoints.size(); i++) {
            Hangeul j = new Hangeul(codePoints.get(i));
            this.hangeul.add(j);
        }
    }

    /**
     * Cette méthode prend une chaine de caractères et place l'unicode de chaque caractère dans un arraylist.
     *
     * @param texte = texte dont on veut obtenir les unicodes de chaque caractère.
     * @return ArrayList<Integer> = liste des unicodes de chaque caractère du texte.
     */
    public ArrayList<Integer> setCodePoints(String texte) {
        ArrayList<Integer> codePoints = new ArrayList<>();
        for (int i = 0; i < texte.length(); i++) {
            codePoints.add((int) texte.charAt(i));
        }
        return codePoints;
    }

    /**
     * Retourne la consonne initiale du Hangeul à la position passée en paramètre
     * @param position = position du hangeul dans le ArrayList de l'objet hangeul.
     * @return La consonne initiale du Hangeul à la position demandée.
     */
    public int noConsonneInitiale( int position ){
        return this.hangeul.get( position ).ci;
    }

    /**
     * Retourne la voyelle du Hangeul à la position passée en paramètre
     * @param position = position du hangeul dans le ArrayList de l'objet hangeul.
     * @return La voyelle du Hangeul à la position demandée.
     */
    public int noVoyelle( int position ) {
        return this.hangeul.get( position ).vi;
    }

    /**
     * Retourne la consonne finale du Hangeul à la position passée en paramètre
     * @param position = position du hangeul dans le ArrayList de l'objet hangeul.
     * @return La consonne finale du Hangeul à la position demandée.
     */
    public int noConsonneFinale( int position ) {
        return this.hangeul.get( position ).di;
    }

    /**
     * Cette méthode traduit l'ArrayList d'hangeuls de l'objet en alphabet internationnal.
     *
     * @return String = suite de caractères représentant la traduction en alphabet internationnal.
     */
    public String traduire() {
        String traduction = "";
        if(this.hangeul.size() > 1)
            this.hangeul = Traduction.remplacerConsonnes(this.hangeul);
        this.traduit = Traduction.traduire(this.hangeul);

        for(int i = 0; i < this.traduit.size(); i++){
            if(this.traduit.get( i ) != "-")
                traduction += this.traduit.get( i );
        }
        return traduction;
    }
}
