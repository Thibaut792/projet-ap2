package ville;

public class Ville{

    private String nom; //peut pas etre utiliser hors de la class
    private int nbHabitant;
    private String departement;
    private double superficie;

    //constructeur méthode appeler lors l’instanciation de l’objet
    public Ville(){
        this.departement ="59";
        this.nom= "Valenciennes";
        this.nbHabitant = 43466;
        this.superficie = 13.84;
    }

    //Getter pour acceder au attribut car il sont en privee
    public String getNom(){
        return this.nom; // this = represente l'objet que l'on utilise
    }
    public int getHabitant(){
        return this.nbHabitant;
    }
    public String getDepartement(){
        return this.departement;
    }
    public double getSuperficie(){
        return this.superficie;
    }
    
    
    //Setter ajouter ou modifier ses valeur
    public void setNom(String nom){
        this.nom = nom;// this.nom == attribut // nom a gauche et la nouvelle valeur
    }
    public void setHabitant(int habitant){
        this.nbHabitant = habitant; 
    }
    public void setDepartement(String departement){
        this.departement = departement;
    }
    public void setSuperficie(Double superficie){
        this.superficie = superficie;
    }
}