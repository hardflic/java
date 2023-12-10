class Appartement extends Meuble {
    private int nombrePieces;

    public Appartement(String nom, String materiau, int nombrePieces) {
        super(nom, materiau);
        this.nombrePieces = nombrePieces;
    }


    @Override
    public String toString() {
        return "Appartement [nom=" + getNom() + ", materiau=" + getMateriau() + ", nombrePieces=" + nombrePieces + "]";
    }
}
