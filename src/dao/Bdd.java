package dao;

import domaine.*;

import java.util.ArrayList;
import java.util.List;

/* ========== NE PAS MODIFIER cette classe : elle est déjà utilisée par toutes les applic de la HEG ! ========== */

public class Bdd {

    public static List<Personnel> getLstPersonnel() {
        List<Personnel> lst = new ArrayList<>();
        lst.add(new Enseignant(1, "Stettler", "Christian", 1966, "076 676 76 76"));
        lst.add(new Assistant(2, "Gerson", "Steeve", 1998, "IG", "sg@hesge.ch"));
        lst.add(new Admin(3, "Morel", "Cécile", 2000, "Secrétaire IG", "B6.08"));
        lst.add(new Enseignant(4, "Deriaz", "Michel", 1977, "078 888 88 88"));
        lst.add(new Enseignant(5, "Hauri", "Rolf", 1966, "076 767 67 67"));
        lst.add(new Admin(6, "Durafour", "Rémy", 1988, "Centre Info", "B1.09"));
        lst.add(new Enseignant(7, "Courtine", "Nathalie", 1977, "076 555 44 33"));
        lst.add(new Assistant(8, "Schüpbach", "Loïc", 1999, "IG", "ls@hesge.ch"));
        lst.add(new Assistant(9, "Humbert", "Jérôme", 1999, "IG", "jh@hesge.ch"));
        lst.add(new Admin(10, "Neves", "Johny", 1988, "Centre Info", "B1.09"));
        lst.add(new Enseignant(11, "Billard", "David", 1977, "077 777 77 77"));
        lst.add(new Assistant(12, "Roch", "David", 1999, "IG", "dr@hesge.ch"));
        lst.add(new Enseignant(13, "Starkov", "Andrei", 1966, "077 666 55 44"));
        lst.add(new Enseignant(14, "Seydoux", "André", 1977, "079 797 97 97"));
        return lst;
    }
}