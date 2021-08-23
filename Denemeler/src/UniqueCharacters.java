import java.util.*;

public class UniqueCharacters {
    /*
     * Bir String icerisinde yinelenen karakterleri döndüren bir kod
     * yazıniz.(mülakat Sorusu)
     * Input :
     * String str=“Javaisalsoeasy”
     * Output: a s
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Lütfen tekrar edilecek harfleri bulmak için bir metin giriniz: ");

        String str = scan.nextLine();

        Set<String> uniqueSet = new HashSet<>(); // SET COLLECTİONS TEKRARLAYAN ELEMANLARI KULLANMAZ.
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {

            } else {
                uniqueSet.add(str.substring(i, i + 1));
            }
        }
        System.out.println(uniqueSet);
    }
}