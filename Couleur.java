public enum Couleur {
    COEUR("Coeur"),
    TREFFLE("Treffle"),
    CARREAU("Carreau"),
    PIQUE("Pique");

    private String def_Couleur;

    // Constructeur
    private Couleur(String def_Couleur) {
        this.def_Couleur = def_Couleur;
    }

    // Méthode
    public String get_couleur() {
        return def_Couleur;
    }

};
