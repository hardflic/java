import java.util.Collections;
import java.util.List;

class GestionnaireMeubles {
    private List<Meuble> meubles;

    public GestionnaireMeubles(List<Meuble> meubles) {
        this.meubles = meubles;
    }

    public void trierMeubles() {
        Collections.sort(meubles);
    }

    public void ajouterMeuble(Meuble meuble) {
        meubles.add(meuble);
    }

    public void supprimerMeuble(Meuble meuble) {
        meubles.remove(meuble);
    }

    public int compterMeubles() {
        return meubles.size();
    }

    public void inverserOrdre() {
        Collections.reverse(meubles);
    }

    public void afficherMeubles() {
        for (Meuble meuble : meubles) {
            System.out.println(meuble);
        }
    }

    public Meuble chercherMeuble(String nom) {
        for (Meuble meuble : meubles) {
            if (meuble.getNom().equals(nom)) {
                return meuble;
            }
        }
        return null;
    }
}