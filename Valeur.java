public enum Valeur {
    AS(1, "As"), DEUX(2, "Deux"), TROIS(3, "Trois"), QUATRE(4, "Quatre"),
    CINQ(5, "Cinq"), SIX(6, "Six"), SEPT(7, "Sept"),
    HUIT(8, "Huit"), NEUF(9, "Neuf"), DIX(10, "Dix"),
    VALET(10, "Valet"), DAME(10, "Dame"), ROI(10, "Roi");

    private int carte_valeur;
    private String string_valeur;

    // Constructeur
    private Valeur(int carte_valeur, String string_valeur) {
        this.carte_valeur = carte_valeur;
        this.string_valeur = string_valeur;
    }

    // Méthode
    public int get_valeur() {
        return carte_valeur;
    }

    public String aff_valeur() {
        return string_valeur;
    }
};
