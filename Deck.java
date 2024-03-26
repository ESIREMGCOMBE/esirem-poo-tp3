// La classe Deck dérive de la classe main_joueur

import java.util.Random;

public class Deck extends Main_joueur {
    Random rand = new Random();
int tailledeck = 52;
//methode pour créer le deck
public void generer(){
for(Couleur couleur: Couleur.values()){
    for(Valeur valeur: Valeur.values()){
        Carte carte = new Carte(valeur,couleur);
        carte.switch_face();
        this.tire_carte(carte);

    }
}
}
//methode pour mélanger le deck

public void melanger(){
for(int i = cartes.size()-1;i >0;i--){
    int pif = rand.nextInt(i);
    Carte pifCarte = cartes.get(pif);
    Carte derCarte = cartes.get(i);
    cartes.set(i,pifCarte);
    cartes.set(pif,derCarte);
}


}
}

 
