public class Main {
public static void main(String[] args){

    /* 
    Carte c1,c2;

    c1=new Carte(Valeur.AS,Couleur.CARREAU);
    c2=new Carte(Valeur.CINQ,Couleur.PIQUE);

    // System.out.println(c1.affiche_carte() + "\n" + c2.affiche_carte());


    //retourner cartes

    c1.switch_face();
    c2.switch_face();

    //créer main
    Main_joueur m1 = new Main_joueur();
    Main_joueur m2 = new Main_joueur();
    
    m1.tire_carte(c1);
    m1.tire_carte(c2);
    System.out.println(m1.montre_main());

    m1.donne_carte(c1, m2);
    m1.vide_main();
    System.out.println("m1 est:" + m1.montre_main()+ "m2 est:"+ m2.montre_main());
    */
    // creation du deck
  
   Deck d1=new Deck();
    d1.generer();
    System.out.println("cartes dans le deck:" + d1.montre_main());
}
}

