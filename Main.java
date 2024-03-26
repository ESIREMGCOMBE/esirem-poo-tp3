public class Main {
public static void main(String[] args){
    Carte c1,c2;

    c1=new Carte(Valeur.AS,Couleur.CARREAU);
    c2=new Carte(Valeur.CINQ,Couleur.PIQUE);

    // System.out.println(c1.affiche_carte() + "\n" + c2.affiche_carte());

    //retourner cartes

    c1.switch_face();
    c2.switch_face();

    //créer main
    Main_joueur m1 = new Main_joueur();
    
    m1.tire_carte(c1);
    m1.tire_carte(c2);
    System.out.println(m1.montre_main());

    
}
}
