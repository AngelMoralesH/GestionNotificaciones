package test;

import records.EmailNotification;
import records.Notification;
import records.PushNotification;
import records.SmsNotification;

public class Test {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("email@qds.com", "Solicitud", "hola"),
                new SmsNotification("9513459574", "continua"),
                new PushNotification("54d", "me"),
                new PushNotification("adA$#", "you")};

        int correos =0,sms=0,push = 0;


        for(Notification notification : notifications){

            switch (notification){
                case EmailNotification e->{
                    correos++;
//                    System.out.println(correos);
                }
                case SmsNotification s->{
                    sms++;
//                    System.out.println(sms);

                }
                case PushNotification p->{
                    push++;
//                    System.out.println(push);

                }

            }

        }
        System.out.println("========= RESUMEN =========");
        System.out.println("Correos enviados "+ correos);
        System.out.println("Tokens enviados "+ sms);
        System.out.println("Push enviados "+ push);
        System.out.println("Total: " + notifications.length);


    }


}
