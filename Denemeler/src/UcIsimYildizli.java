public class UcIsimYildizli {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("muhammet osman türker");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i==0) {
                sb2.append(sb.toString().toUpperCase().charAt(i));
            }else if (sb.charAt(i) == ' ') {
                sb2.append(' ');
                sb2.append(sb.toString().toUpperCase().charAt(i+1));
                i++;
            }else {
                sb2.append("*");
            }
        }
        System.out.println(sb2);
    }
}