package InterfaceExos.UsersManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        ArrayList<User> users = new ArrayList<>();
        String username;
        boolean found;

        users.add(new Admin("Kimia"));
        users.add(new Admin("Nzola"));
        users.add(new Admin("Ngando"));


        users.add(new Membre("Fally"));
        users.add(new Membre("Gaz"));
        users.add(new Membre("Innoss"));

        do {
            System.out.println("============== MENU ==============");
            System.out.println(" 1. Connexion");
            System.out.println(" 2. Voir le rôle");
            System.out.println(" 3. Déconnexion\n");
            System.out.print("> ");

            switch (scan.nextLine().trim()) {

                case "1":
                    System.out.print("Entre le nom d'utilisateur : ");
                    username = scan.nextLine().trim();
                    found = false;
                    for(User user : users){
                        if(user instanceof Admin){
                            if(((Admin)user).getUsername().equals(username)){
                                user.seConnecter();
                                found = true;
                                break;
                            }
                        } else if(user instanceof Membre) {
                            if (((Membre) user).getUsername().equals(username)) {
                                user.seConnecter();
                                found = true;
                                break;
                            }
                        }else if(user instanceof Visiteur) {
                            if (((Visiteur) user).getUsername().equals(username)) {
                                user.seConnecter();
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found) {
                        Visiteur tmpVis = new Visiteur(username);
                        tmpVis.seConnecter();
                        users.add(tmpVis);
                    }
                    break;
                case "2":
                    System.out.print("Entre le nom d'utilisateur : ");
                    username = scan.nextLine().trim();
                    found = false;
                    for(User user : users){
                        if(user instanceof Admin){
                            if(((Admin)user).getUsername().equals(username)){
                                System.out.println("Son rôle est : " + user.obtenirRole());
                                found = true;
                                break;
                            }
                        } else if(user instanceof Membre) {
                            if (((Membre) user).getUsername().equals(username)) {
                                System.out.println("Son rôle est : "+user.obtenirRole());
                                found = true;
                                break;
                            }
                        }else if(user instanceof Visiteur) {
                            if (((Visiteur) user).getUsername().equals(username)) {
                                System.out.println("Son rôle est : "+user.obtenirRole());
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found) {
                        System.out.println("Utilisateur introuvable.");
                    }
                    break;
                case "3":
                    System.out.print("Entre le nom d'utilisateur : ");
                    username = scan.nextLine().trim();
                    found = false;
                    for(User user : users){
                        if(user instanceof Admin){
                            if(((Admin)user).getUsername().equals(username)){
                                user.seDeconnecter();
                                found = true;
                                break;
                            }
                        } else if(user instanceof Membre) {
                            if (((Membre) user).getUsername().equals(username)) {
                                user.seDeconnecter();
                                found = true;
                                break;
                            }
                        }else if(user instanceof Visiteur) {
                            if (((Visiteur) user).getUsername().equals(username)) {
                                user.seDeconnecter();
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found) {
                        System.out.println("Utilisateur introuvable");
                    }
                    break;
                default:
                    System.out.println("Commande non reconnue.\n\n\n");
                    break;
            }
        } while (loop);
    }
}
