import java.util.Scanner;
public class Main {
    
 

    /*
Logique de jeu
Réalisez les éléments nécessaires, en utilisant vos fonctions, afin de réaliser votre jeu de blackjack. Pour le moment,
la mise est de 10 crédits, et le joueur démarre à 100 crédits. Aucune mise supplémentaire n’est possible en-dehors
de « Double ». Le joueur devra se voir reproposer une partie tant qu’il possède plus que la mise nécessaire.

Implémentez l’assurance : si la première carte du croupier est un As, le joueur a la possibilité de s'assurer
 contre un éventuel blackjack du croupier. Pour cela, le joueur paye la moitié de sa mise initiale. 
 Si le croupier fait blackjack, il reçoit le double de son assurance (et perd sa mise sauf si le joueur 
 à également blackjack, auquel cas, il récupère sa mise), sinon le joueur perd son assurance et le jeu 
 reprend normalement.

 Rappel des règles de victoire :
Les joueurs ayant dépassé 21 points perdent leur mise dans tous les cas.
Les joueurs ayant un blackjack gagnent selon un ratio de 3 pour 2, sauf si le croupier a également un blackjack, auquel cas il y a égalité et les joueurs récupèrent simplement leur mise.
Enfin, pour les joueurs ayant 21 points (sans blackjack) ou moins, le résultat dépend du nombre de points du croupier :
- Si le croupier a dépassé les 21 points, tous les joueurs encore dans le jeu (et donc n'ayant pas dépassé les 21 points) gagnent une fois leur mise.
- Si le croupier a 21 points (sans blackjack) ou moins :
o Les joueurs ayant moins de points que le croupier perdent leur mise ;
o Les joueurs ayant autant de points que le croupier récupèrent simplement leur mise. Dans cette situation, on dit qu'il y a « push »15 ;
o Les joueurs ayant plus de points que le croupier gagnent une fois leur mise.
*/
    public static void main(String[] args) {
        // Génération et mélange du deck
        
        Scanner scanner = new Scanner(System.in);
        int choix_joueur = 0;
        boolean continue_manche = true;
        
        Deck deck = new Deck();
        deck.generer();
        deck.melanger();
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
        System.out.println("\n Le croupier a dèjà un As, vou spouvre également choisir (3)l' Assurance");
            }

    choix_joueur = scanner.nextInt();
    switch (choix_joueur) {
        case 1: // Hit, le joueur prend une carte supplementaire
            deck.distribuer(J1, 1);
            System.out.println("Main du joueur: ");
            System.out.println(J1.montre_main());
            break;
        case 2: // Stand, le joueur décide d’utiliser ses cartes actuelles
            continue_manche = true;
            break;
        case 3: // Assurance
        continue_manche = true;
        assurance_prise = true;
        break;
        default:
            System.out.println("Action invalide. Veuillez choisir une action valide.");
    }


}
   

}



