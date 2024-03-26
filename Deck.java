// La classe Deck dérive de la classe main_joueur
public class Deck extends Main_joueur {
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
}
