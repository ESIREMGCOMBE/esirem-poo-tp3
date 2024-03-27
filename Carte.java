// Classe Carte
public class Carte {
    

    private Valeur valeur; //enum Valeur
    private Couleur couleur; //enum Couleur
    public boolean face_visible;

  
    // Constructeur
    public Carte(Valeur valeur,Couleur couleur){
        this.couleur = couleur;
        this.valeur = valeur;
        face_visible  = false;
    }

    // Méthodes
    public int getValeur(){
        return valeur.get_valeur();
    }

    public String print_valeur(){
        // récupère valeur en tant que chaîne 
        // gestions des AS
        if(this.valeur==Valeur.AS){
            return "As";
             }
             else{
                return String.valueOf(this.valeur.get_valeur());

             }
             
    }
    public String affiche_carte(){
        String chain="";

            chain = chain + this.print_valeur() + " de " + this.couleur.get_couleur();           
     


return chain;
        }


    public String getCouleur(){
        return couleur.get_couleur();
        
    }

    public void retourne_carte(){
        face_visible = !face_visible ;
    }


};
