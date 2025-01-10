package InterfaceExos.UsersManagement;

public class Visiteur implements User {
    private static final String role="visiteur";
    private String username;

    public Visiteur(String u){
        this.username = u;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void seConnecter() {
        System.out.println(obtenirRole()+' '+this.getUsername()+" s'est connecté.");
    }

    @Override
    public void seDeconnecter() {
        System.out.println(obtenirRole()+' '+this.getUsername()+" s'est déconnecté.");
    }

    @Override
    public String obtenirRole() {
        return '['+role+']';
    }
}
