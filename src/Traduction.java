import java.util.ArrayList;

public class Traduction {

    /**
     * Cette méthode traduit les hangeuls d'un arraylist en alphabet internationnal.
     *
     * @param hangeul = ArrayList d'hangeuls à traduire
     * @return ArrayList de strings qui contient la traduction en alphabet internationnal.
     */
    public static ArrayList<String> traduire(ArrayList<Hangeul> hangeul){

        ArrayList<String> traduit = new ArrayList<>();

        for(int i = 0; i < hangeul.size(); i++ ){

            switch ( hangeul.get(i).ci ){
                case 0:
                case 12:
                    traduit.add("\u002D");
                    break;
                case 1:
                    traduit.add("\u006B");
                    break;
                case 2:
                    traduit.add("\u006B\u0324");
                    break;
                case 3:
                    traduit.add("\u006E");
                    break;
                case 4:
                    traduit.add("\u0074");
                    break;
                case 5:
                    traduit.add("\u0074\u0324");
                    break;
                case 6:
                    traduit.add("\u027E");
                    break;
                case 7:
                    traduit.add("\u006D");
                    break;
                case 8:
                    traduit.add("\u0070");
                    break;
                case 9:
                    traduit.add("\u0070\u0324");
                    break;
                case 10:
                    traduit.add("\u0073");
                    break;
                case 11:
                    traduit.add("\u0073\u0324");
                    break;
                case 13:
                    traduit.add("\u0074\u0255");
                    break;
                case 14:
                    traduit.add("\u0074\u0324\u0255");
                    break;
                case 15:
                    traduit.add("\u0074\u0255\u02B0");
                    break;
                case 16:
                    traduit.add("\u006B\u02B0");
                    break;
                case 17:
                    traduit.add("\u0074\u02B0");
                    break;
                case 18:
                    traduit.add("\u0070\u02B0");
                    break;
                case 19:
                    traduit.add("\u0068");
                    break;
                case 20 :
                    traduit.add("\u006C");
                    break;
                case 21 :
                    traduit.add("\u006B\u031A");
                    break;
                case 22 :
                    traduit.add("\u0074\u031A");
                    break;
                case 23:
                    traduit.add("\u0070\u031A");
                    break;
            }

            switch (hangeul.get(i).vi) {
                case 1:
                    traduit.add("\u0061");
                    break;
                case 2:
                    traduit.add("\u025B");
                    break;
                case 3:
                    traduit.add("\u006A\u0061");
                    break;
                case 4:
                    traduit.add("\u006A\u025B");
                    break;
                case 5:
                    traduit.add("\u028C");
                    break;
                case 6:
                    traduit.add("\u0065");
                    break;
                case 7:
                    traduit.add("\u006A\u028C");
                    break;
                case 8:
                    traduit.add("\u006A\u0065");
                    break;
                case 9:
                    traduit.add("\u006F");
                    break;
                case 10:
                    traduit.add("\u0077\u0061");
                    break;
                case 11:
                    traduit.add("\u0077\u025B");
                    break;
                case 12:
                    traduit.add("\u00F8");
                    break;
                case 13:
                    traduit.add("\u006A\u006F");
                    break;
                case 14:
                    traduit.add("\u0075");
                    break;
                case 15:
                    traduit.add("\u0077\u028C");
                    break;
                case 16:
                    traduit.add("\u0077\u0065");
                    break;
                case 17:
                    traduit.add("\u0079");
                    break;
                case 18:
                    traduit.add("\u006A\u0075");
                    break;
                case 19:
                    traduit.add("\u026F");
                    break;
                case 20:
                    traduit.add("\u0270\u0069");
                    break;
                case 21:
                    traduit.add("\u0069");
                    break;
            }

            switch (hangeul.get(i).di) {
                case 0:
                    traduit.add("\u002D");
                    break;
                case 1:
                case 2:
                case 24:
                    traduit.add("\u006B\u031A");
                    break;
                case 3:
                case 9:
                    traduit.add("\u006B");
                    break;
                case 4:
                    traduit.add("\u006E");
                    break;
                case 5:
                    traduit.add("\u006E\u0074\u0255");
                    break;
                case 6:
                    traduit.add("\u006E\u0068");
                    break;
                case 7:
                case 19:
                case 20:
                case 22:
                case 25:
                case 27:
                case 23:
                    traduit.add("\u0074\u031A");
                    break;
                case 21:
                    traduit.add("\u014B");
                    break;
                case 8:
                    traduit.add("\u006C");
                    break;
                case 10:
                case 16:
                    traduit.add("\u006D");
                    break;
                case 11:
                    traduit.add("\u0070");
                    break;
                case 12:
                    traduit.add("\u0073");
                    break;
                case 13:
                    traduit.add("\u0074\u02B0");
                    break;
                case 14:
                    traduit.add("\u0070\u02B0");
                    break;
                case 15:
                    traduit.add("\u0068");
                    break;
                case 17:
                case 18:
                case 26:
                    traduit.add("\u0070\u031A");
                    break;
            }
        }
        return traduit;
    }

    /**
     * Cette méthode fait le remplacement di/ci+1 sur le Arraylist passé en paramètre.
     *
     * @param liste = ArraList de hangeuls dont le remplacement est à faire
     * @return ArrayList de hangeuls avec le remplacement fait
     */
    public static ArrayList<Hangeul> remplacerConsonnes(ArrayList<Hangeul> liste){
        String tabRemplacement[][] = {
                {"1+21","","","4+1","","","7+1","8+1","","","","","","","","16+1","11+1","","7+1","","21+1","7+1","7+1","","7+1","17+1","15+21"},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"21","","","4+3","","","7","8+20","","","","","","","","10+3","10+3","","7+3","4+22","21+3","7+3","7+3","","7+3","17+3","15+3"},
                {"1+4","","3+22","4+1","5+4","4+22","7+22","8+4","9+4","16+4","11+4","8+22","8+17","14+4","8+22","10+4","17+4","17+22","7+22","7+22","21+4","7+22","7+22","1+4","7+22","17+4","15+22"},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"3+3","","","8+20","","","","8+20","","","","","","","","10+3","10+3","","","","4","","","","","",""},
                {"3+7","","","4+7","","","22+7","8+7","","","","","","","","10+7","10+7","","7+7","","21+7","7+7","7+7","1+4","7+7","17+7",""},
                {"3+8","","","","","","","","","","","","","","","","17+23","","19+8","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","0+10","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"3","0+19","3+10","4","4+13","8+19","7","0","8+1","8+7","8+8","8+10","8+17","8+18","8+19","10","17","17+10","12","0","21+19","7+15","7+15","1+19","7+15","17+19","15"},
                {"","","","","","","","","","","","","","","","","","","","7+15","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"","","","","","","","","","","","","","","","","","","","","","","","","","",""},
                {"1","0+19","","4+19","","","7","","0","","","","","","","10+19","17","","7","","21+19","7+15","7+15","1","7","17",""}
        };

        for( int i = 0; i < liste.size() - 1 ; i++) {
            Hangeul hangeul = liste.get(i);
            Hangeul hangeul_suivant = liste.get(i + 1);

            if (hangeul_suivant.ci != 0 && hangeul.di != 0) {
                String remplacement = tabRemplacement[hangeul_suivant.ci - 1][hangeul.di - 1];

                if (remplacement.contains("+")) {
                    String[] s = remplacement.split("\\+");
                    liste.get(i).di = Integer.parseInt(s[0]);
                    liste.get(i+1).ci = Integer.parseInt(s[1]);
                } else if (remplacement.length() != 0) {
                    liste.get(i).di = Integer.parseInt(remplacement);
                    liste.get(i+1).ci = 0;
                }
            }
        }

        return liste;
    }
}