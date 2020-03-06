import javax.swing.SwingUtilities;
import java.util.Scanner;

public class Principal {
    public static void main( String arg[] ) {
        //SwingUtilities.invokeLater( () -> new Fenetre() );
        Scanner in = new Scanner(System.in);
        TexteCoreen c1 = new TexteCoreen(in.next());
        //Jamo j = new Jamo (50137);
        System.out.println(c1.jamo);
        //System.out.println((char) 0x0255 + "" + (char) 0x02B0);
    }
}


