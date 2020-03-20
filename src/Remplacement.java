import java.util.ArrayList;

public class Remplacement {
    public ArrayList<Jamo> remplacer(ArrayList<Jamo> jamo) {
        ArrayList<Jamo> corrige = new ArrayList<>();
        //TODO Appel de methodes de remplacement
        for (int i = 0; i < jamo.size(); i++) {
            if (!remplacementAFaire(jamo.get(i), jamo.get(i + 1))) {
                
            }
        }

        return corrige;
    }

    public boolean remplacementAFaire(Jamo j1, Jamo j2) {
        boolean v = false;
        if (j1.DI.contains(j2.ci)) {
            v = true;
        }
        return v;
    }

}
