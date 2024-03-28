import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        // Génération et mélange du deck
        
        Scanner scanner = new Scanner(System.in);
        int choix_joueur = 0;
        int credit_joueur = 100; // le joueur démarre à 100 crédits

        boolean continue_manche = true;        
        Deck deck = new Deck();

        deck.generer();
        deck.melanger();
        credit_joueur = credit_joueur -10 ; // Pour le moment,la mise est de 10 crédits

        boolean assurance_possible = false;
        boolean assurance_prise = false;        

        // Création des 2 joueurs
        Main_joueur J1 = new Main_joueur();
        Main_joueur BANK = new Main_joueur();

        // Distribution de 2 cartes au joueur
        deck.distribuer(J1, 2);
  
        // Montre la main du joueur
        System.out.println("Main du joueur: ");
        System.out.println(J1.montre_main());

// le croupier tire une carte
deck.distribuer(BANK, 1);

// Montrez cette carte
System.out.println("Première carte du croupier: "+ BANK.montre_carte());

// Vérifiez si la première carte est un As
if(BANK.montre_carte().startsWith("As")){
    // Le croupier a un As comme première carte, on peut proposer une assurance aux joueurs
    assurance_possible = true;    

    }
    // le croupier tire une seconde carte
deck.distribuer(BANK, 1);
System.out.println("Seconde carte du croupier non visible");

    System.out.println("Choisissez une action : (1) Tirer une carte, (2) S'arrêter");
    if(assurance_possible==true){
        System.out.println("\n Le croupier a dèjà un As, vous pouvez également choisir (3)l' Assurance");
            }

    choix_joueur = scanner.nextInt();
    switch (choix_joueur) {
        case 1: // Hit, le joueur prend une carte supplementaire
            deck.distribuer(J1, 1);
            System.out.println("Main du joueur: ");
            System.out.println(J1.montre_main());
            if (J1.calc_points() > 21) {                
                continue_manche = false;
            }
            break;
        case 2: // Stand, le joueur décide d’utiliser ses cartes actuelles
            continue_manche = false;
            break;
        case 3: // Assurance
        continue_manche = false;
        assurance_prise = true;
        break;
        default:
            System.out.println("Action invalide. Veuillez choisir une action valide.");
    }
if(continue_manche == false){
            // Montre la main du joueur
            System.out.println("Main du joueur: ");
            System.out.println(J1.montre_main());

            // Montre la main du croupier
            System.out.println("Main du joueur: ");
            System.out.println(BANK.montre_main());

            int points_joueur = J1.calc_points();
            int points_banque = BANK.calc_points();

            if (points_banque == 21 && assurance_prise && assurance_possible) {
                credit_joueur = credit_joueur + 15; // Récupération de la mise d'assurance 
                System.out.println("La banque a un blackjack. Le joueur récupère sa mise d'assurance, crédit joueur:" + credit_joueur);
            } else if (points_banque == 21 && !assurance_prise) {
                System.out.println("La banque a un blackjack. La banque gagne, crédit joueur:" + credit_joueur);
            } else if (points_joueur > 21) {
                System.out.println("Le joueur a dépassé 21. La banque gagne, crédit joueur:" + credit_joueur);
            } else if (points_banque > 21) {
                credit_joueur = credit_joueur + 20; // J1 gagne 2 fois la mise
                System.out.println("La banque a dépassé 21. Le joueur gagne, crédit joueur:" + credit_joueur);
            } else if (points_joueur == points_banque) { // égalité J1/BANK
                credit_joueur = credit_joueur + 10; // joueur récupère sa mise
                System.out.println("Égalité, crédit joueur:" + credit_joueur);
            } else if (points_joueur > points_banque) {
                credit_joueur = credit_joueur + 20; // joueur gagne 2 fois la mise
                System.out.println("Le joueur gagne, crédit joueur:" + credit_joueur);
            } else {
                System.out.println("La banque gagne, crédit joueur:" + credit_joueur);
            }
}
}
 
}



