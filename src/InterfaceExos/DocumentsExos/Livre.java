package InterfaceExos.DocumentsExos;

public class Livre implements Documents {

    @Override
    public String afficherDetails(String details) {

        return details;

    }

    public String obtenirAuteur(String auteur) {

        return auteur;
    }

}
