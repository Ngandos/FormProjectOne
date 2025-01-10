package InterfaceExos.UsersManagement;

public class Membre implements User {
    private static final String role="membre";
    private String username;

    public Membre(String u){
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
