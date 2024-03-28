//Classe Main_joueur
import java.util.ArrayList;

public class Main_joueur {
public ArrayList<Carte> cartes;

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
// methode pour afficher une carte
public String montre_carte(){
    
    String chain = "";
    
    for (Carte c: cartes){
        chain = chain + c.affiche_carte() + "\n";
    }
    return chain;
}
// methode pour affichier les points
public int calc_points(){
    int NbPoints = 0;
    boolean As_en_main = false;
    for(int i=0;i<cartes.size();i++){
        NbPoints = NbPoints + cartes.get(i).getValeur();
        // gestion des As
        if(cartes.get(i).print_valeur()=="As"){
            As_en_main = true;
        }
        // compter As =11 si on peut se le permettre sans dépasser 21
        if(As_en_main && NbPoints<= 11){
            NbPoints = NbPoints + 10; // l'As comptera 1 ou 11 suivant le contexte
                    }
    }
    return NbPoints;
}
// methode pour afficher les cartes et les points lorsqu'elles sont toutes retournées
public String montre_main(){
        String chain = "";
        boolean toutes_visibles = true;
        for (Carte c: cartes){
            chain = chain + c.affiche_carte() + "\n";


    }
            // calcul la valeur de la main si toutes les cartes sont retournées
            if(toutes_visibles){
                chain = chain + " Nombre points:" + calc_points() + "\n";
            }
    return chain;

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



