package outils;

/* ========== NE PAS MODIFIER cette classe : outil de test fourni ! ========== */

public class Test {
    public static boolean resultat(int no) throws PersonneInconnueException {
        if (no<1 || no>14) { throw new PersonneInconnueException(); }
        return no % 3 > 1; // 1 personne sur 3 est positive
    }

    public static class PersonneInconnueException extends Exception { }
}