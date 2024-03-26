public class Main {
public static void main(String[] args){
    Carte c1,c2;

    c1=new Carte(Valeur.AS,Couleur.CARREAU);
    c2=new Carte(Valeur.CINQ,Couleur.PIQUE);

    System.out.println(c1.affiche_carte() + "\n" + c2.affiche_carte());

}
}
