public class EmployeH extends Employe{
    private final String matricule;
    private int nbHeures = 0;
    private float tarif = 0;


    public EmployeH(String matricule, String nom, String adresse, int nbHeures, float tarif) {
        super(nom, adresse);
        this.matricule = matricule;
        this.nbHeures = nbHeures;
        this.tarif = tarif;
        salaire = (int) (nbHeures * tarif);
    }

    public EmployeH(String matricule, String nom, String adresse) {
        super(nom, adresse);
        this.matricule = matricule;
    }


    @Override
    public void setSalaire(int nb, float tarif) {
        salaire = (int) (nb * tarif);
    }




    // @Override
    // public void setSalaire(int salaire)
    // {   
    //     this.salaire = salaire;
    // }
    
}
