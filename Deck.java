// La classe Deck dérive de la classe main_joueur
// classe Deck

import java.util.Random;

public class Deck extends Main_joueur {
Random rand = new Random(); // initialisation générateur de nombres aléatoires pour la méthode melanger()
int tailledeck = 52;

//methode pour créer le deck
public void generer(){
for(Couleur couleur: Couleur.values()){
    for(Valeur valeur: Valeur.values()){
        Carte carte = new Carte(valeur,couleur);
        carte.retourne_carte();
        this.tire_carte(carte);

    }
}
}
//methode pour mélanger le deck
public void melanger(){
for(int i = cartes.size()-1;i >0;i--){ // on parcourt le deck du haut de la pile au début de pile
    int pif = rand.nextInt(i);  // génération d'un nombre aléatoire pour chaque indice du deck
    Carte pifCarte = cartes.get(pif);
    Carte derCarte = cartes.get(i); // échange de la carte d'indice (i) et celle d'indice (pif)
    cartes.set(i,pifCarte);
    cartes.set(pif,derCarte);
}
}

// distribuer cartes
public void  distribuer(Main_joueur J1, int NbCartes){
    for (int i=0; i<NbCartes;i++){
                this.donne_carte(cartes.get(0),J1);
        
    }

}
// retourner cartes
public void retourne_carte(Carte c){    
        c.retourne_carte();
    
}

}


 
 
