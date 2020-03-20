import java.util.ArrayList;

public class TexteCoreen {
    protected String texte;
    protected ArrayList<Integer> codePoints;
    protected ArrayList<Jamo> jamo = new ArrayList<>();
    protected ArrayList<Character> traduit = new ArrayList<>();

    public TexteCoreen(String texte) {
        this.texte = texte;
        this.codePoints = setCodePoints(texte);
        for (int i = 0; i < codePoints.size(); i++) {
            Jamo j = new Jamo(codePoints.get(i));
            this.jamo.add(j);
        }
        this.traduit = Traduction.traduire(this.jamo);
    }

    public String toString() {
        return this.texte + "\n" + this.codePoints + "\n" + this.jamo + "\n" + this.traduit;
    }

    public ArrayList<Integer> setCodePoints(String texte) {
        ArrayList<Integer> codePoints = new ArrayList<>();
        for (int i = 0; i < texte.length(); i++) {
            codePoints.add((int) texte.charAt(i));
        }
        return codePoints;
    }

    public int noConsonneInitiale( int position ){
        Jamo j = new Jamo(codePoints.get(position));
        return j.ci;
    }

    public int noVoyelle( int position ) {
        Jamo j = new Jamo(codePoints.get(position));
        return j.vi;
    }

    public int noConsonneFinale( int position ) {
        Jamo j = new Jamo(codePoints.get(position));
        return j.di;
    }

    public String traduire() {
        return "";
    }
}
