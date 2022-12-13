package Operatorler;

import java.util.Scanner;

//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni
//girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
//"Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
public class IdPw {
    public static void main(String[] args) {
        String userName, password, select, newPw;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("alper") && password.equals("alper123")) {
            System.out.print("Giriş Yapıldı");
        } else {
            System.out.print("Hatalı Giriş");
            System.out.println("Şifre sıfırlamak ister misiniz => 1 : Evet 2 : Hayır");
            select = input.nextLine();
            if (select.equals("1")) {
                System.out.print("Yeni şifrenizi girin : ");
                newPw = input.nextLine();
                if (newPw.equals("alper123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else {
                    System.out.print("Şifre oluşturuldu");
                }
            } else {
                System.out.print("Tekrar Deneyin");
            }
        }

    }
}
