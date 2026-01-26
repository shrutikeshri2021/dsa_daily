import java.util.*;
public class String1 {
    public static void main(String[] args){
        String x="Shruti";
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","mango","banana"};
        String y="Shruti";
        String z = new String("Shruti");

//lexicograpy print largest string
String largest= fruits[0];
for(int i=1;i<fruits.length;i++){
    if (fruits[i].compareTo(largest) > 0) {
    largest = fruits[i];
}
}
System.out.println(largest);

        //String y= sc.nextLine();
        //String x= sc.next();
        //System.out.println(s +" "+x+" "+y+" "+s.length()+" "+s.charAt(2)+" "+s.charAt(5));


//equals vs ==
        /* 
        System.out.println((x==y)?"equal":"not");
        System.out.println((x==z)? "equal":"not");
        System.out.println((x.equals(z)) ? "equal":"not");
*/

//substring 
/*
        String s="";
        for(int i=3;i<6;i++){
            s+=x.charAt(i);
        }
        System.out.println(s);
         */

//substring  direct//
        // System.out.println(x.substring(3,6));
    }
    
}
