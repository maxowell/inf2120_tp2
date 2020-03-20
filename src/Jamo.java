import java.util.ArrayList;

public class Jamo {
    protected int ci;
    protected int vi;
    protected int di;
    protected ArrayList<Integer> DI = new ArrayList<>();

    public Jamo (int ui) {
        int ui1 = ui - 44032;
        di = ui1 % 28;
        setDI(di);
        vi = (int) (1 + ((ui1 - di) % 588) / 28);
        ci = 1 + (int) (ui1 / 588);
    }

    /**
     * Cette méthode permet d'initiliser l'arraylist DI qui contient les correspondances de ci du hangeul suivant
     * qui indique si une transformation doit avoir lieu.
     *
     * @param di consonne finale du Jamo
     */
    public void setDI(int di) {
        switch (di) {
            case 1 :
            case 17 :
                this.DI.add(1);
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(6);
                this.DI.add(7);
                this.DI.add(8);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 2 :
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 3 :
            case 5 :
            case 6 :
            case 9 :
            case 10 :
            case 11 :
            case 12 :
            case 13 :
            case 14 :
            case 15 :
            case 18 :
                this.DI.add(4);
                this.DI.add(12);
                break;
            case 4 :
            case 8 :
            case 16 :
            case 21 :
                this.DI.add(1);
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(6);
                this.DI.add(7);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 7 :
                this.DI.add(1);
                this.DI.add(4);
                this.DI.add(7);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 19 :
                this.DI.add(1);
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(7);
                this.DI.add(8);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 20 :
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(10);
                this.DI.add(12);
                this.DI.add(13);
                break;
            case 22 :
            case 23 :
            case 25 :
            case 26 :
                this.DI.add(1);
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(7);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 24 :
                this.DI.add(4);
                this.DI.add(7);
                this.DI.add(12);
                this.DI.add(19);
                break;
            case 27 :
                this.DI.add(1);
                this.DI.add(3);
                this.DI.add(4);
                this.DI.add(6);
                this.DI.add(7);
                this.DI.add(12);
                break;
        }
    }

    @Override
    public String toString() {
        return "(" + ci + ", " + vi + ", " + di +")";
    }


}
