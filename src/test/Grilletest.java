package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fr.limayrac.b3rpi.model.Grille;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Grille Tester.
 *
 * @author DALLA COSTA LUCAS & BLUZAT CLEMENTT
 * @version 1.0
 */
public class GrilleTest {

    private static final Grille grille = new Grille();


    /**
     * Methode s'exécutant avant les autres tests pour initialiser la grille
     */
    @BeforeAll
    private static void testInitialisation() {
        grille.initGrille(6, 6);
    }


    /**
     * Method: initGrille(int hauteur, int largeur)
     */
    @Test
    public void testInitGrille() throws Exception {

        Grille grille1 = new Grille();
        Grille grille2 = new Grille();
        Grille grille3 = new Grille();
        Grille grille4 = new Grille();

        Assertions.assertTrue(grille1.initGrille(8, 8));
        Assertions.assertFalse(grille2.initGrille(0, 0));
        Assertions.assertFalse(grille3.initGrille(-5, -5));
        Assertions.assertFalse(grille4.initGrille(50, 50));

    }

    /**
     * Method: getHauteur()
     */
    @Test
    public void testGetHauteur() throws Exception {
        Assertions.assertEquals(6, grille.getHauteur());
    }

    /**
     * Method: getLargeur()
     */
    @Test
    public void testGetLargeur() throws Exception {
        Assertions.assertEquals(6, grille.getLargeur());
    }
}

