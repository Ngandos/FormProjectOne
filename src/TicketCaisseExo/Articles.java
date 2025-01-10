package TicketCaisseExo;

public class Articles {

    private String designation;
    private String ref;
    private int stock;
    private double prixHT;
    private double tva;
    private String marque;
    private String modele;
    private String specifications;

    public Articles(String designation, String ref, int stock, double prixHT, double tva, String marque, String modele, String specifications) {
        this.designation = designation;
        this.ref = ref;
        this.stock = stock;
        this.prixHT = prixHT;
        this.tva = tva;
        this.marque = marque;
        this.modele = modele;
        this.specifications = specifications;
    }

    public String getDesignation() {
        return designation;
    }

    public String getRef() {
        return ref;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public double getTva() {
        return tva;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getSpecifications() {
        return specifications;
    }

    @Override
    public String toString() {
        return "Articles {" +
                "designation='" + designation + '\'' +
                ", ref='" + ref + '\'' +
                ", stock=" + stock +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", specifications='" + specifications + '\'' +
                '}';
    }
}
