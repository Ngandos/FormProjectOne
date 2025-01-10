package InterfaceExos.NotificationsExo;

public class NotificationMain {

    public static void main(String[] args) {

        Notification push1 = new NotificationPush();
        System.out.println();
        System.out.println("Nouvel evenement : " + push1.envoyer("Un nouvel evenement a été crée !!"));
        System.out.println();

        Notification email1 = new NotificationEmail();
        System.out.println("Reunion : " + email1.envoyer("Votre reunion demarre dans 1 heure !!"));
        System.out.println();

        Notification sms = new NotificationSMS();
        System.out.println("Appel manqué : " + sms.envoyer("Vous avez un nouveau message voclae !!"));

    }
}
