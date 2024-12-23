package ArrayExo;

import java.util.HashMap;
import java.util.Map;

public class TeamsCreationExo {

    public static void main(String[] args) {

        String FastersPersons[];
        FastersPersons = new String[4];
        FastersPersons[0] = new String("Fally");
        FastersPersons[1] = new String("Wemba");
        FastersPersons[2] = new String("Koffi");
        FastersPersons[3] = new String("RogaRoga");

        String HeavyFasterPersons[];
        HeavyFasterPersons = new String[4];
        HeavyFasterPersons[0] = new String("Werra");
        HeavyFasterPersons[1] = new String("Innoss");
        HeavyFasterPersons[2] = new String("Robinio");
        HeavyFasterPersons[3] = new String("Yoshi");

        String LowerPersons[];
        LowerPersons = new String[5];
        LowerPersons[0] = new String("Jin");
        LowerPersons[1] = new String("Jun");
        LowerPersons[2] = new String("King");
        LowerPersons[3] = new String("Tabu");
        LowerPersons[4] = new String("Mpela");

        String FirstTeam[];
        FirstTeam = new String[4];
        FirstTeam[0] = new String("");
        FirstTeam[1] = new String("");
        FirstTeam[2] = new String("");
        FirstTeam[3] = new String("");

        String SecondTeam[];
        SecondTeam = new String[4];
        SecondTeam[0] = new String("");
        SecondTeam[1] = new String("");
        SecondTeam[2] = new String("");
        SecondTeam[3] = new String("");

        String ThirdTeam[];
        ThirdTeam = new String[4];
        ThirdTeam[0] = new String("");
        ThirdTeam[1] = new String("");
        ThirdTeam[2] = new String("");
        ThirdTeam[3] = new String("");

        String FourthTeam[];
        FourthTeam = new String[5];
        FourthTeam[0] = new String("");
        FourthTeam[1] = new String("");
        FourthTeam[2] = new String("");
        FourthTeam[3] = new String("");
        FourthTeam[4] = new String("");

        // Tableau des équipes

        String[][] teams = {FirstTeam, SecondTeam, ThirdTeam, FourthTeam};

        // Appel des méthodes pour remplir et afficher les équipes

        remplirEquipes(teams, FastersPersons, HeavyFasterPersons, LowerPersons);
        afficherEquipes(teams);
    }

    public static void remplirEquipes(String[][] teams, String[] FastersPersons, String[] HeavyFasterPersons, String[] LowerPersons) {

        Map<String, Integer> compteurPersonnes = new HashMap<>();
        initialiserCompteur(compteurPersonnes, FastersPersons);
        initialiserCompteur(compteurPersonnes, HeavyFasterPersons);
        initialiserCompteur(compteurPersonnes, LowerPersons);

        String personneDouble = LowerPersons[0];
        compteurPersonnes.put(personneDouble, 0);

        for (int i = 0; i < teams.length - 1; i++) {
            teams[i][0] = choisirEtAssigner(FastersPersons, compteurPersonnes);
            teams[i][1] = choisirEtAssigner(HeavyFasterPersons, compteurPersonnes);
            teams[i][2] = choisirEtAssigner(LowerPersons, compteurPersonnes);
        }
        
        teams[3][0] = choisirEtAssigner(FastersPersons, compteurPersonnes);
        teams[3][1] = choisirEtAssigner(HeavyFasterPersons, compteurPersonnes);
        teams[3][2] = choisirEtAssigner(LowerPersons, compteurPersonnes);
        teams[3][3] = choisirEtAssigner(LowerPersons, compteurPersonnes);
        teams[3][4] = personneDouble;
    }

    private static String choisirEtAssigner(String[] group, Map<String, Integer> compteur) {
        for (String personne : group) {
            if (compteur.get(personne) < 1) {
                compteur.put(personne, compteur.get(personne) + 1);
                return personne;
            }
        }
        return null;
    }

    private static void initialiserCompteur(Map<String, Integer> compteur, String[] persons) {
        for (String personne : persons) {
            compteur.put(personne, 0);
        }
    }

    private static void afficherEquipes(String[][] teams) {
        String[] nomsEquipes = {"FirstTeam", "SecondTeam", "ThirdTeam", "FourthTeam"};
        for (int i = 0; i < teams.length; i++) {
            System.out.println(nomsEquipes[i] + ": ");
            for (String personne : teams[i]) {
                if (personne != null) {
                    System.out.print(personne + " ");
                }
            }
            System.out.println();
        }
    }
}
