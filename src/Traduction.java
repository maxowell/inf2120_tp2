import java.util.ArrayList;

public class Traduction {

    public static ArrayList<Character> traduire(ArrayList<Jamo> jamo) {

        ArrayList<Character> traduit = new ArrayList<>();

        for (int i = 0; i < jamo.size(); i++) {

            switch (jamo.get(i).ci) {
                case 1:
                    traduit.add((char) 0x006B);
                    break;
                case 2:
                    traduit.add((char) 0x006B);
                    traduit.add((char) 0x0324);
                    break;
                case 3:
                    traduit.add((char) 0x006E);
                    break;
                case 4:
                    traduit.add((char) 0x0074);
                    break;
                case 5:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x0324);
                    break;
                case 6:
                    traduit.add((char) 0x027E);
                    break;
                case 7:
                    traduit.add((char) 0x006D);
                    break;
                case 8:
                    traduit.add((char) 0x0070);
                    break;
                case 9:
                    traduit.add((char) 0x0070);
                    traduit.add((char) 0x0324);
                    break;
                case 10:
                    traduit.add((char) 0x0073);
                    break;
                case 11:
                    traduit.add((char) 0x0073);
                    traduit.add((char) 0x0324);
                    break;
                case 12:
                    traduit.add((char) 0x002D);
                    break;
                case 13:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x0255);
                    break;
                case 14:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x0324);
                    traduit.add((char) 0x0255);
                    break;
                case 15:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x0255);
                    traduit.add((char) 0x02B0);
                    break;
                case 16:
                    traduit.add((char) 0x006B);
                    traduit.add((char) 0x02B0);
                    break;
                case 17:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x02B0);
                    break;
                case 18:
                    traduit.add((char) 0x0070);
                    traduit.add((char) 0x02B0);
                    break;
                case 19:
                    traduit.add((char) 0x0068);
                    break;
            }

            switch (jamo.get(i).vi) {
                case 1:
                    traduit.add((char) 0x0061);
                    break;
                case 2:
                    traduit.add((char) 0x025B);
                    break;
                case 3:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x0061);
                    break;
                case 4:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x025B);
                    break;
                case 5:
                    traduit.add((char) 0x028C);
                    break;
                case 6:
                    traduit.add((char) 0x0065);
                    break;
                case 7:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x028C);
                    break;
                case 8:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x0065);
                    break;
                case 9:
                    traduit.add((char) 0x006F);
                    break;
                case 10:
                    traduit.add((char) 0x0077);
                    traduit.add((char) 0x0061);
                    break;
                case 11:
                    traduit.add((char) 0x0077);
                    traduit.add((char) 0x025B);
                    break;
                case 12:
                    traduit.add((char) 0x00F8);
                    break;
                case 13:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x006F);
                    break;
                case 14:
                    traduit.add((char) 0x0075);
                    break;
                case 15:
                    traduit.add((char) 0x0077);
                    traduit.add((char) 0x028C);
                    break;
                case 16:
                    traduit.add((char) 0x0077);
                    traduit.add((char) 0x0065);
                    break;
                case 17:
                    traduit.add((char) 0x0079);
                    break;
                case 18:
                    traduit.add((char) 0x006A);
                    traduit.add((char) 0x0075);
                    break;
                case 19:
                    traduit.add((char) 0x026F);
                    break;
                case 20:
                    traduit.add((char) 0x0270);
                    traduit.add((char) 0x0069);
                    break;
                case 21:
                    traduit.add((char) 0x0069);
                    break;
            }

            switch (jamo.get(i).di) {
                case 0:
                    traduit.add((char) 0x002D);
                    break;
                case 1:
                case 2:
                case 24:
                    traduit.add((char) 0x006B);
                    traduit.add((char) 0x031A);
                    break;
                case 3:
                case 9:
                    traduit.add((char) 0x006B);
                    break;
                case 4:
                    traduit.add((char) 0x006E);
                    break;
                case 5:
                    traduit.add((char) 0x006E);
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x025B);
                    break;
                case 6:
                    traduit.add((char) 0x006E);
                    traduit.add((char) 0x0068);
                    break;
                case 7:
                case 19:
                case 20:
                case 21:
                case 22:
                case 25:
                case 27:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x031A);
                    break;
                case 8:
                    traduit.add((char) 0x006C);
                    break;
                case 10:
                case 16:
                    traduit.add((char) 0x006D);
                    break;
                case 11:
                    traduit.add((char) 0x0070);
                    break;
                case 12:
                    traduit.add((char) 0x0073);
                    break;
                case 13:
                    traduit.add((char) 0x0074);
                    traduit.add((char) 0x02B0);
                    break;
                case 14:
                    traduit.add((char) 0x0070);
                    traduit.add((char) 0x02B0);
                    break;
                case 15:
                    traduit.add((char) 0x0068);
                    break;
                case 17:
                case 18:
                case 26:
                    traduit.add((char) 0x0070);
                    traduit.add((char) 0x031A);
                    break;
                case 23:
                    traduit.add((char) 0x014B);
                    break;

            }
        }
                return traduit;
    }
}
