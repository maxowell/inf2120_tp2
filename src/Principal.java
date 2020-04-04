import javax.swing.SwingUtilities;
import java.util.Scanner;

/**
 * Logiciel qui traduit un texte coréen en phonétique international.
 *
 * @author Maxime Ouellet
 * @author Mathieu Des Lauriers
 * @version 1.0.0
 */

public class Principal {
    public static void main( String arg[] ) {
        SwingUtilities.invokeLater( () -> new Fenetre() );
    }
}


