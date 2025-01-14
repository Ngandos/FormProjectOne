package LinkFilesInterfacesExos.NotesBookExos2;

public class ContactSimple implements Contacts {

    protected int id;
    protected String nom;
    protected String nbrPhone;
    protected String adress;

    public ContactSimple(int id, String nom, String nbrPhone, String adress) {
        this.id = id;
        this.nom = nom;
        this.nbrPhone = nbrPhone;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrPhone(String nbrPhone) {
        this.nbrPhone = nbrPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String getNom() {
        return null;
    }

    @Override
    public String getNbrPhone() {
        return null;
    }

    @Override
    public String toString() {
        return "ContactSimple{" +
                "id = " + id +
                ", nom = '" + nom + '\'' +
                ", nbrPhone = '" + nbrPhone + '\'' +
                ", adress = '" + adress + '\'' +
                '}';
    }
}
