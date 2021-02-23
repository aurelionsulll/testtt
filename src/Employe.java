public class Employe {

    // private final int matricule;
    private String nom;
    public String adresse;
    public int salaire;

    public Employe( String nom, String adresse, int salaire) {
        this.nom = nom;
        this.adresse = adresse;
        this.salaire = salaire;
    }

    public Employe( String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }



    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getSalaire() {
        return this.salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

}
