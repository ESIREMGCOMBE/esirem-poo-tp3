public enum Valeur {
AS(1),DEUX(2),TROIS(3),QUATRE(4),CINQ(5),SIX(6),SEPT(7),HUIT(8),NEUF(9),DIX(10),VALET(10),DAME(10),ROI(10);

private int carte_valeur;

//Constructeur
private Valeur(int carte_valeur){
    this.carte_valeur = carte_valeur;
}

//Méthode
public int aff_valeur(){
    return carte_valeur;
}
};
