      
public class Main {
    public static void main(String[] args) {
        // Génération et mélange du deck
        Deck deck = new Deck();
        deck.generer();
        deck.melanger();
        
        // Création des 2 joueurs
        Main_joueur J1 = new Main_joueur();
        Main_joueur BANK = new Main_joueur();

        // Distribution de 2 cartes aux 2 joueurs
        deck.distribuer(J1, 2);
        deck.distribuer(BANK, 2);
        
        // Montre les mains des joueurs
        System.out.println("Main du joueur 1:");
        System.out.println(J1.montre_main());
        System.out.println("Nombre de points: " + J1.calc_points() + "\n");
        
        System.out.println("Main du joueur 2 (BANK):");
        System.out.println(BANK.montre_main());
        System.out.println("Nombre de points: " + BANK.calc_points() + "\n");
    }

}



