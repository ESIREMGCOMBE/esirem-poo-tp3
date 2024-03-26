import java.util.ArrayList;

public class Main_joueur {
private ArrayList<Carte> cartes;

//Constructeur
public Main_joueur(){
    cartes = new ArrayList<Carte>();

}
// Methodes
public void vide_main(){
    cartes.clear();
}
public void tire_carte(Carte carte){
     cartes.add(carte);
}


public String montre_main(){
    String str = "";
    for (Carte c: cartes){
        str = str + c.affiche_carte() + "\n";
    }
    return str;
}

public boolean donne_carte(Carte carte, Main_joueur main_banque){
    if(!cartes.contains(carte)){ //si la carte n'existe pas
        return false;

    }
    else{// si la carte existe
        cartes.remove(carte); // on retire la carte du deck
        main_banque.tire_carte(carte);
        return true;
    }
}

}


