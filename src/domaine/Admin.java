package domaine;

/* ========== NE PAS MODIFIER cette classe : elle est déjà utilisée par toutes les applic de la HEG ! ========== */

public class Admin extends Personnel {
    private String service;
    private String bureau;

    public Admin(int no, String nom, String prenom, int anneeNaissance, String service, String bureau) {
        super(no, nom, prenom, anneeNaissance);
        this.service = service;
        this.bureau = bureau;
    }

    @Override
    public String getContact() { return "Bureau: " + bureau; }
}