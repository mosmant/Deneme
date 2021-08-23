import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        // palindrome olup olmadigini kontrol eden bir program yazin.


        Scanner scan = new Scanner(System.in);
        System.out.printf("Lütfen bir String ifade giriniz: ");
        String str = scan.nextLine();
        String strRev = "";

        for (int i = str.length()-1; i>=0; i--){
            strRev+=str.charAt(i);
        }
        System.out.println("1.yol ile çözümü: "+strRev);
        System.out.println("===========================");
        StringBuilder sb1 = new StringBuilder();
        sb1.append(str);
        sb1.reverse();
        System.out.printf("2.yol ile çözümü: "+sb1);

    }
}