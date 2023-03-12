package domaine;

/* ========== NE PAS MODIFIER cette classe : elle est déjà utilisée par toutes les applic de la HEG ! ========== */

public class Enseignant extends Personnel {
    private String tel;

    public Enseignant(int no, String nom, String prenom, int anneeNaissance, String tel) {
        super(no, nom, prenom, anneeNaissance);
        this.tel = tel;
    }

    @Override
    public String getContact() { return "Tél: " + tel; }
}