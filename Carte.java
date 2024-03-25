// Classe Carte
public class Carte {

    private Valeur valeur; //enum Valeur
    private Couleur couleur; //enum Couleur
    private boolean face_visible;


    // Constructeur
    public Carte(Couleur couleur, Valeur valeur){
        this.couleur = couleur;
        this.valeur = valeur;
        face_visible  = true;
    }

    // Méthodes

    public String getCouleur(){
        return couleur.aff_couleur();
        
    }
    public int getValeur(){
        return valeur.aff_valeur();
    }

    public String carte_concat(){
        String str=" ";
        if(face_visible){
            str = str + valeur.aff_valeur() + " de " + couleur.aff_couleur();           
    }   
        else{
            str = "Face cachée";
        }

return str;
        }
};
