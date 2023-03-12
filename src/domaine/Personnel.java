package domaine;

/* ========== NE PAS MODIFIER cette classe : elle est déjà utilisée par toutes les applic de la HEG ! ========== */

public abstract class Personnel {
    private int no;
    private String nom;
    private String prenom;
    private int anneeNaissance;

    public Personnel(int no, String nom, String prenom, int anneeNaissance) {
        this.no = no;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return no == personnel.no;
    }

    @Override
    public int hashCode() { return java.util.Objects.hash(no); }

    @Override
    public String toString() { return prenom + " " + nom + " (" + getAge() + " ans)"; }

    public int getNo() { return no; }
    public int getAge() { return java.time.Year.now().getValue() - anneeNaissance; }
    public abstract String getContact();
}