public class String4 {
    public static void main(String[] args){
        /*
        String s="Shruti";
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
         */

    // convert each letter of 1st word to uppercase
    String s="shruti keshri hi, how are you, HellO ";
    s=s.trim();
    s=s.replaceAll("\\s+"," ");
    StringBuilder sb =new StringBuilder(s);
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

for (int i = 1; i < sb.length(); i++) {
    if (sb.charAt(i) == ' ' && i + 1 < sb.length()) {
        sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
    }
    }
    System.out.println(sb);
    }
}
