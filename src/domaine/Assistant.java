package domaine;

/* ========== NE PAS MODIFIER cette classe : elle est déjà utilisée par toutes les applic de la HEG ! ========== */

public class Assistant extends Personnel {
    private String filiere;
    private String email;

    public Assistant(int no, String nom, String prenom, int anneeNaissance, String filiere, String email) {
        super(no, nom, prenom, anneeNaissance);
        this.filiere = filiere;
        this.email = email;
    }

    @Override
    public String getContact() { return "Contact: " + email; }
}