import java.util.Objects;

class Meuble implements Comparable<Meuble>, Cloneable {
    private String nom;

    public String getNom() {
        return nom;
    }

    public String getMateriau() {
        return materiau;
    }

    private String materiau;

    public Meuble(String nom, String materiau) {
        this.nom = nom;
        this.materiau = materiau;
    }

    @Override
    public String toString() {
        return "Meuble [nom=" + nom + ", materiau=" + materiau + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Meuble meuble = (Meuble) obj;
        return nom.equals(meuble.nom) && materiau.equals(meuble.materiau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, materiau);
    }

    @Override
    public Meuble clone() throws CloneNotSupportedException {
        return (Meuble) super.clone();
    }

    @Override
    public int compareTo(Meuble autreMeuble) {
        return this.nom.compareTo(autreMeuble.nom);
    }
}