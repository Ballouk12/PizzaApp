package ensa.ma.SplashActivity.classes;

public class Produit {
    private int id;
    private String nom ;
    private int nbrIngredients ;
    private int photo;
    private float dure ;
    private String detaisIngredients ;
    private String description ;
    private String preparation ;
    private static int comp=0 ;

    public Produit(int nbrIngredients, float dure, int photo, String nom, String detaisIngredients, String description, String preparation) {
        this.id = ++comp;
        this.nbrIngredients = nbrIngredients;
        this.dure = dure;
        this.photo = photo;
        this.nom = nom;
        this.detaisIngredients = detaisIngredients;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {return id;}

    public String getNom() {return nom;}

    public int getNbrIngredients() {return nbrIngredients;}

    public int getPhoto() {return photo;}

    public float getDure() {return dure;}

    public String getDetaisIngredients() {return detaisIngredients;}

    public String getDescription() {return description;}

    public String getPreparation() {return preparation;}

    public void setNom(String nom) {this.nom = nom;}

    public void setNbrIngredients(int nbrIngredients) {this.nbrIngredients = nbrIngredients;}

    public void setPhoto(int photo) {this.photo = photo;}

    public void setDure(float dure) {this.dure = dure;}

    public void setDetaisIngredients(String detaisIngredients) {this.detaisIngredients = detaisIngredients;}

    public void setDescription(String description) {this.description = description;}

    public void setPreparation(String preparation) {this.preparation = preparation;}
}

