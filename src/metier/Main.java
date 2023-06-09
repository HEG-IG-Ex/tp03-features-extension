package metier;

import dao.Bdd;
import domaine.Personnel;
import outils.Test;
import outils.TestList;
import outils.TestResult;

import java.util.*;

public class Main {

    /* Méthode principale : teste tout le personnel, affiche les taux, puis contacte le personnel positif d'une catégorie choisie aléatoirement */
    public static void main(String[] args) {
        Map<Integer, TestList<TestResult>> mp = testerToutLePersonnel(Bdd.getLstPersonnel());
        int categorie = (int) (Math.random() * 3);   // choisi aléatoirement une catégorie entre 0 et 2 (pour contacter ces personnes)
        afficherTauxParCategorie(mp, categorie);
        contacterPersonnelPositif(mp, categorie);
    }

    /* Teste tout le personnel, conserve le résultat, puis retourne une collection contenant tous les résultats.
     *  Pour des questions de performance, il est indispensable que la collection retournée comporte 3 listes distinctes,
     *  soit une liste par catégorie (selon l'âge de la personne) ==> categorie = age<25 ? 0 : age>=50 ? 2 : 1; */
    private static Map testerToutLePersonnel(List<Personnel> lstPers) {
        // TODO: vous pouvez bien évidemment changer le type de lst !
        Map<Integer, TestList<TestResult>> mp = new HashMap<>();
        mp.put(0, new TestList<>());
        mp.put(1, new TestList<>());
        mp.put(2, new TestList<>());

        TestResult testResult = null;
        int currentCategory = 0;
        boolean currentResult = false;

        for (Personnel pers : lstPers) {
            // TODO: tester la personne ==> appeler outils.Test.resultat(noPersonne)
            // TODO: conserver le résultat du test de la personne avec (et non pas dans !) la classe Personnel !
            // TODO: ajouter ces infos dans lst, par catégorie (selon l'âge de la personne) ==> categorie = age<25 ? 0 : age>=50 ? 2 : 1;

            currentCategory = pers.getAge() < 25 ? 0 : pers.getAge() >= 50 ? 2 : 1;

            try {
                currentResult = Test.resultat(pers.getNo());
            } catch (Test.PersonneInconnueException PIE) {
                System.out.println(PIE.getMessage());
            }

            testResult = new TestResult(pers, currentResult);
            mp.get(currentCategory).add(testResult);
            mp.get(currentCategory).updatePositiveCounter(currentResult);

        }
        return mp;
    }

    /* Affiche le pourcentage de personnel testé positif de chaque catégorie.
     *  Pour des questions de performance, le pourcentage doit pouvoir être retrouvé(calculé) SANS PARCOURIR la liste des personnes testées !
     *  Comme il doit y avoir une liste de personnes par catégorie (voir la méthode testerToutLePersonnel), le taux est calculé simplement
     *  en divisant le nombre de positifs par le nombre de personnes dans la liste */
    private static void afficherTauxParCategorie(Map<Integer, TestList<TestResult>> mp, int categorie) {
        System.out.println("Pourcentage de personnel testé positif dans la catégorie "
                + categorie + (categorie == 0 ? " (-25 ans)" : categorie == 1 ? " (25-49 ans)" : " (50+ ans)") + " : " +
                +  mp.get(categorie).calculatePositiveProportion() +"%");

    }

    /* Récupère et affiche le contact des personnes positives d'une certaine catégorie (reçue en paramètre) */
    private static void contacterPersonnelPositif(Map<Integer, TestList<TestResult>> mp, int categorie) {
        System.out.println("Personnes positives de la catégorie " + categorie + (categorie == 0 ? " (-25 ans)" : categorie == 1 ? " (25-49 ans)" : " (50+ ans)"));
        // TODO: boucle de récupération des personnes testées d'une certaine catégorie ==> appeler lst.get(categorie)
        // TODO: vérifier si cette personne est positive (cette information a du être conservée avec (et non pas dans !) Personnel)
        // TODO: si oui, afficher la personne ainsi que ses données de contact ==> utiliser getContact()
        for (TestResult tr : mp.get(categorie)) {
            if(tr.isPositive()){
                System.out.println("    - " + tr.getPerson().toString() + " - " + tr.getPerson().getContact());
            }
        }
    }
}