import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Meuble> listeMeubles = new ArrayList<>();
        listeMeubles.add(new Meuble("Table", "Bois"));
        listeMeubles.add(new Appartement("Lit", "Métal", 3));
        listeMeubles.add(new Meuble("Chaise", "Plastique"));

        GestionnaireMeubles gestionnaire = new GestionnaireMeubles(listeMeubles);
        gestionnaire.trierMeubles();
        gestionnaire.afficherMeubles();

        }
    }
