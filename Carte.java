// Classe Carte
public class Carte {

    private Valeur valeur; // enum Valeur
    private Couleur couleur; // enum Couleur
    // Constructeur

    public Carte(Valeur valeur, Couleur couleur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    // Méthodes
    public int getValeur() {
        return valeur.get_valeur();
    }

    public String print_valeur() {
        // récupère valeur en tant que chaîne
        // gestions des AS-Roi-Valet-Dame
        if (this.valeur == Valeur.AS) {
            return "As";
        }
        if (this.valeur == Valeur.VALET) {
            return "Valet";
        }
        if (this.valeur == Valeur.DAME) {
            return "Dame";
        }
        if (this.valeur == Valeur.ROI) {
            return "Roi";
        } else {
            return String.valueOf(this.valeur.get_valeur());

        }

    }

    public String getCouleur() {
        return couleur.get_couleur();

    }

    public String affiche_carte() {
        String chain = "";

        chain = chain + this.print_valeur() + " de " + this.couleur.get_couleur();

        return chain;
    }
};
