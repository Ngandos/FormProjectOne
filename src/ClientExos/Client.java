package ClientExos;

public class Client {

    private String codeClient;
    private String nom;
    private String email;
    private String telephone;

    public Client() {
    }

    public Client(String codeClient, String nom, String email, String telephone) {
        this.codeClient = codeClient;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public String getCodeClient() {
        return codeClient;
    }
    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client {  " + "codeClient = " + codeClient + ", nom = '" + nom + '\'' + ", email = '" + email + '\'' +
                ", telephone = '" + telephone + '\'' + '}';
    }
}
