import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
    /*
    Soru 1) Kullanicidan email adresini girmesini isteyin,
	mail @gmail.com iceriyorsa “Email adresiniz kaydedildi”,
	icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
	*/
    /*
     bu soruda osman@gmail.com@gmail.com yazınca email adresi gecerli sayılıyor. bunu engelleyiniz.
     çözüm : bu soruda .contains kullanarak @gmail.com içerip içermediğini bulduk ama yetmez kullanıcı 2 kez
     @gmail.com yazarsa bunuda kabul edebilir. .indexof ve .lastindexof metholdarını
     kullanarak ve bunların eşit olup olmadıklarını kontrol ederek doğruladık
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen mail adresinizi giriniz : ");
        String mailAdresi = scan.nextLine();
        String mailCriteria ="@gmail.com";
        int firstIndex = mailAdresi.indexOf(mailCriteria);
        //System.out.println(firstIndex);
        int lastIndex = mailAdresi.lastIndexOf(mailCriteria);
        //System.out.println(lastIndex);
        if (mailAdresi.contains("@gmail.com") && firstIndex==lastIndex){
            System.out.println("Mail adresiniz başarı ile kaydedilmiştir.");
        }else{
            System.out.println("Mail adresiniz kayıt EDİLEMEDİ.");
        }
    }
}